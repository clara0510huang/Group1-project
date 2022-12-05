package views;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.BorderPane;

public class Mode {
    private IMode modeStrategy;

    public Mode(IMode modeStrategy){
        this.modeStrategy = modeStrategy;
    }

    public void setMode(TetrisView view){
        modeStrategy.setMode(view);
    }

}
