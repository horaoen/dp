package com.horaoen.behavior.command.editorWindow.commands;

import com.horaoen.behavior.command.editorWindow.editor.Editor;

/**
 * @author horaoen
 */
public abstract class Command {
    public Editor editor;
    private String backup;

    Command(Editor editor) {
        this.editor = editor;
    }

    void backup() {
        backup = editor.textField.getText();
    }

    public void undo() {
        editor.textField.setText(backup);
    }

    public abstract boolean execute();
}