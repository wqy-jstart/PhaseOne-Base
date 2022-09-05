package OODay01;

public class OverloadDemo {
    public static void main(String[] args) {
        Aoo a=new Aoo();
        a.show();
        a.show(19);
        a.show("武清源");
        a.show(19,"武清源");
        a.show("武清源",19);
    }
}
