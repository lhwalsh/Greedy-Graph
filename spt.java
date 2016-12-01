public class spt extends GreedyGraph {

    public spt(String name) throws Exception {
	super(name);
    }

    public double newCost(int v, int w) {
	Edge[] edges = getEdges();
	for (Edge i: edges) {
	    if (i.getHead() == v) {
		if (i.getTail() == w) {
		    return (costOf(v) + i.getWeight());
		}

	    } else if (i.getHead() == w) {
		if (i.getTail() == v) {
		    return (costOf(v) + i.getWeight());
		}
	    }
	}
	return Double.POSITIVE_INFINITY;
    }
}
