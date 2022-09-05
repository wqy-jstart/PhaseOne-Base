package apiDay04;

import java.util.Objects;

public class Point {
    private int x;
    private int y;
    public Point(int x,int y){
        this.x=x;
        this.y=y;
    }

    @Override
    //通过重写该方法，改变了输出的方式------字符串方式(?,?)坐标型
    public String toString() {
        return "(" + x +","+ y + ')';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return x == point.x &&
                y == point.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
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
}
