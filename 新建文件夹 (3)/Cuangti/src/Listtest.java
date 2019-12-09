import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Listtest {
         /*
		 * 用于存放备选课程的List
		 */
		public List courseToSelect;
		public ListTest() {
			this.courseToSelect=new ArrayList();
		}
		/*
		 * 用于往courseToSelect中添加备选课程
		 */
		public void testAdd() {
			//创建一个课程对象，并通过调用add方法，添加到备选课List中		
		Course cr1=new Course1("1","数据结构")；
				courseToSelect.add(cr1);
		Course temp=courseToSelect.get(0);
		System.out.println("添加课程："+temp.id+":"+temp.name);
		
		Course cr2=new Course2("2","c语言")；
				courseToSelect.add(cr2);
		Course temp2=courseToSelect.get(0);
		System.out.println("添加课程："+temp2.id+":"+temp2.name);
		}
		
		public static void main(String[] args) {
			ListTest it=new ListTest();
			It.testAdd();
			/*
			 * 删除List中的元素
			 */
			
			punlic void testRemove() {
				Course cr=(Course)coursesToSelect.get(2);
				System.out.println("即将删除2位置上的课程！");
				courseToSelect.remove(2);
				System.out.println("成功删除课程！")；
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
