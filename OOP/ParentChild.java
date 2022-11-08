package OOP;

public class ParentChild extends Parent {
	void show() {
		System.out.println("Dear Child");
		super.show();//excess Parent's class method
	}

}
