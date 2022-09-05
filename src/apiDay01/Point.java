package apiDay01;

/*数据私有，设计getter/setter的原因：
  1.很多框架都是基于getter/setter来配置获取数据的，可以理解为它是一种行为的标准
  2.getter/setter是可以对数据进行控制，而public权限时无法对数据进行控制
 */
public class Point {
    private int x; //成员变量，默认值为0
    private int y;

    public int getX() { //getter获取值
        return x;
    }

    public void setX(int x) { //set设置值
        if(x>0){
            this.x = x;
        }
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

}
