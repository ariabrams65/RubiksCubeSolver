package Pieces;

public class Sticker {

    private Color color;
    private Direction direction;

    public Sticker(Color color, Direction direction) {
        this.color = color;
        this.direction = direction;
    }

    public Color getColor() {
        return this.color;
    }

    public void SetDirection(Direction d) {
        this.direction = d;
    }

    public Direction getDirection() {
        return this.direction;
    }

    public Direction getPlane() {

        if (direction == Direction.UP || direction == Direction.LEFT
                || direction == Direction.DOWN || direction == Direction.RIGHT) {
            return Direction.HORIZONTAL;
        }
        return Direction.VERTICAL;
    }
}
