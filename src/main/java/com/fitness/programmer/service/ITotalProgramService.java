package com.fitness.programmer.service;

import com.fitness.programmer.exception.RequestException;
import com.fitness.programmer.model.dto.ProgramCreateRequestDto;
import com.fitness.programmer.model.dto.TotalProgramDto;

import java.util.List;

public interface ITotalProgramService {

    List<TotalProgramDto> getAllTotalPrograms(String username);


    TotalProgramDto getTotalProgramById(String id) throws RequestException;

    TotalProgramDto postTotalProgram(ProgramCreateRequestDto createRequestDto) throws RequestException;

    String updateTotalProgramHandleDBRefs(TotalProgramDto totalProgramDto) throws RequestException;

}
