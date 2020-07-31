package com.geekykel.pattern.behavourial.commandpattern2;

public interface Storable {
    int getInventoryLength();
    String getInventoryItem(int index);
    void setInventoryItem(int index, String item);
}
