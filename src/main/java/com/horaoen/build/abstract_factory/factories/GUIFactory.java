package com.horaoen.build.abstract_factory.factories;

import com.horaoen.build.abstract_factory.button.Button;
import com.horaoen.build.abstract_factory.checkbox.Checkbox;

/**
 * @author horaoen
 * Abstract factory knows about all (abstract) product types.
 */
@SuppressWarnings("all")
public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}