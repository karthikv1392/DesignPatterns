package org.iot.eventhandler;

import org.iot.publishers.RfidPublisher;
import org.iot.subscriberInterfaces.DataSubscribers;
import org.iot.subscribers.MobileSubscriber;

import java.util.ArrayList;
import java.util.List;

public class Manager {

    private ArrayList<DataSubscribers> subscriberList = new ArrayList<>();



    public boolean subscribe (DataSubscribers dataSubs)
    {
        subscriberList.add(dataSubs);
        System.out.println(" Added subscriber to list of RFID ");
        return true;
    }

    public void notify(String value)
    {
        for (DataSubscribers dataSubscribers : subscriberList) {
            dataSubscribers.update(value);
        }
    }

    public List getSubscriberList()
    {
        return this.subscriberList;
    }

}
