package com.nestdigital.flightbackend.Controller;

import com.nestdigital.flightbackend.Dao.FlightDao;
import com.nestdigital.flightbackend.Model.FlightModel;
import org.apache.catalina.LifecycleState;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    private List<FlightModel>viewflight(){
        return (List<FlightModel>) dao.findAll();
    }
}
