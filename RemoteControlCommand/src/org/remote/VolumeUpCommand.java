package org.remote;

public class VolumeUpCommand implements Command {
    private final Television tv;

    public VolumeUpCommand(Television tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.volumeUp();
    }
}