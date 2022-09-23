package com.horaoen.build.builder.component;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author horaoen
 * Just another feature of a car.
 */
@AllArgsConstructor
@Getter
public class GPSNavigator {
    private String route;

    public GPSNavigator() {
        this.route = "221b, Baker Street, London  to Scotland Yard, 8-10 Broadway, London";
    }
}