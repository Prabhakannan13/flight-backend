package com.nestdigital.flightbackend.Controller;

import com.nestdigital.flightbackend.Dao.FlightDao;
import com.nestdigital.flightbackend.Model.FlightModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Table;
import javax.transaction.Transactional;
import java.util.List;

@RestController
public class FlightController {

    @Autowired
    private FlightDao dao;

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/addflight",consumes = "application/json",produces = "application/json")
    public String addflight(@RequestBody FlightModel flight){
        System.out.println(flight.toString());
        dao.save(flight);
        return "{status:'success'}";
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/viewflight")
    public List<FlightModel>viewflight(){

        return (List<FlightModel>) dao.findAll();
    }

    @CrossOrigin(origins = "*")
    @Transactional
    @PostMapping(path = "/deleteflight",consumes = "application/json",produces = "application/json")
    public String deleteflight(@RequestBody FlightModel flight){
        dao.deleteFlightById(flight.getId());
        return "{status:'success'}";
    }
    @CrossOrigin(origins = "*")
    @PostMapping(path = "/searchflight",consumes = "application/json",produces = "application/json")
    public List<FlightModel>searchFlight(@RequestBody FlightModel flight){
        return (List<FlightModel>) dao.searchFlight(flight.getOrigin());
    }
}
