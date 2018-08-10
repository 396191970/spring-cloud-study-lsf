package com.tuobuxie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

/**
 * @author lishaofeng
 */
@EnableTurbine
@EnableHystrixDashboard
@SpringBootApplication
public class TurbineStreamRabbitmqApplication {

    public static void main(String[] args) {
        SpringApplication.run(TurbineStreamRabbitmqApplication.class, args);
    }

}
