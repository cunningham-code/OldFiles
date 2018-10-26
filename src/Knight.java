import java.util.ArrayList;

public class Knight implements Piece {

    private static int BLACK = 0;
    private static int WHITE = 1;

    private String fileName;
    private int color;
    private Coordinates coord;

    public Knight(){
        fileName="/Users/william.mccormick/Documents/Personal/Chess/Recources/Black Knight.png";
        color=WHITE;
    }
    public Knight(int newColor){
        fileName="/Users/william.mccormick/Documents/Personal/Chess/Recources/Black Knight.png";
        if(newColor>=BLACK&&newColor<=WHITE){
            color=newColor;
        }
        else
            throw new IllegalArgumentException("Must contain either white or black piece");
    }
    public Knight (String newColor){
        fileName="/Users/william.mccormick/Documents/Personal/Chess/Recources/Black Knight.png";
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
    	if(newCoor.getX()<8&&newCoor.getX()>=0&&newCoor.getY()>=0&&newCoor.getY()<8) {
			if (newCoor.getX() - coord.getX() == 1 || newCoor.getX() - coord.getX() == -1) {
				if(newCoor.getY()-coord.getY()==2||newCoor.getY()-coord.getY()==-2){
					return true;
				}
			}
			if(newCoor.getY()-coord.getY()==1||newCoor.getY()-coord.getY()==-1){
				if(newCoor.getX()-coord.getX()==2||newCoor.getX()-coord.getX()==-2){
					return true;
				}
			}
		}
		return false;
    }
}
