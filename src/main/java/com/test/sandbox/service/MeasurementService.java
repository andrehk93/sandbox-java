package com.test.sandbox.service;

import com.test.sandbox.model.Measurement;
import org.springframework.data.repository.CrudRepository;

public interface MeasurementService extends CrudRepository<Measurement, Long> {}
