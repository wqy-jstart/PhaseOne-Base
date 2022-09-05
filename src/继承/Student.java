package 继承;
//子类，派生类
public class Student extends Person {//前者具备后者的公共成员变量和方法extends(扩展)
    private String school;//声明私有成员变量school
   //共有的方法访问私有的属性
    public void setSchool(String school) {//外部通过此方法给私有属性school赋值
        this.school = school;
    }

    public String getSchool() {//外部通过此方法读取私有属性school
        return school;
    }
    public void study(){//此方法可以被外部直接调用
        System.out.println("我会学习");
    }

    public static void main(String[] args) {
        Student st =new Student();//创建对象，实例化
        //设置用set，获取用get
        st.setName("武清源");//通过开放方法给实例化对象赋值
        st.setAge(19);
        st.setSchool("宁波工程学院");
        System.out.println("姓名："+st.getName()+";年龄："+st.getAge()+";学校："+st.getSchool());
        st.say();
        st.study();
    }
}
