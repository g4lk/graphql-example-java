package com.graphql.poc.entity;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Document("speakers")
public class Speaker {
    
    @Id
    private Integer id;
    private String name;
    private String description;
    private String company;
    private int age;

    @DocumentReference(lazy=true)
    private List<Talk> talks;
}
