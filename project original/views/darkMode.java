package views;

public class darkMode implements IMode{

    @Override
    public void setMode(TetrisView view){
        view.borderPane.setStyle("-fx-background-color: #121212;");

        view.gameModeLabel.setStyle("-fx-text-fill: white");
        view.scoreLabel.setStyle("-fx-text-fill: white");

        view.startButton.setStyle("-fx-background-color: #3c3943; -fx-text-fill: white;");
        view.stopButton.setStyle("-fx-background-color: #3c3943; -fx-text-fill: white;");
        view.newButton.setStyle("-fx-background-color: #3c3943; -fx-text-fill: white;");
        view.saveButton.setStyle("-fx-background-color: #3c3943; -fx-text-fill: white;");
        view.loadButton.setStyle("-fx-background-color: #3c3943; -fx-text-fill: white;");
        view.modeButton.setStyle("-fx-background-color: #3c3943; -fx-text-fill: white;");
    }
}
