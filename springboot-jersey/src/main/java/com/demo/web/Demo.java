package com.demo.web;

import com.demo.model.City;
import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by Angela on 2017/4/20.
 */
@Component
@Path("/demo")
public class Demo {

    @Path("/city")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public City get(){
        City city = new City();
        city.setId(1L);
        city.setCityName("beijing");
        city.setCityCode("001");
        System.out.println(city.toString());
        return city;
    }



}
