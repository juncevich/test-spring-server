package com.example.common.model;

import java.time.Instant;

import lombok.Data;

@Data
public class TestCase {
    Instant startTime;
    Instant endTime;
    Instant durationTime;
}
