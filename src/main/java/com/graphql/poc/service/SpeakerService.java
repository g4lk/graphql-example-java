package com.graphql.poc.service;

import java.util.Collection;

import com.graphql.poc.entity.Speaker;


public interface SpeakerService {
    
    public Collection<Speaker> speakers();

    public Speaker speakerById(String id);

    public Collection<Speaker> speakersByCompany(String company);

    public Speaker updateSpeakerDescription(String id, String description);
}
