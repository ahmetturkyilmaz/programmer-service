package com.fitness.programmer.model.mapper;

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

    List<TotalProgramEntity> dtoToEntityTotalProgramEntityList(List<TotalProgramDto> totalProgramEntities);

    WeeklyProgramEntity dtoToEntity(WeeklyProgramDto weeklyProgramDto);

    WeeklyProgramDto entityToDto(WeeklyProgramEntity totalProgramEntity);

    List<WeeklyProgramDto> entityToDtoWeeklyProgramEntityList(List<WeeklyProgramEntity> totalProgramEntities);

    List<WeeklyProgramEntity> dtoToEntityWeeklyProgramEntityList(List<WeeklyProgramDto> totalProgramEntities);

    DailyProgramEntity dtoToEntity(DailyProgramDto weeklyProgramDto);

    DailyProgramDto entityToDto(DailyProgramEntity totalProgramEntity);

    List<DailyProgramDto> entityToDtoDailyProgramEntityList(List<DailyProgramEntity> totalProgramEntities);

    List<DailyProgramEntity> dtoToEntityDailyProgramEntityList(List<DailyProgramDto> totalProgramEntities);
    MoveEntity dtoToEntity(MoveDto moveDto);

    MoveDto entityToDto(MoveEntity moveEntity);

    List<MoveDto> entityToDtoMoveEntityList(List<MoveEntity> moveEntity);

    List<MoveEntity> dtoToEntityMoveEntityList(List<MoveDto> moveDto);

}
