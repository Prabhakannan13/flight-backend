package com.nestdigital.flightbackend.Dao;

import com.nestdigital.flightbackend.Model.FlightModel;
import org.springframework.data.repository.CrudRepository;

public interface FlightDao extends CrudRepository<FlightModel,Integer> {
}
