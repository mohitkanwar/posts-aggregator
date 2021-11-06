package com.mohitkanwar.backend.posts.model;

public enum PostType {

    PRESENTATION("application/vnd.openxmlformats-officedocument.presentationml.presentation"),
    GIF("image/gif"),
    PNG("image/png"),
    JPEG("image/jpeg"),
    PDF("application/pdf"),
    MP4("video/mp4");
    private String value;

    PostType(String mimeType) {
        this.value = mimeType;
    }

    public String getMimeType() {
        return value;
    }
    public static PostType fromString(String text) {
        for (PostType b : PostType.values()) {
            if (b.value.equalsIgnoreCase(text)) {
                return b;
            }
        }
        return null;
    }
}
