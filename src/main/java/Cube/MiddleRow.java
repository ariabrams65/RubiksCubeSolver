
package Cube;

import Pieces.*;
import java.util.List;

public class MiddleRow {
    
    private List<Edge> edges;
    private List<Middle> middles;
    
    public MiddleRow(List<Edge> edges, List<Middle> middles) {
        this.edges = edges;
        this.middles = middles;
    }
}
