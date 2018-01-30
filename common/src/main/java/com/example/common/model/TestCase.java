package com.example.common.model;

import java.time.Instant;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@RequiredArgsConstructor
public class TestCase {
    Instant startTime;
    Instant endTime;
    Instant durationTime;


    public void initStartTime(){
        startTime = Instant.now();
    }

    private void initEndTime(){
        endTime = Instant.now();
    }
    public Instant getDurationTime() {
        initEndTime();
        return endTime.minusSeconds(startTime.getEpochSecond());
    }
}
