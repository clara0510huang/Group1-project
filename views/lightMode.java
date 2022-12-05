package views;

/**
 * The class to set the UI in light mode.
 */
public class lightMode implements IMode{
    
    /**
     * Set the colour of the button, font, background to light mode.
     *
     * @param view is the Tetris view.
     */
    @Override
    public void setMode(TetrisView view){
        view.borderPane.setStyle("-fx-background-color: #fafafa;");

        view.gameModeLabel.setStyle("-fx-text-fill: #9575cd");
        view.scoreLabel.setStyle("-fx-text-fill: #9575cd");

        view.startButton.setStyle("-fx-background-color: #9575cd; -fx-text-fill: white;");
        view.stopButton.setStyle("-fx-background-color: #9575cd; -fx-text-fill: white;");
        view.newButton.setStyle("-fx-background-color: #9575cd; -fx-text-fill: white;");
        view.saveButton.setStyle("-fx-background-color: #9575cd; -fx-text-fill: white;");
        view.loadButton.setStyle("-fx-background-color: #9575cd; -fx-text-fill: white;");
        view.modeButton.setStyle("-fx-background-color: #9575cd; -fx-text-fill: white;");
    }

}
