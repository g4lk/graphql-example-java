package com.graphql.poc.dto;

import java.util.List;
import java.util.stream.Collectors;

import com.graphql.poc.entity.Speaker;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SpeakerDto {
    
    private String id;
    private String name;
    private String description;
    private String company;
    private int age;

    private List<TalkDto> talks;

    public SpeakerDto(Speaker s) {
        this.id = s.getId().toString();
        this.name = s.getName();
        this.description = s.getDescription();
        this.company = s.getCompany();
        this.age = s.getAge();
        this.talks = s.getTalks().stream().map(TalkDto::new).collect(Collectors.toList());

    }
}
