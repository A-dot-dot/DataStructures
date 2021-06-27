import java.util.ArrayList;
import javafx.util.Pair;
import java.util.Queue;
import java.util.LinkedList;

public class Graph {
    private ArrayList<GraphNode> nodes;

    public Graph() {
        nodes = new ArrayList<GraphNode>();
    }

    public void addANode(GraphNode node) {
        nodes.add(node);
    }


    public void resetAllNodesUnvisited() {
        System.out.println("Resetting all nodes as unvisited.");
        for(GraphNode n : nodes) {
            n.resetIsVisited();
        }
    }

    public void doBFS(GraphNode node) {
        Queue<GraphNode> q = new LinkedList<GraphNode>();
        q.offer(node);
        node.setIsVisited();

        while(q.isEmpty() == false) {
            GraphNode poppedNode = q.poll();
            poppedNode.visit();
            ArrayList<Pair<GraphNode, Integer>> edgesList = poppedNode.getAllEdges();
            for(Pair<GraphNode, Integer> edge : edgesList) {
                if(edge.getKey().getIsVisited() == false) {
                    q.offer(edge.getKey());
                    edge.getKey().setIsVisited();
                }
            }
        }

        resetAllNodesUnvisited();
    }

    public void doBFS() {
        doBFS(nodes.get(0));
    }

    public void doDFS(GraphNode node) {
        if(node.getIsVisited() == true) {
            return;
        }

        node.visit();
        node.setIsVisited();

        ArrayList<Pair<GraphNode, Integer>> edgesList = node.getAllEdges();
        for(Pair<GraphNode, Integer> edge : edgesList) {
            doDFS(edge.getKey());
        }
    }


    public void doDFS() {
        doDFS(nodes.get(0));
    }
}