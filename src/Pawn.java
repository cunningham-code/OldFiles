import java.util.ArrayList;

public class Pawn implements Piece {

    private static int BLACK = 0;
    private static int WHITE = 1;

    private String fileName;
    private int color;
    private Coordinates coord;
    private boolean firstMove;

    public Pawn(){
        fileName="/Users/william.mccormick/Documents/Personal/Chess/Recources/Black Pawn.png";
        color=WHITE;
        firstMove=true;
    }
    public Pawn(int newColor){
        fileName="/Users/william.mccormick/Documents/Personal/Chess/Recources/Black Pawn.png";
        firstMove=true;
        if(newColor>=BLACK&&newColor<=WHITE){
            color=newColor;
        }
        else
            throw new IllegalArgumentException("Must contain either white or black piece");
    }
    public Pawn (String newColor){
        fileName="/Users/william.mccormick/Documents/Personal/Chess/Recources/Black Pawn.png";
        firstMove=true;
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
        	coord.set(newCoord);
		}
    }

    @Override
    public Coordinates getCoord() {
        return coord;
    }

    /*@Override
    public ArrayList<Coordinates> getPossibleMoves() {
        return null;
    }
	*/
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
		if(firstMove){
			if(newCoor.getX()==coord.getX()){
				if (newCoor.getY()-coord.getY()==2||newCoor.getY()-coord.getY()==1){
					return true;
				}
			}
		}
		return false;
    }
}
