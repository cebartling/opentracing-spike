package com.pintailconsultingllc.opentracingdemospringboot.controllers;

import com.pintailconsultingllc.opentracingdemospringboot.models.ParticipantModel;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RestController
@RequestMapping(value = "api/v1/participants", produces = "application/json")
public class ParticipantController {

    @GetMapping()
    public @ResponseBody
    ResponseEntity<List<ParticipantModel>> list() {
        List<ParticipantModel> list = Stream.of(
                new ParticipantModel(1, "Christopher", "Bartling")
        ).collect(Collectors.toList());
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @GetMapping(value = "/{id}")
    public @ResponseBody
    ResponseEntity<ParticipantModel> findById(@PathVariable int id) {
        ParticipantModel participantModel = new ParticipantModel(1, "Christopher", "Bartling");
        return new ResponseEntity<>(participantModel, HttpStatus.OK);
    }

    @PostMapping()
    public @ResponseBody
    ResponseEntity create() {
        return new ResponseEntity(HttpStatus.CREATED);
    }

    @PutMapping(value = "/{id}")
    public @ResponseBody
    ResponseEntity update(@PathVariable int id) {
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    @DeleteMapping(value = "/{id}")
    public @ResponseBody
    ResponseEntity delete(@PathVariable int id) {
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }
}
