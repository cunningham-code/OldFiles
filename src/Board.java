public class Board {
	private Piece[][] pieces;
	public Board(){
		pieces= new Piece[8][8];
	}
	public boolean isFull(Coordinates coord){
		int x = coord.getX();
		int y = coord.getY();
		return pieces[x][y]!=null;
	}
}
