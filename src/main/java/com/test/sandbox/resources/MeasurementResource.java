package com.test.sandbox.resources;

import com.test.sandbox.model.Measurement;
import com.test.sandbox.service.MeasurementService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class MeasurementResource {

    private final MeasurementService measurementService;

    public MeasurementResource(MeasurementService measurementService) {
        this.measurementService = measurementService;
    }

    @GetMapping("/api/measurement")
    private Iterable<Measurement> GetMeasurement() {
        return measurementService.findAll();
    }

    @PostMapping("/api/measurement")
    @ResponseStatus(HttpStatus.CREATED)
    private Measurement SaveMeasurement(@RequestBody Measurement measurement) {
        System.out.println(measurement.toString());
        return measurementService.save(measurement);
    }
}
