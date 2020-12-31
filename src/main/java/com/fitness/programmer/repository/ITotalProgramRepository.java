package com.fitness.programmer.repository;

import com.fitness.programmer.model.dto.TotalProgramDto;

import java.util.List;

public interface ITotalProgramRepository {
    List<TotalProgramDto> getAllTotalPrograms(boolean isLazyLoading, String username);

    TotalProgramDto getTotalProgramById(Long id);

    Long postTotalProgram(TotalProgramDto totalProgramDto);

    Long updateTotalProgram(TotalProgramDto totalProgramDto);
}
