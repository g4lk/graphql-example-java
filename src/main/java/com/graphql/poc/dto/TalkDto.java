package com.graphql.poc.dto;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

import com.graphql.poc.entity.Talk;
import com.graphql.poc.enumeration.TypeEnum;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TalkDto {
    
    private String id;
    private String name;
    private String description;
    private TypeEnum type;

    
    private List<SpeakerDto> speakers;

    private LocalDate date;


    public TalkDto(Talk talk) {
        this.id = talk.getId().toString();
        this.name = talk.getName();
        this.description = talk.getDescription();
        this.type = talk.getType();
        this.date = talk.getDate();
        this.speakers = talk.getSpeaker().stream().map(SpeakerDto::new).collect(Collectors.toList());
    }
}
