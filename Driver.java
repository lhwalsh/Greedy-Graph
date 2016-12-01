public class Driver {
    public static void main(String args[]) throws Exception {
	mst graph = new mst(args[0]);
	System.out.println(graph);
	graph.greedy(4);
	Edge[] test = graph.getEdges();
	int counter = 0;
	System.out.println("MST edges");
	for (Edge i:test) {
	    if (i.isSelected()) {
		System.out.println(i);
		counter += i.getWeight();
	    }
	}
	System.out.println(args[0] + " MST cost=" + counter);
	System.out.println("~~~~~~~~");


	int pathTo = 5;
	spt graph1 = new spt(args[0]);
	System.out.println("SPT edges");
	graph1.greedy(0);
	Edge[] edges = graph1.getEdges();
	String path = "";
	int counter1 = 0;
	boolean first = true;
	for (Edge i:edges) {
	    if (i.isSelected()) {
		System.out.println(i);
		if (first) {
		    path += "" + i.getTail();
		    first = false;
		}
		counter1 += i.getWeight();
		path += ", " + i.getHead();
	    }
	}
	System.out.println(args[0] + " SPT cost=" + counter1);
	System.out.println("Path from 0 to " + pathTo + "=[" + path + "]");
	System.out.println("Distance=" + graph1.costOf(pathTo));
    }
}
