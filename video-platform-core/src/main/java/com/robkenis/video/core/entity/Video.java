package com.robkenis.video.core.entity;

import java.util.UUID;

public class Video {

    private final String id;
    private final State state;

    public Video() {
        this.id = "video-" + UUID.randomUUID();
        this.state = State.NEW;
    }

    public String getId() {
        return id;
    }

    public State getState() {
        return state;
    }

    public enum State {
        NEW
    }
}
