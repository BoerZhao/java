import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Listtest {
         /*
		 * ���ڴ�ű�ѡ�γ̵�List
		 */
		public List courseToSelect;
		public ListTest() {
			this.courseToSelect=new ArrayList();
		}
		/*
		 * ������courseToSelect����ӱ�ѡ�γ�
		 */
		public void testAdd() {
			//����һ���γ̶��󣬲�ͨ������add��������ӵ���ѡ��List��		
		Course cr1=new Course1("1","���ݽṹ")��
				courseToSelect.add(cr1);
		Course temp=courseToSelect.get(0);
		System.out.println("��ӿγ̣�"+temp.id+":"+temp.name);
		
		Course cr2=new Course2("2","c����")��
				courseToSelect.add(cr2);
		Course temp2=courseToSelect.get(0);
		System.out.println("��ӿγ̣�"+temp2.id+":"+temp2.name);
		}
		
		public static void main(String[] args) {
			ListTest it=new ListTest();
			It.testAdd();
			/*
			 * ɾ��List�е�Ԫ��
			 */
			
			punlic void testRemove() {
				Course cr=(Course)coursesToSelect.get(2);
				System.out.println("����ɾ��2λ���ϵĿγ̣�");
				courseToSelect.remove(2);
				System.out.println("�ɹ�ɾ���γ̣�")��
				testForEach();
			}
			
  public static void main(String[] args) {
	  ListTest it=new ListTest();
	  It.testAdd();
	  It.testGet();
	  It.testIterator();
	  It.testForEach();
	  It.testModify();
	  It.testForEach();
	  It.testRemove();
  }
}
