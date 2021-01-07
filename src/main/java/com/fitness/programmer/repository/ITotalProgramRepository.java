package com.fitness.programmer.repository;

import com.fitness.programmer.exception.RequestException;
import com.fitness.programmer.model.dto.TotalProgramDto;

import java.util.List;

public interface ITotalProgramRepository {

    List<TotalProgramDto> getAllTotalPrograms( String username);

    TotalProgramDto getTotalProgramById(String id) throws RequestException;

    String postTotalProgram(TotalProgramDto totalProgramDto);

    String updateTotalProgram(TotalProgramDto totalProgramDto) throws RequestException;
}
