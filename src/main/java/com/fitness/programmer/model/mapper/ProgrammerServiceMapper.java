package com.fitness.programmer.model.mapper;

import com.fitness.programmer.model.dto.MoveDto;
import com.fitness.programmer.model.dto.TotalProgramDto;
import com.fitness.programmer.model.entity.MoveEntity;
import com.fitness.programmer.model.entity.TotalProgramEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProgrammerServiceMapper {

    TotalProgramEntity dtoToEntity(TotalProgramDto totalProgramDto);

    TotalProgramDto entityToDto(TotalProgramEntity totalProgramEntity);

    List<TotalProgramDto> entityToDtoTotalProgramEntityList(List<TotalProgramEntity> totalProgramEntities);

    List<TotalProgramEntity> dtoToEntityTotalProgramEntityList(List<TotalProgramDto> totalProgramEntities);

    MoveEntity dtoToEntity(MoveDto moveDto);

    MoveDto entityToDto(MoveEntity moveEntity);

    List<MoveDto> entityToDtoMoveEntityList(List<MoveEntity> moveEntity);

    List<MoveEntity> dtoToEntityMoveEntityList(List<MoveDto> moveDto);

}
