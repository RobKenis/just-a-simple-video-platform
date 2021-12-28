package com.robkenis.video.core.entity;

import java.util.UUID;

public class Video {

    private final String id;

    public Video() {
        this.id = "video-" + UUID.randomUUID().toString();
    }

    public String getId() {
        return id;
    }
}
