package com.mohitkanwar.backend.posts.services;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FileNameServiceTest {
    private FileNameService fileNameService = new PostFileNameService();

    @Test
    void should_lowercase(){
        String capital = "CAPITAL.GIF";
        assertEquals("capital.gif", fileNameService.normalizeFileName(capital));
    }

    @Test
    void should_replace_space_with_underscore(){
        String capital = "there is a space here.gif";
        assertEquals("there_is_a_space_here.gif", fileNameService.normalizeFileName(capital));
    }

}