package com.fitness.programmer.repository.impl;

import com.fitness.programmer.exception.RequestException;
import com.fitness.programmer.model.dto.TotalProgramDto;
import com.fitness.programmer.model.entity.TotalProgramEntity;
import com.fitness.programmer.model.mapper.ProgrammerServiceMapper;
import com.fitness.programmer.repository.ITotalProgramRepository;
import com.fitness.programmer.repository.mongorepository.ITotalProgramRepositoryMongo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import static org.springframework.data.mongodb.core.query.Criteria.where;

@Repository
public class TotalProgramRepository implements ITotalProgramRepository {
    @Autowired
    private ITotalProgramRepositoryMongo totalProgramRepositoryMongo;
    @Autowired
    ProgrammerServiceMapper mapper;
    @Autowired
    MongoTemplate mongoTemplate;

    @Override
    public List<TotalProgramDto> getAllTotalPrograms(String username) {
        List<TotalProgramEntity> totalProgramEntities = totalProgramRepositoryMongo.findByUsername(username);

        return mapper.entityToDtoTotalProgramEntityList(totalProgramEntities);
    }

    @Override
    public TotalProgramDto getTotalProgramById(String id) throws RequestException {
        Optional<TotalProgramEntity> totalProgramEntity = totalProgramRepositoryMongo.findById(id);
        if (!totalProgramEntity.isPresent()) {
            throw new RequestException("Total program is not found");
        }
        return mapper.entityToDto(totalProgramEntity.get());
    }

    @Override
    public TotalProgramDto postTotalProgram(TotalProgramDto totalProgramDto) {

        TotalProgramEntity totalProgramEntity = mapper.dtoToEntity(totalProgramDto);
        totalProgramEntity.setCreatedAt(new Date());
        TotalProgramEntity storedEntity = totalProgramRepositoryMongo.save(totalProgramEntity);

        return mapper.entityToDto(storedEntity);
    }

    @Override
    public String updateTotalProgram(TotalProgramDto totalProgramDto) throws RequestException {
        TotalProgramDto storedProgram = getTotalProgramById(totalProgramDto.getId());
        totalProgramDto.setVersion(storedProgram.getVersion());
        TotalProgramEntity totalProgramEntity = totalProgramRepositoryMongo.save(mapper.dtoToEntity(totalProgramDto));
        return totalProgramEntity.getId();
    }

    @Override
    public List<TotalProgramDto> getTotalProgramByWeeklyProgramId(String id) {
        Query query = new Query();
        query.addCriteria(where("weeklyPrograms.$id").is(id));

        return mapper.entityToDtoTotalProgramEntityList(mongoTemplate.find(query, TotalProgramEntity.class));
    }


}
