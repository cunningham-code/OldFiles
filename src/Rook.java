import java.util.ArrayList;

public class Rook implements Piece {

    private static int BLACK = 0;
    private static int WHITE = 1;

    private String fileName;
    private int color;
    private Coordinates coord;

    public Rook(){
        fileName="/Users/william.mccormick/Documents/Personal/Chess/Recources/Black Rook.png";
        color=WHITE;
    }
    public Rook(int newColor){
        fileName="/Users/william.mccormick/Documents/Personal/Chess/Recources/Black Rook.png";
        if(newColor>=BLACK&&newColor<=WHITE){
            color=newColor;
        }
        else
            throw new IllegalArgumentException("Must contain either white or black piece");
    }
    public Rook (String newColor){
        fileName="/Users/william.mccormick/Documents/Personal/Chess/Recources/Black Rook.png";
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
			getCoord().set(newCoord);
		}
	}

	@Override
    public Coordinates getCoord() {
        return coord;
    }

    /*@Override
    public ArrayList<Coordinates> getPossibleMoves() {
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
    	if(!newCoor.equals(coord)) {
			if (newCoor.isInBounds()) {
				if ((newCoor.getX() - coord.getX() == 0) || (newCoor.getY() - coord.getY() == 0)) {
					return true;
				}
			}
		}
        return false;
    }
}
