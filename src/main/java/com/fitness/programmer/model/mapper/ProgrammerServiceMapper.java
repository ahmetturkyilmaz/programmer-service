package com.fitness.programmer.model.mapper;

import com.fitness.programmer.exception.DayNotFoundException;
import com.fitness.programmer.model.dto.DailyProgramDto;
import com.fitness.programmer.model.dto.MoveDto;
import com.fitness.programmer.model.dto.TotalProgramDto;
import com.fitness.programmer.model.dto.WeeklyProgramDto;
import com.fitness.programmer.model.entity.DailyProgramEntity;
import com.fitness.programmer.model.entity.MoveEntity;
import com.fitness.programmer.model.entity.TotalProgramEntity;
import com.fitness.programmer.model.entity.WeeklyProgramEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProgrammerServiceMapper {

    TotalProgramEntity dtoToEntity(TotalProgramDto totalProgramDto);

    TotalProgramDto entityToDto(TotalProgramEntity totalProgramEntity);

    List<TotalProgramDto> entityToDtoTotalProgramEntityList(List<TotalProgramEntity> totalProgramEntities);

    WeeklyProgramEntity dtoToEntity(WeeklyProgramDto weeklyProgramDto);

    WeeklyProgramDto entityToDto(WeeklyProgramEntity weeklyProgramEntity);

    List<WeeklyProgramDto> entityToDtoWeeklyProgramEntityList(List<WeeklyProgramEntity> weeklyProgramEntities);

    DailyProgramEntity dtoToEntity(DailyProgramDto dailyProgramDto) throws DayNotFoundException;

    DailyProgramDto entityToDto(DailyProgramEntity dailyProgramEntity);

    MoveEntity dtoToEntity(MoveDto moveDto);

    MoveDto entityToDto(MoveEntity moveEntity);

}
