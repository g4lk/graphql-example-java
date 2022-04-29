package com.graphql.poc.repository;

import java.util.Collection;
import java.util.Optional;

import com.graphql.poc.entity.Speaker;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SpeakerRepository extends MongoRepository<Speaker,ObjectId> {
    
    public Optional<Collection<Speaker>> findByCompany(String company);
}