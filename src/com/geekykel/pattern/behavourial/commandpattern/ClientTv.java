package com.geekykel.pattern.behavourial.commandpattern;

import java.util.Scanner;

public class ClientTv {
    public static void main(String[] args) {

        Controller controller = new Controller();
        TV tv = new TV();

        Command changeChannel;
        int[] channelList = new int[3];

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            channelList[i] = scanner.nextInt();
        }

        Command turnOnTV = new TurnOnCommand(tv);
        /* write your code here */
        controller.setCommand(turnOnTV);
        controller.executeCommand();

        for (int i = 0; i < 3; i++) {
            /* write your code here */
            changeChannel = new ChangeChannelCommand(new Channel(channelList[i]));
            controller.setCommand(changeChannel);
            controller.executeCommand();
        }

        Command turnOffTV = new TurnOffCommand(tv);
        /* write your code here */
        controller.setCommand(turnOffTV);
        controller.executeCommand();
    }
}
