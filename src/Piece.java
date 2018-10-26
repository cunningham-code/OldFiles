import java.util.ArrayList;

public interface Piece {
    public void move(Coordinates newCoord);
    public Coordinates getCoord();
    //public ArrayList<Coordinates> getPossibleMoves();
    public String getFileName();
    public int getColor();
    public boolean isValidMove(Coordinates newCoor);
}
