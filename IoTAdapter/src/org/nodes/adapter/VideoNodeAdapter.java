package org.nodes.adapter;

import org.nodes.iotNodes.NodeData;
import org.nodes.iotNodes.VideoNode;

public class VideoNodeAdapter implements NodeData {


    private VideoNode node;

    public VideoNodeAdapter(VideoNode node)
    {
        this.node = node;
    }
    @Override
    public double getData() {
        return node.getFrames();
    }

    @Override
    public double processData() {
        return node.processFrames();
    }

    @Override
    public boolean triggerAnalytics() {
        return node.performDetection();
    }
}
