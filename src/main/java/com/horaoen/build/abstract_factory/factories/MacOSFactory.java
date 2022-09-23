package com.horaoen.build.abstract_factory.factories;

import com.horaoen.build.abstract_factory.button.Button;
import com.horaoen.build.abstract_factory.button.MacOSButton;
import com.horaoen.build.abstract_factory.checkbox.Checkbox;
import com.horaoen.build.abstract_factory.checkbox.MacOSCheckbox;

/**
 * @author horaoen
 * Each concrete factory extends basic factory and responsible for creating
 * products of a single variety.
 */
@SuppressWarnings("all")
public class MacOSFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}