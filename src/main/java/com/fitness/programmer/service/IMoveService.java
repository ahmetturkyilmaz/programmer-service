package com.fitness.programmer.service;

import com.fitness.programmer.exception.RequestException;
import com.fitness.programmer.model.dto.MoveDto;
import com.fitness.programmer.model.dto.TotalProgramDto;

import java.util.List;

public interface IMoveService {
    String updateMove(MoveDto moveDto) throws RequestException;

    MoveDto postMove(MoveDto moveDto);

    MoveDto getMoveById(String id) throws RequestException;

    List<MoveDto> getMoves(String username);

    String deleteMove(String id);
}
