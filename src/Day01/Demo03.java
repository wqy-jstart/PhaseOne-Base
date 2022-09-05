package Day01;
import com.sun.xml.internal.ws.wsdl.writer.document.StartWithExtensionsType;
import javax.swing.*;
import java.awt.*;
import javax.swing.JTextField;
public class Demo03 {
    public static void main(String[] args) {
        JFrame win = new JFrame("年龄计算器-武清源");//首先创建一个窗口和窗口标题
        win.setSize(600,280);//调整窗口的大小
        win.setLocationRelativeTo(null);//设置窗口居中

        //组装 窗口框->面版->标签
        JPanel panel = new JPanel();//面版
        JLabel label = new JLabel("年龄:");//标签
        Font font = new Font("黑体",Font.BOLD,60);//创建一个新字体，"黑体":字体名称 BOLD:粗体
        label.setFont(font);//为标签设置新字体
        
        JTextField text = new JTextField();//创建一个文本输入框：JTextFiled 名字为 text
        text.setPreferredSize(new Dimension(120,60));//setPreferredSize 设置首选（必须的）大小
        JButton btn1 = new JButton("开始计算");//创建按钮
        btn1.setPreferredSize(new Dimension(100,60));
        JButton btn2 = new JButton("重置");
        btn2.setPreferredSize(new Dimension(100,60));
        JLabel result = new JLabel("结果");//显示计算结果的标签
        //创建按钮事件，当按钮按下时候，自动执行代码
        //Action:动作，listener：监听器
        btn1.addActionListener(e -> {
            System.out.println(text.getText());
            result.setText("您已经生活了"+text.getText()+"年");
        });
        btn2.addActionListener(e -> {
            System.out.println("重置");
        });
        result.setPreferredSize(new Dimension(200,90));

        panel.add(label);//面板上添加标签
        panel.add(text);//文本框添加在标签后面
        panel.add(btn1);
        panel.add(btn2);
        panel.add(result);
        win.add(panel);//窗口中添加面板
        win.setVisible(true);
    }
}
