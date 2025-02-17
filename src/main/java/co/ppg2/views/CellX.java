package co.ppg2.views;

import javafx.scene.shape.Line;

/**
 * Represents the graphical component of an "X" token in the TicTacToe game.
 */
public class CellX extends CellBase {

    /**
     * Constructs an "X" token with its graphical representation.
     */
    public CellX() {
        Line line1 = new Line(10, 10, 90, 90);
        Line line2 = new Line(90, 10, 10, 90);
        this.getChildren().addAll(line1, line2);
    }

    @Override
    public void setToken(char token) {
        this.token = 'X';
    }
}