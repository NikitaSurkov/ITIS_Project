package sample;

import java.lang.Comparable;

public class Point implements Comparable {
    private int x;
    private int y;

    @Override

    public int compareTo(Object obj) {
        Point tmp = (Point)obj;
        if(this.x < tmp.x) {
            return -1;
        }
        else if(this.x > tmp.x) {
            return 1;
        }
        return 0;
    }

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }

}
