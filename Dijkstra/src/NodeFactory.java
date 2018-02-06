
import java.util.LinkedList;

public abstract class NodeFactory {

    static LinkedList<Node> cities = new LinkedList< Node>();

    public static Node getNode(final String city) {
        for (Node n : cities) {
            if (n.name.equals(city)) {
                return n;
            }
        }
        Node n = new Node(city);
        cities.add(n);
        return n;
    }

    public static void removeNode(Node n){
        cities.remove(n);
    }
    
    public static Node getExistingNode(final String city) {
        for (Node n : cities) {
            if (n.name.equals(city)) {
                return n;
            }
        }
        return null;
    }

    public static LinkedList<Node> getNodes() {
        return (LinkedList<Node>) cities.clone();
    }

    public static Node getSmallestNode() {
        return cities.stream().min((n1, n2) -> {
            return Integer.compare(n1.dist, n2.dist);
        }).get();
    }

}
