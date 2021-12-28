package com.robkenis.video.core.entity;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class VideoTest {

    @Test
    void idStartsWithVideo() {
        Video video = new Video();
        assertThat(video.getId()).startsWith("video-");
    }

    @Test
    void newVideoIsInNewState() {
        Video video = new Video();
        assertThat(video.getState()).isEqualTo(Video.State.NEW);
    }
}
