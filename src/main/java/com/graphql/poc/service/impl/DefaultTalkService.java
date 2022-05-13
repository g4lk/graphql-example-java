package com.graphql.poc.service.impl;

import java.util.Collection;
import java.util.stream.Collectors;

import com.graphql.poc.dto.TalkDto;
import com.graphql.poc.entity.Talk;
import com.graphql.poc.repository.TalkRepository;
import com.graphql.poc.service.TalkService;

import org.bson.types.ObjectId;
import org.springframework.stereotype.Service;

import io.leangen.graphql.annotations.GraphQLMutation;
import io.leangen.graphql.annotations.GraphQLNonNull;
import io.leangen.graphql.annotations.GraphQLQuery;
import io.leangen.graphql.spqr.spring.annotations.GraphQLApi;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
@GraphQLApi
public class DefaultTalkService implements TalkService {

    private TalkRepository repo;

    @Override
    @GraphQLQuery
    public Collection<TalkDto> talks() {
        
        return repo.findAll().stream().map(TalkDto::new).collect(Collectors.toList());
    }

    @Override
    @GraphQLQuery
    public TalkDto talkById(@GraphQLNonNull String id) {
        
        return new TalkDto(repo.findById(new ObjectId(id)).get());
    }

    @Override
    @GraphQLQuery
    public Collection<TalkDto> talksByType(@GraphQLNonNull String type) {
        
        return repo.findByType(type).get().stream().map(TalkDto::new).collect(Collectors.toList());
    }

    @Override
    @GraphQLMutation
    public TalkDto updateTalkDescription(String id, String description) {
        Talk talk = repo.findById(new ObjectId(id)).get();
        talk.setDescription(description);
        repo.save(talk);

        return new TalkDto(talk);
    }
    
}
