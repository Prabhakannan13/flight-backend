package com.nestdigital.flightbackend.Dao;

import com.nestdigital.flightbackend.Model.FlightModel;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface FlightDao extends CrudRepository<FlightModel,Integer> {

    @Modifying
    @Query(value = "DELETE FROM `flight` WHERE `id`=:id",nativeQuery = true)
    void deleteFlightById(Integer id);
@Query(value = "SELECT `id`, `capacity`, `destination`, `flightname`, `origin` FROM `flight` WHERE `origin`=:origin",nativeQuery = true)
    List<FlightModel>searchFlight(String origin);
}
