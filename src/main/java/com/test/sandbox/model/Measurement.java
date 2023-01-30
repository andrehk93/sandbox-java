package com.test.sandbox.model;

import org.springframework.data.annotation.Id;

public record Measurement(
        @Id
                long id,
        long ts,
        float temp,
        float humidity,
        float pressure
) {}
