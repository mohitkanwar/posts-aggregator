package com.mohitkanwar.backend.posts;

import org.junit.jupiter.api.Test;

class PostsAggregatorEngineTest {
    private PostsAggregatorEngine postsAggregatorEngine = new PostsAggregatorEngine();

    @Test
    void should_generate_images_posts_data() {
        postsAggregatorEngine.getPostsMetaInfo("/Users/mohitk/projects/brand-mohit/posts/");
    }
}