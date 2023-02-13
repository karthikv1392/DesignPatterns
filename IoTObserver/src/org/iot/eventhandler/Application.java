package org.iot.eventhandler;

import org.iot.publishers.RfidPublisher;
import org.iot.subscribers.MobileSubscriber;
import org.iot.subscribers.WebClientSubscriber;

public class Application {


public static void main(String args[])
{
    RfidPublisher rf = new RfidPublisher();
    MobileSubscriber ms1 = new MobileSubscriber();
    WebClientSubscriber ws1 = new WebClientSubscriber();

    rf.manager.subscribe(ms1);
    rf.manager.subscribe(ws1);
    rf.setSensorData("12.0");
}
}
