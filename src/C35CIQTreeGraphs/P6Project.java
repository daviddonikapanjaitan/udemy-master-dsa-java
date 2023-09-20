package C35CIQTreeGraphs;

import java.util.ArrayList;
import java.util.HashMap;

public class P6Project {

    private ArrayList<P6Project> children = new ArrayList<P6Project>();
    private HashMap<String, P6Project> map = new HashMap<String, P6Project>();
    private String name;
    private int dependencies = 0;

    public P6Project (String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

    public void addNeighbor(P6Project node) {
        if (!map.containsKey(node.getName())) {
            children.add(node);
            map.put(node.getName(), node);
            node.incrementDependencies();
        }
    }

    public void incrementDependencies() {
        dependencies++;
    }

    public ArrayList<P6Project> getChildren() {
        return children;
    }

    public void decrementDependencies() {
        dependencies--;
    }

    public int getNumberDependencies() {
        return dependencies;
    }
}
