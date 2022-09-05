package 封装;
//封装：将属性私有化，提供共有的方法访问私有的属性
public class Book {
    //使用private修饰符封装Book属性，封装后外部不可以直接使用该属性
    private String title;//书名
    private String author;//作者
    private String isbon;//编号
    private String date;//出版日期
    private String press;//出版社
//5个参数的构造函数，方便实例化对象过程直接为属性赋值，不需对象再一一访问
    public Book(String title,String author,String isbon,String date,String press){
        this.title=title;
        this.author=author;
        this.isbon=isbon;
        this.date=date;
        this.press=press;
    }
    //对外使用set/get方法修改读取属性的值
    public String getTitle(){//外部通过该方法读取title属性的值，有返回值，方法是公共的
        return title;
    }

    public void setTitle(String title) {//外部通过该方法给私有属性title赋值，无返回值
        this.title = title;//利用this关键字将形参的值传递给成员变量
    }

    public String getAuthor() {//外部通过该方法读取author变量的值，String类型有返回值
        return author;
    }

    public void setAuthor(String author) {//外部通过该方法给私有属性author赋值
        this.author = author;//成员变量与局部变量名相同时使用this关键字处理和区分
    }

    public String getIsbon() {//外部通过该方法读取isbon属性的值
        return isbon;
    }

    public void setIsbon(String isbon) {//外部通过该方法给私有属性isbon赋值
        this.isbon = isbon;//成员变量与局部变量名相同时使用this关键字处理和区分
    }

    public String getDate() {//外部通过该方法读取date属性的值
        return date;
    }

    public void setDate(String date) {//外部通过该方法给私有属性date赋值
        this.date = date;
    }

    public String getPress() {
        return press;
    }

    public void setPress(String press) {
        this.press = press;
    }
    //定义display()方法，该方法可以直接被外部调用
    void display(){//定义一个非静态，无返回值的方法，需创建对象来调用
        System.out.println(" 书名叫：《"+title+"》 作者："+author+" 书号："+isbon+" 出版日期："+date+" 出版社："+press);
    }

    public static void main(String[] args) {//使用吗，main方法
        Book book=new Book("java与模式","阎宏","9787505380004","2002-10-01","电子工业出版社");
        book.display();//通过实例化对象直接调用display方法
    }
}
