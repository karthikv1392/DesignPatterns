package org.iot.subscribers;

import org.iot.subscriberInterfaces.DataSubscribers;

public class WebClientSubscriber implements DataSubscribers {

    @Override
    public void update(String value) {
        System.out.println(" IoT data received in web client " + " " + value);
    }

}
