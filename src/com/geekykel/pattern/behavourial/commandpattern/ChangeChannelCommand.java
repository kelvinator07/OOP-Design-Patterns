package com.geekykel.pattern.behavourial.commandpattern;

public class ChangeChannelCommand implements Command {

    private Channel channel;

    ChangeChannelCommand(Channel channel) {
        this.channel = channel;
    }

    @Override
    public void execute() {
        /* write your code here */
        channel.changeChannel();
    }
}