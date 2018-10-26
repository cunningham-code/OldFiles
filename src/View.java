import java.awt.*;

public class View {
	int[][] squares;
	public static int BLACK = 0;
	public static int WHITE = 1;
	public View(){
		StdDraw.setPenColor(Color.BLACK);
		StdDraw.setXscale(-1, 7);
		StdDraw.setYscale(-1, 7);

		squares = new int[8][8];

		boolean isBlack = true;

		for(int r = 0; r<8; r++) {

			for (int c = 0; c < 9; c++) {

				if(isBlack){
					StdDraw.setPenColor(Color.BLACK);
				}
				else{
					StdDraw.setPenColor(Color.WHITE);
				}
				StdDraw.filledSquare(r, c, 1);
				isBlack=!isBlack;
			}

		}//TODO AHHHHHHH
		drawPiece(new Coordinates(0,0), "/Users/william.mccormick/Documents/Personal/Chess/Recources/Black Bishop.png");
		StdDraw.show();
		createArray(squares);

		/*for(int r = 0; r<8; r++) {

			for (int c = 0; c < 8; c++) {

				System.out.println(squares[r][c]);
			}

		}*/

	}
	private void createArray(int[][] newColorArray){
		boolean black = true;
		for(int r = 0; r<squares.length; r++){
			for(int c = 0; c<squares[r].length; c++){
				if(black){
					squares[r][c]=BLACK;
				}
				else
					squares[r][c]=WHITE;
				black=!black;
			}
		}
	}
	private void drawPiece(Coordinates coord, String fileName){
		StdDraw.picture(coord.getX(),coord.getY(),fileName);
	}
	public void drawInitialPieces(){

	}
	public static void main (String[] args){
		View Game = new View();
	}
}
