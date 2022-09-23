package com.horaoen.build.builder.builder;

import com.horaoen.build.builder.car.CarType;
import com.horaoen.build.builder.component.Engine;
import com.horaoen.build.builder.component.GPSNavigator;
import com.horaoen.build.builder.component.Transmission;
import com.horaoen.build.builder.component.TripComputer;

/**
 * @author horaoen
 */
public interface Builder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}