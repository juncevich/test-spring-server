package com.example.common.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.time.Instant;

@Data
@Builder
@AllArgsConstructor
@RequiredArgsConstructor
public class TestCase {
    private Instant startTime;
    private Instant endTime;
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
