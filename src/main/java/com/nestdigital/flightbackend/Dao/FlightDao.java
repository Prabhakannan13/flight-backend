package com.nestdigital.flightbackend.Dao;

import com.nestdigital.flightbackend.Model.FlightModel;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface FlightDao extends CrudRepository<FlightModel,Integer> {

    @Modifying
    @Query(value = "DELETE FROM `flight` WHERE `id`=:id",nativeQuery = true)
    void deleteFlightById(Integer id);
}
