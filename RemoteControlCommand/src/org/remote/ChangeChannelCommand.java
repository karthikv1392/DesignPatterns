package org.remote;

public class ChangeChannelCommand implements Command {
    private final Television tv;
    private int channel;

    public ChangeChannelCommand(Television tv) {
        this.tv = tv;
    }

    public void setChannel(int channel) {
        this.channel = channel;
    }

    @Override
    public void execute() {
        tv.changeChannel(channel);
    }
}
