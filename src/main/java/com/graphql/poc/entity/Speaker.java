package com.graphql.poc.entity;

import java.time.LocalDate;
import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Speaker {
    
    @Id
    private ObjectId id;
    private String name;
    private String description;
    private String company;
    private int age;

    @DBRef
    private List<Talk> talks;
}
