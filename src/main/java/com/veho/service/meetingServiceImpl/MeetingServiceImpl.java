package com.veho.service.meetingServiceImpl;

import com.veho.model.Meeting;
import com.veho.repository.MeetingRepository;

import java.util.List;


public class MeetingServiceImpl implements MeetingService {

 private MeetingRepository meetingRepository = new MeetingRepository();

    @Override
    public List<Meeting> listAll() {
        return meetingRepository.allMeeting();
    }

    @Override
    public Meeting findById(String id) {
        return null;
    }

    @Override
    public Meeting saveModel(Meeting model) {
        return null;
    }

    @Override
    public Meeting updateModel(String id, Meeting model) {
        return null;
    }

    @Override
    public Meeting deleteModel(String id) {
        return null;
    }
}
