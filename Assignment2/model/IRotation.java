package model;

/**
 *
 * The IRotation will be used to call the algorithm defined by the concretestrategies.
 * 
 */
public interface IRotation {
    public TetrisPiece computeNextRotation(TetrisPiece piece);
}
