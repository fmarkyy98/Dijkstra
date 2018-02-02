
import java.util.LinkedList;
import java.util.List;

public abstract class NodeFactory {

    static List<Node> cities = new LinkedList< Node>();

    public static Node getNode(final String city) {
        /*Node result = null;
        if (cities.contains(city)) {
            result = cities.stream().filter(n -> n.name == city)
                    .findFirst()
                    .get();
        } else {
            cities.add(new Node(city));
        }*/
        for (Node n : cities) {
            if (n.name.equals(city)) {
                return n;
            }
        }
        Node n = new Node(city);
        cities.add(n);
        return n;
    }

    public static Node getExistingNode(final String city) {
        for (Node n : cities) {
            if (n.name.equals(city)) {
                return n;
            }
        }
        throw new NullPointerException();
    }
}
