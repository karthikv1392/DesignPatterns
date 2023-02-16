package org.nodes.iotNodes;

public class WaterSensor implements NodeData{

    private double sensorValue;


    public WaterSensor(double data)
    {
        System.out.println( " Data Obtained from Water Sensor ");
        this.sensorValue = data;
    }
    @Override
    public double getData() {
        return this.sensorValue;
    }

    @Override
    public double processData() {
        return this.sensorValue*0.3;
    }

    @Override
    public boolean triggerAnalytics() {
        return false;
    }
}
