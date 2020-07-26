package com.geekykel.pattern.behavourial.commandpattern;

public class CopyCommand extends CommandNew {

    public CopyCommand(Editor editor) {
        super(editor);
    }

    @Override
    public boolean execute() {
        editor.clipboard = editor.textField.getSelectedText();
        return false;
    }
}
