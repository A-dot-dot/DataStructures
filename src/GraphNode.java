import java.util.ArrayList;
import javafx.util.Pair;

public class GraphNode {
    private int nodeID;
    private ArrayList<Pair<GraphNode, Integer>> edgesList;
    private boolean isVisited = false;

    public GraphNode(int nodeID) {
        this.nodeID = nodeID;
        edgesList = new ArrayList<>();
    }

    public void visit() {
        System.out.println("Visiting node with nodeID : " + nodeID);
    }

    public void addAnEdge(GraphNode dest, int weight) {
        edgesList.add(new Pair<>(dest, weight));
    }


    public void addAnEdge(GraphNode dest) {
        // default graph edge weight is 0
        edgesList.add(new Pair<>(dest, 0));
    }

    public ArrayList<Pair<GraphNode, Integer>> getAllEdges() {
        return edgesList;
    }


    public boolean getIsVisited() {
        return isVisited;
    }

    public void setIsVisited() {
        isVisited = true;
    }

    public void resetIsVisited() {
        isVisited = false;
    }
}