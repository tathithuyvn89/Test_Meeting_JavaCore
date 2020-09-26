package com.veho.controller;

import com.veho.model.Meeting;
import com.veho.service.meetingServiceImpl.MeetingServiceImpl;
import com.veho.service.participantServiceImp.ParticipantServiceImpl;

import static com.veho.configuration.JsonUtil.json;
import static spark.Spark.*;

public class MeetingController {
    public MeetingController ( MeetingServiceImpl meetingService, ParticipantServiceImpl participantService) {
        get("/meetings", (request, response) -> meetingService.listAll(),json());
        get("/meetings/:id", (request, response) -> {
            String id = request.params(":id");
            Meeting meeting = meetingService.findById(id);
            return meeting;
        }, json());
        get("/meetings/:id/participants",(request, response) -> {
            String id = request.params(":id");
            return participantService.listAll();
        },json());
        after((request, response) -> {response.type("application/json");});


    }
}
