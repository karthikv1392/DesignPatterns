package org.nodes.manager;

import org.nodes.iotNodes.NodeData;

import java.util.ArrayList;
import java.util.List;

public class NodeManager {

    List<NodeData> nodeList = new ArrayList<NodeData>();

    public void addSensorNode(NodeData node)
    {
        System.out.println(" Added Node ");
        System.out.println(node.getData());
        nodeList.add(node);
    }

    public List<NodeData> getNodeList() {
        return nodeList;
    }


}
