
import java.util.LinkedList;
import java.util.List;

public class DijkstraAlgorithm {

    public static LinkedList<String> Dijkstra( String from,String to) {
        LinkedList<String> result = new LinkedList<String>();
        Node n;
        n = NodeFactory.getExistingNode(from);
        n.dist = 0;
        while (!NodeFactory.getNodes().isEmpty()) {
            Node u = NodeFactory.getSmallestNode();
            NodeFactory.removeNode(u);
            if (to.equals(u.name)) {
                Node current = u;
                while (current.prev != null) {
                    result.add(0, current.name);
                    current = current.prev;
                }
                return result;
            }
            for (Pair v : u.neigs) {
                int a = u.dist + v.cost;
                if (a < v.node.dist) {
                    v.node.dist = a;
                    v.node.prev = u;
                }
            }
        }
        return new LinkedList();
    }
}
