package com.robkenis.video.core.entity;

import java.util.UUID;

public class Room {

    private final String id;
    private final Metadata metadata;
    private final Video video;

    public Room(Metadata metadata, Video video) {
        this.id = "room-" + UUID.randomUUID();
        this.metadata = metadata;
        this.video = video;
    }

    public String getId() {
        return id;
    }

    public Metadata getMetadata() {
        return metadata;
    }

    public Video getVideo() {
        return video;
    }

    public record Metadata(String name, Access access) {
    }

    public enum Access {
        PUBLIC, PRIVATE, INVITE
    }
}
