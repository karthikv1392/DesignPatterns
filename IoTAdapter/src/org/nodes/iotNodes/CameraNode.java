package org.nodes.iotNodes;

public class CameraNode implements VideoNode {

    private int frameCount;
    private int objectCount;

    public CameraNode(int data)
    {
        System.out.println(" Data Obtained from Camera ");
        this.frameCount = data;
    }

    @Override
    public double getFrames() {
        return this.frameCount;
    }

    @Override
    public double processFrames() {

        System.out.println("Splitting the Frames");
        return this.frameCount*1.0;
    }

    @Override
    public boolean performDetection() {
        this.objectCount = this.frameCount*4;
        System.out.println("Total detections " + this.objectCount);
        return true;
    }
}
