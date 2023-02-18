package org.remote;

public class TVOffCommand implements Command {
    private final Television tv;

    public TVOffCommand(Television tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.off();
    }
}