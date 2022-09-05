package 继承;
//子类，派生类
public class Student1 extends Person1 {
    private String school;
    public Student1(String name,int age,String school){
    //用super调用父类Person1的构造方法，而且super必须是子类构造方法中的第一个语句
        super("武清源",19);
        this.school=school;
        System.out.println("学校在："+school);
    }

    public static void main(String[] args) {
        Student1 st=new Student1("武清源",19,"宁波工程学院");
    }
}
