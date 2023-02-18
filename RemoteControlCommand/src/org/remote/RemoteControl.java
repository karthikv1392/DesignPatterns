package org.remote;


public class RemoteControl {
    private final Command onCommand;
    private final Command offCommand;
    private final Command channelCommand;
    private final Command volumeUpCommand;
    private final Command volumeDownCommand;

    public RemoteControl(Command onCommand, Command offCommand, Command channelCommand, Command volumeUpCommand, Command volumeDownCommand) {
        this.onCommand = onCommand;
        this.offCommand = offCommand;
        this.channelCommand = channelCommand;
        this.volumeUpCommand = volumeUpCommand;
        this.volumeDownCommand = volumeDownCommand;
    }

    public void pressOnButton() {
        onCommand.execute();
    }

    public void pressOffButton() {
        offCommand.execute();
    }

    public void pressChannelButton(int channel) {
        ((ChangeChannelCommand) channelCommand).setChannel(channel);
        channelCommand.execute();
    }

    public void pressVolumeUpButton() {
        volumeUpCommand.execute();
    }

    public void pressVolumeDownButton() {
        volumeDownCommand.execute();
    }
}