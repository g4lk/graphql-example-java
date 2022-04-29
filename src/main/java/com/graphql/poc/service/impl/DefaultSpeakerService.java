package com.graphql.poc.service.impl;

import java.util.Collection;
import java.util.List;

import com.graphql.poc.entity.Speaker;
import com.graphql.poc.repository.SpeakerRepository;
import com.graphql.poc.service.SpeakerService;

import org.bson.types.ObjectId;
import org.springframework.stereotype.Service;

import io.leangen.graphql.annotations.GraphQLQuery;
import io.leangen.graphql.spqr.spring.annotations.GraphQLApi;
import lombok.AllArgsConstructor;

@Service
@GraphQLApi
@AllArgsConstructor
public class DefaultSpeakerService implements SpeakerService {

    private SpeakerRepository repo;    

    @Override
    @GraphQLQuery
    public Collection<Speaker> speakers() {
        
        return repo.findAll();
    }

    @Override
    public Speaker speakerById(ObjectId id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Collection<Speaker> speakerByCompany(String type, String company) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Collection<Speaker> updateSpeakerDescription(ObjectId id, String description) {
        // TODO Auto-generated method stub
        return null;
    }
    
}
