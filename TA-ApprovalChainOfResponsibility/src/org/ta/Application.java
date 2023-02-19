package org.ta;

public class Application {
    private boolean isRejected;

    public Application() {
        isRejected = false;
    }

    public boolean isRejected() {
        return isRejected;
    }

    public void setRejected(boolean isRejected) {
        this.isRejected = isRejected;
    }
}
