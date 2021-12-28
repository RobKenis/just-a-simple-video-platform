package com.robkenis.video.core.entity;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class RoomTest {

    @Test
    void newRoomWithSingleVideo() {
        Room room = new Room(
                new Room.Metadata("My first room with a single video", Room.Access.PUBLIC),
                new Video()
        );
        assertThat(room.getId()).startsWith("room-");
    }
}
