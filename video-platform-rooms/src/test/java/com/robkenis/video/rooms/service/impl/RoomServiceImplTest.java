package com.robkenis.video.room.service.impl;

import com.robkenis.video.core.entity.Room;
import com.robkenis.video.room.repository.RoomRepository;
import com.robkenis.video.room.service.RoomService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class RoomServiceImplTest {

    private final RoomRepository repository = mock(RoomRepository.class);
    private RoomService roomService;

    @BeforeEach
    void setUp() {
        roomService = new RoomServiceImpl(repository);
    }

    @Test
    void getAll() {
        when(repository.getAll()).thenReturn(List.of(
                new Room(null, null),
                new Room(null, null),
                new Room(null, null)
        ));
        List<Room> result = roomService.getAll();
        assertThat(result).hasSize(3);
    }
}
