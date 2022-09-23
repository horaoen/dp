package com.horaoen.build.builder.car;

import com.horaoen.build.builder.component.Engine;
import com.horaoen.build.builder.component.GPSNavigator;
import com.horaoen.build.builder.component.Transmission;
import com.horaoen.build.builder.component.TripComputer;
import lombok.AllArgsConstructor;
import lombok.ToString;

/**
 * @author horaoen
 * Car manual is another product. Note that it does not have the same ancestor
 * as a Car. They are not related.
 */
@AllArgsConstructor
@ToString
public class Manual {
    private final CarType carType;
    private final int seats;
    private final Engine engine;
    private final Transmission transmission;
    private final TripComputer tripComputer;
    private final GPSNavigator gpsNavigator;

    public String print() {
        String info = "";
        info += "Type of car: " + carType + "\n";
        info += "Count of seats: " + seats + "\n";
        info += "Engine: volume - " + engine.getVolume() + "; mileage - " + engine.getMileage() + "\n";
        info += "Transmission: " + transmission + "\n";
        if (this.tripComputer != null) {
            info += "Trip Computer: Functional" + "\n";
        } else {
            info += "Trip Computer: N/A" + "\n";
        }
        if (this.gpsNavigator != null) {
            info += "GPS Navigator: Functional" + "\n";
        } else {
            info += "GPS Navigator: N/A" + "\n";
        }
        return info;
    }
}