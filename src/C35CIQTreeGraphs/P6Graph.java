package C35CIQTreeGraphs;

import java.util.ArrayList;
import java.util.HashMap;

public class P6Graph {

    private ArrayList<P6Project> nodes = new ArrayList<P6Project>();
    private HashMap<String, P6Project> map = new HashMap<String, P6Project>();

    public P6Project getOrCreateNode(String name) {
        if (!map.containsKey(name)) {
            P6Project node = new P6Project(name);
            nodes.add(node);
            map.put(name, node);
        }

        return map.get(name);
    }

    public void addEdge(String startName, String endName) {
        P6Project start = getOrCreateNode(startName);
        P6Project end = getOrCreateNode(endName);
        start.addNeighbor(end);
    }

    public ArrayList<P6Project> getNodes() {
        return nodes;
    }
}
