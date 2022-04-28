package com.graphql.poc.service;

import java.util.List;

import com.graphql.poc.entity.Talk;

public interface TalkService {
    
    public List<Talk> talks();

    public Talk talkById(String id);

    public List<Talk> talkByType(String type);

    public List<Talk> updateTalkDescription(String id, String description);
}
