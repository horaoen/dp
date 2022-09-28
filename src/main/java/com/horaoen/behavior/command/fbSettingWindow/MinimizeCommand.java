package com.horaoen.behavior.command.fbSettingWindow;

/**
 * @author horaoen
 */
public class MinimizeCommand extends Command {
	private WindowHandler whObj; 
	
	public MinimizeCommand() {
		whObj = new WindowHandler();
	}
	
	public void execute() {
		whObj.minimize();
	}
}