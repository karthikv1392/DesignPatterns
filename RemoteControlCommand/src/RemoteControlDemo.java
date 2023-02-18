import org.remote.*;

import java.util.Scanner;

public class RemoteControlDemo {
    public static void main(String[] args){
        Television tv = new Television();
        TVOnCommand tvOn = new TVOnCommand(tv);
        TVOffCommand tvOff = new TVOffCommand(tv);
        ChangeChannelCommand changeChannel = new ChangeChannelCommand(tv);
        VolumeUpCommand volUp = new VolumeUpCommand(tv);
        VolumeDownCommand volDown = new VolumeDownCommand(tv);

        RemoteControl remote = new RemoteControl(tvOn, tvOff, changeChannel, volUp, volDown);

        Scanner scanner = new Scanner(System.in);
        String input = "";
        while(!input.equals("exit")){
            System.out.println("Enter a command: ");
            input = scanner.nextLine();
            switch(input){
                case "0":
                    remote.pressOffButton();
                    break;
                case "1":
                    remote.pressOnButton();
                    break;
                case "2":
                    System.out.println("Enter a channel: ");
                    int channel = scanner.nextInt();
                    remote.pressChannelButton(channel);
                    break;
                case "3":
                    remote.pressVolumeUpButton();
                    break;
                case "4":
                    remote.pressVolumeDownButton();
                    break;
                case "exit":
                    break;
                default:
                    System.out.println("Invalid command");
            }
        }
    }
}