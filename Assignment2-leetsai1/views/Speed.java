package views;
/*
 * Class Speed.  A Speed will be used to set up falling speed of tetris
 * It implements the Visitable interface
 */

public class Speed implements Visitable{
    private double speed;
    TetrisView view;
    public Speed(TetrisView vw){
        view = vw;
    }
    @Override
    public void Accept(Visitor visitor){visitor.visit(this);}
    public double getSpeed(){return this.speed;}
    /*
    Changing the falling speed of tetris pieces.
    @param speed the speed user desired(can only range from 0.5 to 4)
     */
    public void setSpeed(double speed){
        this.speed =speed;

        view.timeline.setRate(speed);
        System.out.println("the speed is now " + speed);
    }
}