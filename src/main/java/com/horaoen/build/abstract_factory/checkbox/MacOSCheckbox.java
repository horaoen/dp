package com.horaoen.build.abstract_factory.checkbox;

/**
 * @author horaoen
 */
public class MacOSCheckbox implements Checkbox {

    @Override
    public void paint() {
        System.out.println("You have created MacOSCheckbox.");
    }
}