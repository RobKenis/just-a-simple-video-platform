package com.robkenis.video.room.service.impl;

import com.robkenis.video.core.entity.Room;
import com.robkenis.video.room.repository.RoomRepository;
import com.robkenis.video.room.service.RoomService;

import java.util.List;

public class RoomServiceImpl implements RoomService {

    private final RoomRepository repository;

    public RoomServiceImpl(RoomRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Room> getAll() {
        return repository.getAll();
    }

}
