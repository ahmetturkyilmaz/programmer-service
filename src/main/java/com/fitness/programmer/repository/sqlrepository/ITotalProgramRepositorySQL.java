package com.fitness.programmer.repository.sqlrepository;

import com.fitness.programmer.model.entity.TotalProgramEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ITotalProgramRepositorySQL extends JpaRepository<TotalProgramEntity, Long> {

    @Query("SELECT u FROM TotalProgramEntity u WHERE u.createdBy = ?1")
    List<TotalProgramEntity> findByUsername(String createdBy);
}
