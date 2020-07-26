package com.geekykel.pattern.behavourial.commandpattern;

public abstract class CommandNew {

    public Editor editor;
    private String backup;

    CommandNew(Editor editor) {
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
