import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JLabel;  
public class zbe extends JFrame{     //��Ҫ�̳�JFrame{
		    public TEST02(String title)
		     {
		         JFrame jf = new JFrame(title);    
		         Container conn = jf.getContentPane();    //�õ����ڵ�����
		         JLabel L1 = new JLabel("Hello,world!");    //����һ����ǩ �����ó�ʼ����         
		         conn.add(L1);                 //�������м����ǩ
		        jf.setBounds(200,200,300,200); //���ô��ڵ����� ����λ���Լ����ڵĴ�С
		         jf.setVisible(true);//���ô��ڿɼ�
		         jf.setDefaultCloseOperation(DISPOSE_ON_CLOSE); //���ùرշ�ʽ ��������õĻ� �ƺ��رմ���֮�󲻻��˳�����
		     }     
		     public static void main(String[] args) {
			new TEST02("����");        //��������
		     }
		 }
