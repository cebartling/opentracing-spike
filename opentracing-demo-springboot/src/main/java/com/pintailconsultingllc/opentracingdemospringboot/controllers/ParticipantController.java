package com.pintailconsultingllc.opentracingdemospringboot.controllers;

import com.pintailconsultingllc.opentracingdemospringboot.models.ParticipantModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RestController
@RequestMapping("api/v1/participants")
public class ParticipantController {

    @GetMapping(produces = "application/json")
    public List<ParticipantModel> list() {
        return Stream.of(new ParticipantModel(1, "Christopher", "Bartling")).collect(Collectors.toList());
    }
}
