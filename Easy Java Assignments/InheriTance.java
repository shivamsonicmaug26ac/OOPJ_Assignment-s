public class InheriTance {

    void parentMethod() {
        System.out.println("This is parent class");
    }
    
    public static void main(String[] args) {
        InheriTance parent = new InheriTance();
        Child child = new Child();
        
        parent.parentMethod();

        child.display();
        child.parentMethod();
    }
}

class Child extends InheriTance {
	void display() {
		System.out.println("This is child class");
	}
}