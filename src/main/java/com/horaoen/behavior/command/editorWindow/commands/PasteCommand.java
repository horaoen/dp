package com.horaoen.behavior.command.editorWindow.commands;

import com.horaoen.behavior.command.editorWindow.editor.Editor;

/**
 * @author horaoen
 */
public class PasteCommand extends Command {

    public PasteCommand(Editor editor) {
        super(editor);
    }

    @Override
    public boolean execute() {
        if (editor.clipboard == null || editor.clipboard.isEmpty()) {
            return false;
        }

        backup();
        editor.textField.insert(editor.clipboard, editor.textField.getCaretPosition());
        return true;
    }
}