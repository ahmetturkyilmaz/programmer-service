package com.fitness.programmer.repository.mongorepository;

import com.fitness.programmer.model.entity.MoveEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface IMoveRepositoryMongo extends MongoRepository<MoveEntity, String> {
    @Query("{createdBy: ?0}")
    List<MoveEntity> findAll(String username);
}
