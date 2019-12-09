import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JLabel;  
public class zbe extends JFrame{     //需要继承JFrame{
		    public TEST02(String title)
		     {
		         JFrame jf = new JFrame(title);    
		         Container conn = jf.getContentPane();    //得到窗口的容器
		         JLabel L1 = new JLabel("Hello,world!");    //创建一个标签 并设置初始内容         
		         conn.add(L1);                 //向容器中加入标签
		        jf.setBounds(200,200,300,200); //设置窗口的属性 窗口位置以及窗口的大小
		         jf.setVisible(true);//设置窗口可见
		         jf.setDefaultCloseOperation(DISPOSE_ON_CLOSE); //设置关闭方式 如果不设置的话 似乎关闭窗口之后不会退出程序
		     }     
		     public static void main(String[] args) {
			new TEST02("窗口");        //创建窗口
		     }
		 }
