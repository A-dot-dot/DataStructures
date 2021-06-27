public class Main {
    public static void main(String [] args) {
        System.out.println("Testing Graph Algorithms...");


        // Create as many nodes
        GraphNode node1 = new GraphNode(1);
        GraphNode node2 = new GraphNode(2);
        GraphNode node3 = new GraphNode(3);
        GraphNode node4 = new GraphNode(4);
        GraphNode node5 = new GraphNode(5);
        GraphNode node6 = new GraphNode(6);
        GraphNode node7 = new GraphNode(7);
        GraphNode node8 = new GraphNode(8);
        GraphNode node9 = new GraphNode(9);


        // Create graph
        Graph g = new Graph();

        // Add nodes to the graph
        g.addANode(node1);
        g.addANode(node2);
        g.addANode(node3);
        g.addANode(node4);
        g.addANode(node5);
        g.addANode(node6);
        g.addANode(node7);
        g.addANode(node8);
        g.addANode(node9);


        // Create all edges. For an undirected edge create two entries : u->v
        // & v->u

        node1.addAnEdge(node2, 4);
        node1.addAnEdge(node8, 8);

        node2.addAnEdge(node1, 4);
        node2.addAnEdge(node3, 8);
        node2.addAnEdge(node8, 11);

        node3.addAnEdge(node2, 8);
        node3.addAnEdge(node4, 7);
        node3.addAnEdge(node6, 4);
        node3.addAnEdge(node9, 2);

        node4.addAnEdge(node3, 7);
        node4.addAnEdge(node5, 9);
        node4.addAnEdge(node6, 14);

        node5.addAnEdge(node4, 9);
        node5.addAnEdge(node6, 10);

        node6.addAnEdge(node3, 4);
        node6.addAnEdge(node4, 14);
        node6.addAnEdge(node5, 10);
        node6.addAnEdge(node7, 2);

        node7.addAnEdge(node6, 2);
        node7.addAnEdge(node8, 1);
        node7.addAnEdge(node9, 6);

        node8.addAnEdge(node1, 8);
        node8.addAnEdge(node2, 11);
        node8.addAnEdge(node7, 1);
        node8.addAnEdge(node9, 7);

        node9.addAnEdge(node3, 2);
        node9.addAnEdge(node7, 6);
        node9.addAnEdge(node8, 7);


        g.doBFS();
        g.resetAllNodesUnvisited();

        System.out.println();

        g.doDFS(node9);
        g.resetAllNodesUnvisited();

    }
}
