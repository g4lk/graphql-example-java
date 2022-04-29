package com.graphql.poc.service;

import java.util.List;

import com.graphql.poc.entity.Talk;

import org.bson.types.ObjectId;

public interface TalkService {
    
    public List<Talk> talks();

    public Talk talkById(ObjectId id);

    public List<Talk> talkByType(String type);

    public List<Talk> updateTalkDescription(ObjectId id, String description);
}
