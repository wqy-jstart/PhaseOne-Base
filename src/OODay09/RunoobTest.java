package OODay09;
//在使用 StringBuffer 类时，每次都会对 StringBuffer 对象本身进行操作，
//而不是生成新的对象，所以如果需要对字符串进行修改推荐使用 StringBuffer。
public class RunoobTest{
    public static void main(String args[]){
        StringBuilder sb = new StringBuilder(10);//创建一个对象，有十位
        sb.append("Runoob..");//将内容由前往后填充进去
        System.out.println(sb);
        sb.append("!");//将内容填进去
        System.out.println(sb);
        sb.insert(8, "Java");//由第八个下标开始填充Java内容
        System.out.println(sb);
        sb.delete(5,8);//下标由第5个开始包括5删除到第8个下标，共三个元素
        System.out.println(sb);
    }
}

