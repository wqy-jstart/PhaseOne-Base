package 多态;

public class SuperWorker implements IWorker{

    @Override
    public void work() {
        System.out.println("我是高级工，正在维修设备!");
    }

    @Override
    public void lunch() {
        System.out.println("我是高级工，正在吃午饭！");
    }
}
