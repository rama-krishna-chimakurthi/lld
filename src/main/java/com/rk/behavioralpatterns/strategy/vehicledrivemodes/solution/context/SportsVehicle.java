package com.rk.behavioralpatterns.strategy.vehicledrivemodes.solution.context;

import com.rk.behavioralpatterns.strategy.vehicledrivemodes.solution.strategies.DriveStrategy;

// Concrete context subclass
public class SportsVehicle extends Vehicle {

    public SportsVehicle(DriveStrategy driveStrategy) {
        super(driveStrategy);
    }
}
