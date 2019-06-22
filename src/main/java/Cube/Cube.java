
package Cube;

import Pieces.Rotation;

public class Cube {
    
    private FaceRow topRow;
    private MiddleRow middleRow;
    private FaceRow bottomRow;
    
    public Cube(FaceRow top, MiddleRow middle, FaceRow bottom) {
        this.topRow = top;
        this.middleRow = middle;
        this.bottomRow = bottom;
    }
    
    public void up(Rotation rotation) {
        topRow.rotate(rotation);
    }
    
    public void down(Rotation rotation) {
        if (rotation == Rotation.NORMAL) {
            bottomRow.rotate(Rotation.PRIME);
            
        } else {
            bottomRow.rotate(Rotation.NORMAL);
        }
    }
    
    public void front(Rotation rotation) {
        
    }
}
