package com.mohitkanwar.backend.posts;

import com.mohitkanwar.backend.posts.model.Post;
import com.mohitkanwar.backend.posts.model.PostType;
import com.mohitkanwar.backend.posts.services.FileNameService;
import com.mohitkanwar.backend.posts.services.FileReaderService;
import com.mohitkanwar.backend.posts.services.LocalFileReaderService;
import com.mohitkanwar.backend.posts.services.PostFileNameService;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class PostsAggregatorEngine {
    private final FileReaderService fileReaderService = new LocalFileReaderService();
    private final FileNameService fileNameService = new PostFileNameService();

    public List<Post> getPostsMetaInfo(String directoryName) {
        Path directory = Path.of(directoryName);
        List<File> files = fileReaderService.readAllFilesInPath(directory);
        List<Post> posts = files.stream()
                .filter(file -> !file.isHidden())
                .sorted(Comparator.comparingLong(File::lastModified))
                .map(file -> {
                    Post post = new Post();

                    try {
                        String type = Files.probeContentType(file.toPath());
                        post.setId(file.lastModified());
                        post.setType(PostType.fromString(type));
                        post.setDate(new Date(file.lastModified()));
                        post.setFileName(fileNameService.normalizeFileName(file.getName()));
                        System.out.print(post);
                    } catch (IOException e) {

                    }
                    //post.setType(type);
                    return post;
                }).collect(Collectors.toList());
        return posts;
    }
}
