package com.graphql.poc.service;

import java.util.Collection;

import com.graphql.poc.dto.SpeakerDto;


public interface SpeakerService {
    
    public Collection<SpeakerDto> speakers();

    public SpeakerDto speakerById(String id);

    public Collection<SpeakerDto> speakersByCompany(String company);

    public SpeakerDto updateSpeakerDescription(String id, String description);
}
