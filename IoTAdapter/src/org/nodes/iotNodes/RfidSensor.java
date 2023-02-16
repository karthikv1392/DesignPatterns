package org.nodes.iotNodes;

public class RfidSensor implements NodeData
{
    private  double data;

    public RfidSensor(double data)
    {
        System.out.println( " Data Obtained from RFID ");
        this.data = data;
    }

    public double getData() {
        return data;
    }

    public double processData()
    {
        return this.data*0.2;
    }

    @Override
    public boolean triggerAnalytics() {
        return false;
    }


}
