package com.demo.config.jersey;


import com.demo.web.Demo;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

/**
 * Created by Angela on 2017/4/20.
 */
@Component
public class JerseyConfig extends ResourceConfig {

    public JerseyConfig() {
//        register(Demo.class);
        packages("com.demo.web");
    }
}
