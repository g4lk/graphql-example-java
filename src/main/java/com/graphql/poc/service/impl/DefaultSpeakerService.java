package com.graphql.poc.service.impl;

import java.util.Collection;

import com.graphql.poc.entity.Speaker;
import com.graphql.poc.repository.SpeakerRepository;
import com.graphql.poc.service.SpeakerService;

import org.bson.types.ObjectId;
import org.springframework.stereotype.Service;

import io.leangen.graphql.annotations.GraphQLMutation;
import io.leangen.graphql.annotations.GraphQLNonNull;
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
    @GraphQLQuery
    public Speaker speakerById(@GraphQLNonNull String id) {
        
        return repo.findById(new ObjectId(id)).get();
    }

    @Override
    @GraphQLQuery
    public Collection<Speaker> speakersByCompany(@GraphQLNonNull String company) {
        return repo.findByCompany(company).get();
    }

    @Override
    @GraphQLMutation
    public Speaker updateSpeakerDescription(@GraphQLNonNull String id, @GraphQLNonNull String description) {

        Speaker speaker = repo.findById(new ObjectId(id)).get();
        speaker.setDescription(description);
        repo.save(speaker);

        return speaker;
    }
    
}
