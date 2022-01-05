package moduleTwo;

import moduleOne.ClassOne;

public class ClassTwo {
	public static void main(String[] args) {
		ClassOne obj_ClassOne =new ClassOne();
		int c= obj_ClassOne.add(20, 25);
		int d= obj_ClassOne.add(20, 25, 30);
		System.out.println(c+d);
	}
	
}
