package com.graphql.poc.entity;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import com.graphql.poc.enumeration.TypeEnum;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Talk {
    
    @Id
    private ObjectId id;
    private String name;
    private String description;
    private TypeEnum type;

    @DBRef
    private List<Speaker> speaker;

    private LocalDate date;


}
