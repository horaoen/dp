package com.horaoen.behavior.command.fbSettingWindow;

/**
 * @author horaoen
 */
public class HelpCommand extends Command {
    private final HelpHandler hhObj; 

    public HelpCommand() {
        hhObj = new HelpHandler();
    }
    
    public void execute() {
        hhObj.display();
    }
}