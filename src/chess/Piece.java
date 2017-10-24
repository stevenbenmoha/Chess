package chess;
public abstract class Piece
{
	String color;
	abstract boolean checkMoveValidity(Board b, int curRow, int curCol, int newRow, int newCol);
}
