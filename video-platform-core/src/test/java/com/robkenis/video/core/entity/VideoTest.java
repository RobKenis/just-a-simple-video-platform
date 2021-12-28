package com.robkenis.video.core.entity;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class VideoTest {

    @Test
    void idStartsWithVideo() {
        Video video = new Video();
        assertThat(video.getId()).startsWith("video-");
    }
}
