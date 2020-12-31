package com.fitness.programmer.service;

import com.fitness.programmer.model.dto.TotalProgramDto;

import java.util.List;

public interface ITotalProgramService {

    List<TotalProgramDto> getAllTotalPrograms(boolean isLazyLoading, String username);


    TotalProgramDto getTotalProgramById(Long id);

    Long postTotalProgram(TotalProgramDto totalProgramDto);

    Long updateTotalProgram(TotalProgramDto totalProgramDto);
}
