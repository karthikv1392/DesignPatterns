import org.nodes.adapter.VideoNodeAdapter;
import org.nodes.iotNodes.*;
import org.nodes.manager.NodeManager;

import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(String[] args) {

        NodeManager manager = new NodeManager();

        manager.addSensorNode(new RfidSensor(12.0));
        manager.addSensorNode(new WaterSensor(20.0));

        manager.addSensorNode(new VideoNodeAdapter(new CameraNode(25)));
        manager.addSensorNode(new VideoNodeAdapter(new DroneNode(25)));
        List<NodeData> nodeList = new ArrayList<NodeData>();

        nodeList = manager.getNodeList();





    }
}
