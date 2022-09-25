package com.horaoen.behavior.command.commands;

import com.horaoen.behavior.command.editor.Editor;

/**
 * @author horaoen
 */
public class CopyCommand extends Command {

    public CopyCommand(Editor editor) {
        super(editor);
    }

    @Override
    public boolean execute() {
        editor.clipboard = editor.textField.getSelectedText();
        return false;
    }
}