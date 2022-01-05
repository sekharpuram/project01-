package moduleTwo;

public class ClassThree {
private  String name;
private int m1,m2,m3;

public ClassThree(String name,int m1,int m2,int m3) {
	this.name=name;
	this.m1=m1;
	this.m2=m2;
	this.m3=m3;
}

public ClassThree(String name,int m1) {
	this.name=name;
	this.m1=m1;

}

public ClassThree() {
}

public static void main(String[] args) {
	 //ClassThree obj=new ClassThree();
	// obj.name="mohan";
ClassThree obj1_ClassThree =new ClassThree("sekhar",25,12,22);

ClassThree obj2_ClassThree =new ClassThree("sekhar",2);

ClassThree obj3_ClassThree =new ClassThree();

//obj_ClassThree.name = "Mohan
//obj_ClassThree
}

}
