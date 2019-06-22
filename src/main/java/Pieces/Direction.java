package Pieces;

public enum Direction {
    UP, DOWN, TOWARD, AWAY, LEFT, RIGHT, HORIZONTAL, VERTICAL;

    public static Direction getNextDirection(Direction direction, Rotation rotation) {
        if (rotation == Rotation.NORMAL) {
            if (direction == Direction.UP) {
                return Direction.RIGHT;

            } else if (direction == Direction.RIGHT) {
                return Direction.DOWN;

            } else if (direction == Direction.DOWN) {
                return Direction.LEFT;

            } else if (direction == Direction.LEFT) {
                return Direction.UP;
            }
        } else {
            if (direction == Direction.UP) {
                return Direction.LEFT;

            } else if (direction == Direction.RIGHT) {
                return Direction.UP;

            } else if (direction == Direction.DOWN) {
                return Direction.RIGHT;

            } else if (direction == Direction.LEFT) {
                return Direction.DOWN;
            }
        }
        return null;
    }
}
