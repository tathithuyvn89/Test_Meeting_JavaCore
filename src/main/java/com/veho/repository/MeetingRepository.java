package com.veho.repository;

import com.veho.model.Meeting;

import java.util.*;

public class MeetingRepository {
    static final Map<String, Meeting> meetings = new HashMap<String, Meeting>(){{
        put("8c9ed35b-2fa2-49c5-ab79-31ea20d4ba31",new Meeting("8c9ed35b-2fa2-49c5-ab79-31ea20d4ba31", "12345678",
                "Meeting Name Example",
                "Meeting Description Example", new Date(),
                "13:00", "14:00", "https://us02web.zoom.us/j/00000000000"));
        put("8c9ed35b-2fa2-49c5-ab79-31ea20d4ba312",new Meeting("8c9ed35b-2fa2-49c5-ab79-31ea20d4ba312", "12345678Thuy",
                "Meeting Name Example Thuy",
                "Meeting Description Example Thuy", new Date(),
                "13:00", "14:00", "https://us02web.zoom.us/j/00000000000 Thuy"));
    }};

    public List<Meeting>allMeeting() {
        return new ArrayList<>(meetings.values());
    }


}
