package Day01;
import javax.swing.JFrame;//向计算机打招呼创建窗口

public class Demo02 {
    public static void main(String[] args) {
        /*
         *这是第一个图形用户界面程序
         *使得Java Swing技术实现
         */
        //创建一个窗口，命名为win1，win2,win3
        JFrame win1 = new JFrame();
        JFrame win2 = new JFrame();
        JFrame win3 = new JFrame();
        //为win1窗口设置显示大小，宽1000像素，高500像素
        win1.setSize(1000,500);
        //为win2窗口设置显示大小，宽800像素，高600像素
        win2.setSize(800,600);
        //为win3窗口设置显示大小，宽1200，高1000
        win3.setSize(1200,1000);
        //为win1窗口设置显示位置，X100像素，Y20像素
        win1.setLocation(100,20);
        //为win2窗口设置显示位置，X80像素，Y40像素
        win2.setLocation(80,40);
        //为win3窗口设置显示位置，X100像素，Y100像素
        win3.setLocation(100,100);
        //设置居中窗口
        //setlocationRelativeTo 设置位置相当于 某个窗口居中
        //如果没有（null）窗口，按照当前屏幕居中处理
        //win1，win2，win3一起居中
        win1.setLocationRelativeTo(null);
        win2.setLocationRelativeTo(null);
        win3.setLocationRelativeTo(null);

        //将win1和win2和win3显示出来
        win1.setVisible(true);
        win2.setVisible(true);
        win3.setVisible(true);
    }
}
