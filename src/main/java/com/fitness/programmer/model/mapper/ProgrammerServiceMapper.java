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
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.persistence.Inheritance;
import java.util.List;

@Mapper(componentModel="spring")
public interface ProgrammerServiceMapper {

    TotalProgramEntity dtoToEntity(TotalProgramDto totalProgramDto);

    TotalProgramDto entityToDto(TotalProgramEntity totalProgramEntity);

    List<TotalProgramDto> entityToDto(List<TotalProgramEntity> totalProgramEntities);

    WeeklyProgramEntity dtoToEntity(WeeklyProgramDto weeklyProgramDto);

    WeeklyProgramDto entityToDto(WeeklyProgramEntity weeklyProgramEntity);

    DailyProgramEntity dtoToEntity(DailyProgramDto dailyProgramDto);

    DailyProgramDto entityToDto(DailyProgramEntity dailyProgramEntity);

    MoveEntity dtoToEntity(MoveDto moveDto);

    MoveDto entityToDto(MoveEntity moveEntity);

}
