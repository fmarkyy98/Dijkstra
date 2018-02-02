
import java.util.LinkedList;
import java.util.List;

public class Node {

    final String name;
    int dist = Integer.MAX_VALUE;
    Node prev = null;
    final List<Pair> neigs;

    public Node(String name ) {
            this.name = name;
            neigs = new LinkedList<Pair>();
    }
}
