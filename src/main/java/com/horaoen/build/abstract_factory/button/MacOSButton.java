package com.horaoen.build.abstract_factory.button;


/**
 * @author horaoen
 */
public class MacOSButton implements Button {

    @Override
    public void paint() {
        System.out.println("You have created MacOSButton.");
    }
}