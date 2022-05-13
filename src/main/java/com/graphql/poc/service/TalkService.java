package com.graphql.poc.service;

import java.util.Collection;

import com.graphql.poc.dto.TalkDto;



public interface TalkService {
    
    public Collection<TalkDto> talks();

    public TalkDto talkById(String id);

    public Collection<TalkDto> talksByType(String type);

    public TalkDto updateTalkDescription(String id, String description);
}
