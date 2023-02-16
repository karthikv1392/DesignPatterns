package org.nodes.iotNodes;

public class DroneNode implements VideoNode {


    private int frameCount;
    private int objectCount;

    public DroneNode(int data)
    {
        System.out.println(" Data gathered from Drones ");
        this.frameCount = data;
    }

    @Override
    public double getFrames() {
        return this.frameCount;
    }

    @Override
    public double processFrames() {

        System.out.println("Splitting the Frames detected from Drone");
        return this.frameCount*1.0;
    }

    @Override
    public boolean performDetection() {
        this.objectCount = this.frameCount*5;
        System.out.println("Total detections from Drone feed " + this.objectCount);
        return true;
    }
}
