package com.fitness.programmer.model.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class BaseEntity {
    @Id
    private Long id;
    private String createdBy;
    private String createdAt;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }
}
