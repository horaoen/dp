package com.horaoen.build.abstract_factory.factories;

import com.horaoen.build.abstract_factory.button.Button;
import com.horaoen.build.abstract_factory.button.WindowsButton;
import com.horaoen.build.abstract_factory.checkbox.Checkbox;
import com.horaoen.build.abstract_factory.checkbox.WindowsCheckbox;

/**
 * @author horaoen
 * Each concrete factory extends basic factory and responsible for creating
 * products of a single variety.
 */
public class WindowsFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}