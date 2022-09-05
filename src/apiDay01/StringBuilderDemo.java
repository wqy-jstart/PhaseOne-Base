package apiDay01;

public class StringBuilderDemo {
    public static void main(String[] args) {
        String str ="好好学习Java";
        /**
         * 在builder基础上修改
         */
        //1)复制str的内容到builder中-----好好学习Java
        StringBuilder builder = new StringBuilder(str);
        System.out.println(str); //好好学习Java

        //2)append():追加内容---在末尾追加
        builder.append(",为了找个好工作");
        System.out.println(builder); //好好学习Java，为了找个好工作

        //3)replace():替换部分内容(含头不含尾)
        //将下标为9到15的内容替换为-----就是为了改变世界
        builder.replace(9,16,"就是为了改变世界");
        System.out.println(builder); //好好学习Java，就是为了改变世界

        //4)delete():删除部分内容(含头不含尾)
        builder.delete(0,8); //删除下标为0到7的部分
        System.out.println(builder); //,就是为了改变世界

        //5)insert():插入内容
        builder.insert(0,"活着");
        System.out.println(builder);
        System.out.println("===============================================");
       //StringBuilder的创建方式
        StringBuilder builder1 = new StringBuilder(); //空字符串
        System.out.println(builder1); //输出空格
        StringBuilder builder2 = new StringBuilder("abc"); //abc串
        System.out.println(builder2); //输出abc串
        //StringBuilder未重写equals()方法，比较的是地址
        System.out.println(builder1.equals(builder2));
        //基于String来创建StringBuilder
        String str1 = "abc"; //String类型的abc
        StringBuilder builder3 = new StringBuilder(str1); //abc串型
        System.out.println(builder3);
        String str2 = builder3.toString(); //将builder3转换为String类型
        System.out.println(str2);
    }
}
