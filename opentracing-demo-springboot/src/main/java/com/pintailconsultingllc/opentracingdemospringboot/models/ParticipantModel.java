package com.pintailconsultingllc.opentracingdemospringboot.models;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Builder
@Data
@RequiredArgsConstructor
public class ParticipantModel {

    @NonNull private Integer id;
    @NonNull private String firstName;
    @NonNull private String lastName;
}
