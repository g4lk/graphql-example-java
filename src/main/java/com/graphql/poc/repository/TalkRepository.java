package com.graphql.poc.repository;

import java.util.Collection;
import java.util.Optional;

import com.graphql.poc.entity.Talk;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TalkRepository extends MongoRepository<Talk, ObjectId> {
    

    public Optional<Collection<Talk>> findByType(String type);
}
