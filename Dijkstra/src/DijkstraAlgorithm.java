
import java.util.List;

public class DijkstraAlgorithm {

    public String dijkstra(String to, String from) {
        Node n;
        n = NodeFactory.getExistingNode(from);
        n.dist = 0;
        while (!NodeFactory.getNodes().isEmpty()) {
            Node u = NodeFactory.getSmallestNode();
            NodeFactory.removeNode(u);
            if (to.equals(u.name)) {
                Node current = u;
            }
        }
        return null;
    }
}
