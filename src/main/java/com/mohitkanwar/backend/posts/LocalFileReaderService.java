package com.mohitkanwar.backend.posts;

import java.io.File;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class LocalFileReaderService implements FileReaderService {
    @Override
    public List<File> readAllFilesInPath(Path directoryName) {
        File parentDirectory = directoryName.toFile();
        if (!parentDirectory.isDirectory()) {
            throw new IllegalArgumentException(String.format("%s is not a directory", directoryName));
        }
        return Arrays.asList(Objects.requireNonNull(parentDirectory.listFiles()));
    }
}
