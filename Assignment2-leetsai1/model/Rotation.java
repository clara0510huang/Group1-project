package model;

/**
 * The Rotation defines the interface of interest to clients.
 */
public class Rotation {

    private IRotation rotationStrategy;

    /**
     * The Rotation accepts a strategy through the constructor, and also provides a setter so that the strategy can be switched at runtime.
     */
    public Rotation(IRotation rotationStrategy){
        this.rotationStrategy = rotationStrategy;
    }

    /**
     *  The method will be called depend on different concrete strategies.
     */
    public TetrisPiece computeNextRotation(TetrisPiece piece){
        return rotationStrategy.computeNextRotation(piece);
    }
}
