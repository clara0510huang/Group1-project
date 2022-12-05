package views;
/*
 *  Visitable interface
 */
public interface Visitable {

    /*
     * All Visitable object must accept visitors, for changing and setting values
     *
     * @param visitor Visitor (used to change the value)
     */
    public void Accept(Visitor visitor);

}
