package org.remote;

public class VolumeDownCommand implements Command {
    private final Television tv;

    public VolumeDownCommand(Television tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.volumeDown();
    }
}