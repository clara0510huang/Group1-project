package views;

public class lightMode implements IMode{

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
