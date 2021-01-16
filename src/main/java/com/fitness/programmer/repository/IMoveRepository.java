package com.fitness.programmer.repository;

import com.fitness.programmer.exception.RequestException;
import com.fitness.programmer.model.dto.MoveDto;

import java.util.List;

public interface IMoveRepository {
    List<MoveDto> findAll(String username);

    MoveDto findById(String id) throws RequestException;

    String updateMove(MoveDto moveDto) throws RequestException;

    MoveDto postMove(MoveDto moveDto);

    String deleteMove(String id);

}
