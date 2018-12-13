package PartsOfGame;

public class Point {
    private int x;
    private int y;
    public Point(int x,int y){
        this.x=x;
        this.y=y;
    }
    @Override
    public boolean equals(Object object)
    {
        boolean same = false;

        if (object != null && object instanceof Point)
        {
            same = ((this.x == ((Point) object).getX()) && (this.y == ((Point) object).getY()));

        }

        return same;
    }

    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
}
