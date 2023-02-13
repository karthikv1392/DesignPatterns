package org.iot.subscribers;

import org.iot.publisherInterfaces.IotInterface;
import org.iot.subscriberInterfaces.DataSubscribers;

public class MobileSubscriber implements DataSubscribers {

    @Override
    public void update(String value) {
        System.out.println(" IoT data received in Mobile " + " " + value);
    }


}
