public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = Math.max(0, Math.min(x, 1000));
        this.y = Math.max(0, Math.min(y, 1000));
    }
    public Point() {
        x = 0;
        y = 0;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public boolean spostaVerticale(int offset){
        y=Math.max(0, Math.min(y + offset, 1000));
        return true;
    }



    public boolean spostaOrizzontale(int offset){
        x=Math.max(0, Math.min(x + offset, 1000));
        return true;
}


}