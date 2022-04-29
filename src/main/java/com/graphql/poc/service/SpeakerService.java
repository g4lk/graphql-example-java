package com.graphql.poc.service;

import java.util.List;

import com.graphql.poc.entity.Speaker;

import org.bson.types.ObjectId;

public interface SpeakerService {
    
    public List<Speaker> speakers();

    public Speaker speakerById(ObjectId id);

    public List<Speaker> speakerByCompany(String type,String company);

    public List<Speaker> updateSpeakerDescription(ObjectId id, String description);
}
