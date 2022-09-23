package com.horaoen.build.abstract_factory;

import com.horaoen.build.abstract_factory.button.Button;
import com.horaoen.build.abstract_factory.checkbox.Checkbox;
import com.horaoen.build.abstract_factory.factories.GUIFactory;

/**
 * @author horaoen
 * Factory users don't care which concrete factory they use since they work with
 * factories and products through abstract interfaces.
 */
public class Application {
    private Button button;
    private Checkbox checkbox;
    
    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }
    
    public void paint() {
        button.paint();
        checkbox.paint();
    }
}
