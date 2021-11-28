package com.fitness.programmer.model.mapper;

import com.fitness.programmer.model.dto.DailyProgramDto;
import com.fitness.programmer.model.dto.MoveDto;
import com.fitness.programmer.model.dto.TotalProgramDto;
import com.fitness.programmer.model.dto.WeeklyProgramDto;
import com.fitness.programmer.model.entity.DailyProgramEntity;
import com.fitness.programmer.model.entity.Move;
import com.fitness.programmer.model.entity.TotalProgramEntity;
import com.fitness.programmer.model.entity.WeeklyProgram;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProgrammerServiceMapper {

    TotalProgramEntity dtoToEntity(TotalProgramDto totalProgramDto);

    TotalProgramDto entityToDto(TotalProgramEntity totalProgramEntity);

    List<TotalProgramDto> entityToDtoTotalProgramEntityList(List<TotalProgramEntity> totalProgramEntities);

    List<TotalProgramEntity> dtoToEntityTotalProgramEntityList(List<TotalProgramDto> totalProgramEntities);

    WeeklyProgram dtoToEntity(WeeklyProgramDto weeklyProgramDto);

    WeeklyProgramDto entityToDto(WeeklyProgram totalProgramEntity);

    List<WeeklyProgramDto> entityToDtoWeeklyProgramEntityList(List<WeeklyProgram> totalProgramEntities);

    List<WeeklyProgram> dtoToEntityWeeklyProgramEntityList(List<WeeklyProgramDto> totalProgramEntities);

    DailyProgramEntity dtoToEntity(DailyProgramDto weeklyProgramDto);

    DailyProgramDto entityToDto(DailyProgramEntity totalProgramEntity);

    List<DailyProgramDto> entityToDtoDailyProgramEntityList(List<DailyProgramEntity> totalProgramEntities);

    List<DailyProgramEntity> dtoToEntityDailyProgramEntityList(List<DailyProgramDto> totalProgramEntities);
    Move dtoToEntity(MoveDto moveDto);

    MoveDto entityToDto(Move move);

    List<MoveDto> entityToDtoMoveEntityList(List<Move> move);

    List<Move> dtoToEntityMoveEntityList(List<MoveDto> moveDto);

}
