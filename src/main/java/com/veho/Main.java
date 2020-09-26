package com.veho;
import com.veho.controller.MeetingController;
import com.veho.service.meetingServiceImpl.MeetingServiceImpl;
import com.veho.service.participantServiceImp.ParticipantServiceImpl;

public class Main {
    public static void main(String[] args) {
//        MeetingServiceImpl meetingService = new MeetingServiceImpl();
//        System.out.println(meetingService.listAll().toArray());
        new MeetingController(new MeetingServiceImpl(), new ParticipantServiceImpl());
    }
}