package views;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.BorderPane;

import java.awt.*;

/**
 * IMode strategy interface
 */
public interface IMode {
    /**
     * @param view the Tetris view
     */
    public void setMode(TetrisView view);
}