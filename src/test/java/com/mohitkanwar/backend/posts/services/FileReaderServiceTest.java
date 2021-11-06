package com.mohitkanwar.backend.posts.services;


import org.junit.jupiter.api.Test;

import java.io.File;
import java.nio.file.Path;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FileReaderServiceTest {
    private final FileReaderService fileReaderService = new LocalFileReaderService();

    @Test
    void should_read_files_in_directory() {
        Path directoryName = Path.of("/Users/mohitk/projects/brand-mohit/posts/");
        List<File> filesInPath = fileReaderService.readAllFilesInPath(directoryName);
        assertNotNull(filesInPath);
        filesInPath.forEach(file -> {
            System.out.println(file.getName());
        });
    }

    @Test
    void should_throw_exception_if_not_a_directory() {
        String fileName = "/Users/mohitk/projects/brand-mohit/posts/dependency inversion principle.gif";
        Path directoryName = Path.of(fileName);

        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            List<File> filesInPath = fileReaderService.readAllFilesInPath(directoryName);
        });

        String expectedMessage = fileName + " is not a directory";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }

}