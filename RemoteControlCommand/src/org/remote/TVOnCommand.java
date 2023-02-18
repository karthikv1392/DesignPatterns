package org.remote;

public class TVOnCommand implements Command {
    private final Television tv;

    public TVOnCommand(Television tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.on();
    }
}

