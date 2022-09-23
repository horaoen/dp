package com.horaoen.build.abstract_factory;

import com.horaoen.build.abstract_factory.factories.GUIFactory;
import com.horaoen.build.abstract_factory.factories.MacOSFactory;
import com.horaoen.build.abstract_factory.factories.WindowsFactory;
import org.junit.Test;

/**
 * @author horaoen
 * Application picks the factory type and creates it in run time (usually at
 * initialization stage), depending on the configuration or environment
 * variables.
 */
public class AbstractFactoryTest {
    @Test
    public void basicTest() {
        Application app;
        GUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("mac")) {
            factory = new MacOSFactory();
        } else {
            factory = new WindowsFactory();
        }
        app = new Application(factory);
        
        app.paint();
    }
    
}
