package views;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.scene.Node;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.util.Duration;
import model.TetrisPoint;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class DelectionView {
    private TetrisView tetrisView;
    Button deletebutton;
    int mousex;
    int mousey;
    GraphicsContext mc;
    double width;
    double height;
    int pieceWidth =20;
    GraphicsContext pc;
    private Button NextButton;
    private Canvas piecelist;
    public ArrayList<ArrayList<TetrisPoint>> DeletionpiecePairs;
    public ArrayList<TetrisPoint> DelectionPair;
    /*
    Create the view for deletion help
     */
    public DelectionView(TetrisView tetrisView) {
        tetrisView.paused = true;
        this.tetrisView = tetrisView;

        //set button
        deletebutton = new Button("Delete");
        deletebutton.setId("Delete");
        deletebutton.setPrefSize(150, 50);
        deletebutton.setFont(new Font(12));
        deletebutton.setStyle("-fx-background-color: #17871b; -fx-text-fill: white;");
        NextButton = new Button("Next");
        NextButton.setId("Next deletion piece"); // DO NOT MODIFY ID
        NextButton.setPrefSize(150, 50);
        NextButton.setStyle("-fx-background-color: #17871b; -fx-text-fill: white;");
        NextButton.setFont(new Font(12));
        VBox control = new VBox(10,NextButton,deletebutton);

        //get width and height for preparing of painting
        width = tetrisView.model.getWidth() * pieceWidth + 2;
        height = tetrisView.model.getHeight() * pieceWidth + 2;

        //get the deletion pair pieces ready to paint
        DeletionpiecePairs = tetrisView.model.deletionpairs;
        DelectionPair = DeletionpiecePairs.get(0);

        // draw the deletion piece select board
        piecelist = new Canvas(width,height);
        piecelist.setId("deletion view");
        pc = piecelist.getGraphicsContext2D();

        // add key frame
        Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(0.25), e -> updateboard()));
        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.play();


        //WritableImage image = this.tetrisView.canvas.snapshot(new SnapshotParameters(),null);
        //piecelist.getGraphicsContext2D().drawImage(image,0,0);
        //piecelist.setStyle("-fx-background-color: #17871b;");
        //pc = piecelist.getGraphicsContext2D();
        //piecelist.setId("deletion pieces");
        //piecelist.setVisible(true);
        // add frame

        // Default styles which can be modified

        Node right = this.tetrisView.borderPane.getRight();
        BorderPane newview = new BorderPane(this.tetrisView.borderPane.getRight());
        newview.setBottom(control);
        this.tetrisView.borderPane.setRight(newview);
        tetrisView.borderPane.setCenter(piecelist);

        // set button action
        AtomicInteger time = new AtomicInteger(0);
        NextButton.setOnAction(e -> {time.addAndGet(1);
            if(time.get() == DeletionpiecePairs.size()){
            time.set(0);}DelectionPair = DeletionpiecePairs.get(time.get());
        });
        deletebutton.setOnAction(e ->{
            /*deletionhelp(time);*/
            tetrisView.borderPane.setRight(right);
            this.tetrisView.borderPane.requestFocus();} );

    }
    private final int yPixel(int y) {
        return (int) Math.round(this.height -1 - (y+1)*dY());
    }
    private final int xPixel(int x) {return (int) Math.round(this.width -1 - (x+1)*dX());
    }
    private final float dX() {
        return( ((float)(this.width-2)) / this.tetrisView.model.getBoard().getWidth() );
    }
    private final float dY() {
        return( ((float)(this.height-2)) / this.tetrisView.model.getBoard().getHeight() );
    }
    /*
    Delete the gird
     */
    public void updateboard(){
        if(tetrisView.paused && !DelectionPair.isEmpty()){
            panitboard();
        }


    }
    public void panitboard(){
        pc.setStroke(Color.GREEN);
        pc.setFill(Color.GREEN);
        pc.fillRect(0, 0, this.width-1, this.height-1);

        // Factor a few things out to help the optimizer
        final int dx = Math.round(dX()-2);
        final int dy = Math.round(dY()-2);

        for(TetrisPoint point: DelectionPair){
            int x = point.x;
            int y = point.y;
            int left = xPixel(x);
            Color c = tetrisView.model.getBoard().getGridColor(x,y);
            pc.setFill(c);
            pc.fillRect(left+1, yPixel(y)+1, dx, dy);
            pc.setFill(Color.GREEN);
                }
            }



    /*public void deletionhelp(AtomicInteger time){
        ArrayList<TetrisPoint> lst = DeletionpiecePairs.get(time.get());
        TetrisBoard board = tetrisView.model.getBoard();
        ArrayList<Integer> l = new ArrayList<Integer>();
        for(TetrisPoint point:lst){
            board.deleteGrid(point.x,point.y);
            l.add(point.x);
        }DeletionpiecePairs.remove(lst);
        board.dropgird(l);


    }*/

    }









