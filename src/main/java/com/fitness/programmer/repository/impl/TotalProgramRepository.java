package com.fitness.programmer.repository.impl;

import com.fitness.programmer.exception.RequestException;
import com.fitness.programmer.model.dto.DailyProgramDto;
import com.fitness.programmer.model.dto.TotalProgramDto;
import com.fitness.programmer.model.dto.WeeklyProgramDto;
import com.fitness.programmer.model.entity.TotalProgramEntity;
import com.fitness.programmer.model.mapper.ProgrammerServiceMapper;
import com.fitness.programmer.repository.ITotalProgramRepository;
import com.fitness.programmer.repository.mongorepository.ITotalProgramRepositoryMongo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.util.CollectionUtils;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Repository
public class TotalProgramRepository implements ITotalProgramRepository {
    @Autowired
    private ITotalProgramRepositoryMongo totalProgramRepositorySQL;
    @Autowired
    ProgrammerServiceMapper mapper;

    @Override
    public List<TotalProgramDto> getAllTotalPrograms(String username) {
        List<TotalProgramEntity> totalProgramEntities = totalProgramRepositorySQL.findByUsername(username);

        return mapper.entityToDtoTotalProgramEntityList(totalProgramEntities);
    }

    @Override
    public TotalProgramDto getTotalProgramById(String id) throws RequestException {
        Optional<TotalProgramEntity> totalProgramEntity = totalProgramRepositorySQL.findById(id);
        if (!totalProgramEntity.isPresent()) {
            throw new RequestException("Total program is not found");
        }
        return mapper.entityToDto(totalProgramEntity.get());
    }

    @Override
    public TotalProgramDto postTotalProgram(TotalProgramDto totalProgramDto) {

        TotalProgramEntity totalProgramEntity = mapper.dtoToEntity(totalProgramDto);
        totalProgramEntity.setCreatedAt(new Date().getTime());
        TotalProgramEntity storedEntity = totalProgramRepositorySQL.save(totalProgramEntity);

        return mapper.entityToDto(storedEntity);
    }

    @Override
    public String updateTotalProgram(TotalProgramDto totalProgramDto) throws RequestException {
        TotalProgramDto storedProgram = getTotalProgramById(totalProgramDto.getId());
        totalProgramDto.setVersion(storedProgram.getVersion());
        TotalProgramEntity totalProgramEntity = totalProgramRepositorySQL.save(mapper.dtoToEntity(totalProgramDto));
        return totalProgramEntity.getId();
    }

}
