package com.graphql.poc.service.impl;

import java.util.List;

import com.graphql.poc.entity.Speaker;
import com.graphql.poc.service.SpeakerService;

import org.bson.types.ObjectId;
import org.springframework.stereotype.Service;

import io.leangen.graphql.spqr.spring.annotations.GraphQLApi;

@Service
@GraphQLApi
public class DefaultSpeakerService implements SpeakerService {

    @Override
    public List<Speaker> speakers() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Speaker speakerById(ObjectId id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Speaker> speakerByCompany(String type, String company) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Speaker> updateSpeakerDescription(ObjectId id, String description) {
        // TODO Auto-generated method stub
        return null;
    }
    
}
