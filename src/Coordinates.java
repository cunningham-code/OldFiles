public class Coordinates{
    private int x;
    private int y;
    //TODO add bounds
    public Coordinates(){
        this.x=0;
        this.y=0;
    }
    public Coordinates(int newX, int newY){
        this.x=newX;
        this.y=newY;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
    public void set(Coordinates newCoord){
    	setX(newCoord.getX());
    	setY(newCoord.getY());
	}

	public boolean equals(Coordinates coord) {
		return (this.getX()-coord.getX()==0)&&(this.getY()-coord.getY()==0);
	}
	public boolean isInBounds(){
    	return (this.getX()>=0&&this.getX()<=7)&&(this.getY()>=0&&this.getY()<=7);//TODO Change to bounds
	}
}
