package 枚举类型;

/**
 * 枚举类中的抽象方法实现，需要枚举类中的每个对象都对其进行实现。
 */
enum Direction1{
    EAST{
        public String getDirection1(){
            return "东";
        }
    },
    SOUTH{
        public String getDirection1() {
            return "西";
        }
    },
    WEST{
        public String getDirection1(){
            return "南";
        }
    },
    NORTH{
        public String getDirection1(){
            return "北";
        }
    };
    //定义抽象方法
    public abstract String getDirection1();
}
public class EnumDemo7 {
    public static void main(String[] args) {
        for (Direction1 d : Direction1.values()){
            System.out.print(d.getDirection1() + "、");
        }
    }
}
