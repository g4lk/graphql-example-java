package com.graphql.poc.service;

import java.util.Collection;

import com.graphql.poc.entity.Speaker;

import org.bson.types.ObjectId;

public interface SpeakerService {
    
    public Collection<Speaker> speakers();

    public Speaker speakerById(ObjectId id);

    public Collection<Speaker> speakerByCompany(String type,String company);

    public Collection<Speaker> updateSpeakerDescription(ObjectId id, String description);
}
