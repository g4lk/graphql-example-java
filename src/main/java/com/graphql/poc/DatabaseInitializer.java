package com.graphql.poc;

import java.time.LocalDate;
import java.util.List;

import javax.annotation.PostConstruct;

import com.graphql.poc.entity.Speaker;
import com.graphql.poc.entity.Talk;
import com.graphql.poc.enumeration.TypeEnum;
import com.graphql.poc.repository.SpeakerRepository;
import com.graphql.poc.repository.TalkRepository;

import org.bson.types.ObjectId;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class DatabaseInitializer {
    

    private TalkRepository talkRepository;
    private SpeakerRepository speakerRepository;

    @PostConstruct
	public void init() {

		saveData();
	}

    private void saveData() {
        Speaker speaker1 = new Speaker(1, "Speaker de hacking", "Increible speaker", "MAPFREN'T", 17, null);
        Speaker speaker2 = new Speaker(2, "David Parla", "Increible speaker 2", "MAPFREN'T", 18, null);
        Talk talk = new Talk(1, "Charla de HACKING", "hack the world", TypeEnum.HACKING, null, LocalDate.now() );
        Talk talk2 = new Talk(2, "Charla de PROGRAMMING", "program the world", TypeEnum.PROGRAMMING, null, LocalDate.now() );

        talk.setSpeaker(List.of(speaker1,speaker2));
        talk2.setSpeaker(List.of(speaker2));

        speaker1.setTalks(List.of(talk));
        speaker2.setTalks(List.of(talk, talk2));
        
        talkRepository.save(talk);
        talkRepository.save(talk2);
        speakerRepository.save(speaker1);
        speakerRepository.save(speaker2);

    }
}
