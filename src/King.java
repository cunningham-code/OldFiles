import javafx.beans.binding.When;

import java.util.ArrayList;

public class King implements Piece{
	private static int BLACK = 0;
	private static int WHITE = 1;

	private String fileName;
	private int color;
	private Coordinates coord;

	public King(){
		fileName="/Users/william.mccormick/Documents/Personal/Chess/Recources/Black King.png";
		color=WHITE;
	}
	public King(int newColor){
		fileName="/Users/william.mccormick/Documents/Personal/Chess/Recources/Black King.png";
		if(newColor>=BLACK&&newColor<=WHITE){
			color=newColor;
		}
		else
			throw new IllegalArgumentException("Must contain either white or black piece");
	}
	public King (String newColor){
		fileName="/Users/william.mccormick/Documents/Personal/Chess/Recources/Black King.png";
		if(newColor.equals("Black")||newColor.equals("BLACK")){
			this.color=BLACK;
		}
		else if(newColor.equals("White")||newColor.equals("WHITE")){
			this.color=WHITE;
		}
	}

	@Override
	public void move(Coordinates newCoord) {
		if(isValidMove(newCoord)){
			this.getCoord().set(newCoord);
		}
	}

	@Override
	public Coordinates getCoord() {
		return coord;
	}

	/*public ArrayList<Coordinates> getPossibleMoves() {
		return null;
	}*/

	@Override
	public String getFileName() {
		return fileName;
	}

	@Override
	public int getColor() {
		return color;
	}

	@Override
	public boolean isValidMove(Coordinates newCoor) {
		if(newCoor.isInBounds()) {
			if (getCoord().equals(newCoor)) {
				return false;
			} else if (newCoor.getX() - coord.getX() == 1 || coord.getX() - newCoor.getX() == 1 || newCoor.getX() - coord.getX() == 0) {
				if ((newCoor.getY() - coord.getY() == 0) || (newCoor.getY() - coord.getY() == 1) ||
						(coord.getY() - newCoor.getY() == 1)) {
					return true;
				}
			}
		}
		return false;
	}

}
