package C28TopologicalSort;

import java.util.ArrayList;

public class P1TopologicalSortList {

    public static void main(String[] args) {
        ArrayList<GraphNodeList> nodeList = new ArrayList<GraphNodeList>();
        nodeList.add(new GraphNodeList("A", 0));
        nodeList.add(new GraphNodeList("B", 1));
        nodeList.add(new GraphNodeList("C", 2));
        nodeList.add(new GraphNodeList("D", 3));
        nodeList.add(new GraphNodeList("E", 4));
        nodeList.add(new GraphNodeList("F", 5));
        nodeList.add(new GraphNodeList("G", 6));
        nodeList.add(new GraphNodeList("H", 7));
        GraphList newGraph = new GraphList(nodeList);
        newGraph.addDirectedEdge(0, 2);
        newGraph.addDirectedEdge(2, 4);
        newGraph.addDirectedEdge(4, 7);
        newGraph.addDirectedEdge(4, 5);
        newGraph.addDirectedEdge(5, 6);
        newGraph.addDirectedEdge(1, 2);
        newGraph.addDirectedEdge(1, 3);
        newGraph.addDirectedEdge(3, 5);
        System.out.println(newGraph.toString());
        newGraph.topologicalSort();
    }
}
