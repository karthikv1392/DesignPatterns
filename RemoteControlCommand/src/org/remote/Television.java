package org.remote;

public class Television {
    private boolean isOn;
    private int currentChannel;
    private int volume;

    public Television() {
        isOn = false;
        currentChannel = 0;
        volume = 0;
    }

    public void on() {
        isOn = true;
        System.out.println("TV is on");
    }

    public void off() {
        isOn = false;
        System.out.println("TV is off");
    }

    public void changeChannel(int channel) {
        currentChannel = channel;
        System.out.println("Channel changed to " + channel);
    }

    public void volumeUp() {
        volume++;
        System.out.println("Volume increased to " + volume);
    }

    public void volumeDown() {
        volume--;
        System.out.println("Volume decreased to " + volume);
    }
}