package com.horaoen.build.abstract_factory.button;

/**
 * @author horaoen
 */
public class WindowsButton implements Button {

    @Override
    public void paint() {
        System.out.println("You have created WindowsButton.");
    }
}