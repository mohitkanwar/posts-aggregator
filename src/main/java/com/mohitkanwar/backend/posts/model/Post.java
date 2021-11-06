package com.mohitkanwar.backend.posts.model;

import java.net.URL;
import java.util.Date;

public class Post {
    private long id;
    private Date date;
    private PostType type;
    private String host;
    private URL link;
    private String title;
    private String description;
    private String fileName;

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public PostType getType() {
        return type;
    }

    public void setType(PostType type) {
        this.type = type;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public URL getLink() {
        return link;
    }

    public void setLink(URL link) {
        this.link = link;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Post)) return false;

        Post post = (Post) o;

        if (getId() != post.getId()) return false;
        if (getDate() != null ? !getDate().equals(post.getDate()) : post.getDate() != null) return false;
        if (getType() != post.getType()) return false;
        if (getHost() != null ? !getHost().equals(post.getHost()) : post.getHost() != null) return false;
        if (getLink() != null ? !getLink().equals(post.getLink()) : post.getLink() != null) return false;
        if (getTitle() != null ? !getTitle().equals(post.getTitle()) : post.getTitle() != null) return false;
        if (getDescription() != null ? !getDescription().equals(post.getDescription()) : post.getDescription() != null)
            return false;
        return getFileName() != null ? getFileName().equals(post.getFileName()) : post.getFileName() == null;
    }

    @Override
    public int hashCode() {
        int result = (int) (getId() ^ (getId() >>> 32));
        result = 31 * result + (getDate() != null ? getDate().hashCode() : 0);
        result = 31 * result + (getType() != null ? getType().hashCode() : 0);
        result = 31 * result + (getHost() != null ? getHost().hashCode() : 0);
        result = 31 * result + (getLink() != null ? getLink().hashCode() : 0);
        result = 31 * result + (getTitle() != null ? getTitle().hashCode() : 0);
        result = 31 * result + (getDescription() != null ? getDescription().hashCode() : 0);
        result = 31 * result + (getFileName() != null ? getFileName().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", date=" + date +
                ", type=" + type +
                ", host='" + host + '\'' +
                ", link=" + link +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", fileName='" + fileName + '\'' +
                '}';
    }
}
