package org.iot.publishers;

import org.iot.eventhandler.Manager;

public class RfidPublisher{


    public String sensorData;
    public Manager manager;

    public RfidPublisher()
    {
        this.manager = new Manager();
    }

    public void setSensorData(String data)
    {
        this.sensorData  = data;
        this.manager.notify(this.sensorData);

    }

    public void sample()
    {

        System.out.println("test");
    }



}
