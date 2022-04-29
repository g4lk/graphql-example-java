package com.graphql.poc.service;

import java.util.Collection;

import com.graphql.poc.entity.Talk;


public interface TalkService {
    
    public Collection<Talk> talks();

    public Talk talkById(String id);

    public Collection<Talk> talksByType(String type);

    public Talk updateTalkDescription(String id, String description);
}
