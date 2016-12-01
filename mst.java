public class mst extends GreedyGraph {

    public mst(String name) throws Exception {
	super(name);
    }

    public double newCost(int v, int w) {
	Edge[] edges = getEdges();
	for (Edge i: edges) {
	    if (i.getHead() == v) {
		if (i.getTail() == w) {
		    return i.getWeight();
		}
	    } else if (i.getHead() == w) {
		if (i.getTail() == v) {
		    return i.getWeight();
		}
	    }
	}
	return Double.POSITIVE_INFINITY;
	//find the edge set by v and w
    }

}
