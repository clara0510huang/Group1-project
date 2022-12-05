package views;
/*
 * Class VisionAccessibilityVisitor.  An VisionAccessibilityVisitor will be used to set up font and falling speed of tetris
 * for vision accessibility users.
 * It implements the Visitor interface
 */
public class VisionAccessibilityVisitor implements Visitor{
    /*
     * Visit an expression that is a Font.
     * Changing font size.
     *
     * @param font Font (used to change font size)
     */
    public void visit(Font font){
        font.setSize(30);

    }
    /*
     * Visit an expression that is a Speed.
     * Changing falling speed of tetris pieces.
     *
     * @param speed Speed (used to change the falling speed of tetris pieces)
     */
    public void visit(Speed speed){
        speed.setSpeed(0.5);

    }
}
