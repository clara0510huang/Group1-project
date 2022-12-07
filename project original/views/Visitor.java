package views;



/*
 * Visitor interface
 */
public interface Visitor {
    /*
     * Visit an expression that is a Font.
     * Changing font size.
     *
     * @param font Changing the font size of GUI interface.
     */
    public void visit(Font font)throws UnsupportedOperationException;
    /*
     * Visit an expression that is a Speed.
     * Changing falling speed of tetris pieces .
     *
     * @param font Changing falling speed of tetris pieces.
     */
    public void visit(Speed speed)throws UnsupportedOperationException;
}
