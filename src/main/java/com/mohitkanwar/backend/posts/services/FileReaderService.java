package com.mohitkanwar.backend.posts.services;

import java.io.File;
import java.nio.file.Path;
import java.util.List;

public interface FileReaderService {
    List<File> readAllFilesInPath(Path directoryName);
}
