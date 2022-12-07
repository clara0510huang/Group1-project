package views;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.BorderPane;

/**
 * Mode class.
 */
public class Mode {
    /**
     * IMode strategy interface
     */
    private IMode modeStrategy;

    public Mode(IMode modeStrategy){
        this.modeStrategy = modeStrategy;
    }

    /**
     * set the mode depend on the given concrete strategy.
     */
    public void setMode(TetrisView view){
        modeStrategy.setMode(view);
    }

}
