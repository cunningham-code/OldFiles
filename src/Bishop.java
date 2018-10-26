import java.util.ArrayList;

public class Bishop implements Piece {

    private static int BLACK = 0;
    private static int WHITE = 1;

    private String fileName;
    private int color;
    private Coordinates coord;

    public Bishop(){
        fileName="/Users/william.mccormick/Documents/Personal/Chess/Recources/Black Bishop.png";
        color=WHITE;
    }
    public Bishop(int newColor){
        fileName="/Users/william.mccormick/Documents/Personal/Chess/Recources/Black Bishop.png";
        if(newColor>=BLACK&&newColor<=WHITE){
            color=newColor;
        }
        else
            throw new IllegalArgumentException("Must contain either white or black piece");
    }
    public Bishop (String newColor){
        fileName="/Users/william.mccormick/Documents/Personal/Chess/Recources/Black Bishop.png";
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
        if(newCoor.getX()<8&&newCoor.getX()>=0&&newCoor.getY()<8&&newCoor.getY()>=0){
        	int changeX = newCoor.getX()-coord.getX();
        	int changeY = newCoor.getY()-coord.getY();
            if(changeX==changeY){
            	return true;
			}
        }
        return false;
    }
}
