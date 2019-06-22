
package Cube;

import Pieces.*;
import java.util.List;

public class FaceRow {
    
    private List<Edge> edges;
    private List<Corner> corners;
    private Middle middle;
    
    public FaceRow(List<Edge> edges, List<Corner> corners, Middle middle) {
        this.edges = edges;
        this.corners = corners;
        this.middle = middle;     
    }

    public void rotate(Rotation rotation) {
        for (Corner c : corners) {
            c.rotate(rotation);
        }
        for (Edge e : edges) {
            e.rotate(rotation);
        }
    }
}
