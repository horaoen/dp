package com.horaoen.behavior.command.fbSettingWindow;

import lombok.Getter;
import lombok.Setter;

/**
 * @author horaoen
 */
@Getter
@Setter
public class FunctionButton {
    private final String name; 
    private Command command; 

    public FunctionButton(String name) {
        this.name = name;
    }
    
    public void onClick() {
        System.out.print(name + ": 点击功能键,");
        command.execute();
    }
}