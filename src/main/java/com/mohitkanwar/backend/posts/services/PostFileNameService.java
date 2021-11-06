package com.mohitkanwar.backend.posts.services;

import java.util.Locale;

public class PostFileNameService implements FileNameService {
    @Override
    public String normalizeFileName(String fileName) {
        return fileName.toLowerCase(Locale.ROOT).replaceAll(" ", "_");
    }
}
