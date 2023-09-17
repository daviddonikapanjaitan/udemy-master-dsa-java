package C26Graphs;

import java.util.ArrayList;

public class P2AdjacencyMatrixList {

    public static void main(String[] args) {
        ArrayList<GraphNodeList> nodeList = new ArrayList<GraphNodeList>();
        nodeList.add(new GraphNodeList("A", 0));
        nodeList.add(new GraphNodeList("B", 1));
        nodeList.add(new GraphNodeList("C", 2));
        nodeList.add(new GraphNodeList("D", 3));
        nodeList.add(new GraphNodeList("E", 4));

        GraphList g = new GraphList(nodeList);
        g.addUndirectedEdge(0, 1);
        g.addUndirectedEdge(0, 2);
        g.addUndirectedEdge(0, 3);
        g.addUndirectedEdge(1, 4);
        g.addUndirectedEdge(2, 3);
        g.addUndirectedEdge(3, 4);
        System.out.println(g.toString());
    }
}
