package com.fitness.programmer.repository.mongorepository;

import com.fitness.programmer.model.entity.TotalProgramEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ITotalProgramRepositoryMongo extends MongoRepository<TotalProgramEntity, String> {

    @Query("{createdBy:?0}")
    List<TotalProgramEntity> findByUsername(String createdBy);
}
