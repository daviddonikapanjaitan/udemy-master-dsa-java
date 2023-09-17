package C29SSSPP;

import java.util.ArrayList;

public class P1BfsSSSPPList {

    public static void main(String[] args) {
        ArrayList<GraphNodeList> nodeList = new ArrayList<>();
        nodeList.add(new GraphNodeList("A", 0));
        nodeList.add(new GraphNodeList("B", 1));
        nodeList.add(new GraphNodeList("C", 2));
        nodeList.add(new GraphNodeList("D", 3));
        nodeList.add(new GraphNodeList("E", 4));
        nodeList.add(new GraphNodeList("F", 5));
        nodeList.add(new GraphNodeList("G", 6));
        GraphList newGraph = new GraphList(nodeList);
        newGraph.addUndirectedEdge(0, 1);
        newGraph.addUndirectedEdge(0, 2);
        newGraph.addUndirectedEdge(1, 3);
        newGraph.addUndirectedEdge(1, 6);
        newGraph.addUndirectedEdge(2, 3);
        newGraph.addUndirectedEdge(2, 4);
        newGraph.addUndirectedEdge(3, 5);
        newGraph.addUndirectedEdge(4, 5);
        newGraph.addUndirectedEdge(5, 6);
        newGraph.BSFForSSSPP(nodeList.get(0));
    }
}
