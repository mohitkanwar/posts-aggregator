package com.mohitkanwar.backend.posts;

import java.io.File;
import java.nio.file.Path;
import java.util.List;

public interface FileReaderService {
    List<File> readAllFilesInPath(Path directoryName);
}
