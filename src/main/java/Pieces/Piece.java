package Pieces;

import java.util.List;

public class Piece {

    private List<Sticker> stickers;
    private int position;

    public Piece(List<Sticker> stickers, int position) {
        this.stickers = stickers;
        this.position = position;
    }

    public void rotate(Rotation rotation) {
        changePosition(rotation);

        for (Sticker s : stickers) {

            if (s.getPlane() == Direction.HORIZONTAL) {
                s.SetDirection(Direction.getNextDirection(s.getDirection(), rotation));
            }
        }
    }

    private void changePosition(Rotation rotation) {
        if (rotation == Rotation.NORMAL) {
            position++;

        } else {
            position--;
        }
        if (position == 5) {
            position = 1;
        }
        if (position == 0) {
            position = 4;
        }
    }
}
