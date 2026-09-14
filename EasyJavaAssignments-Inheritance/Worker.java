
public class Worker {
	
	double salary;
	int hours;
	
//	for the information 
	
	void getInfo(double s, int h){
		this.salary = s;
		this.hours= h;
	}
	
	void  addsal(){
				
		if(salary < 500) {
			salary = salary + 10;
		}
		else {
			System.out.println("Your salary is grater than 500 ");
		}
		
	}
	
	void addWork() {
		
		if(hours > 6  ) {			
			salary = salary + 5;
		}
	}
	
	public static void main(String[] args) {
		
		Worker w1 = new Worker();
		
		w1.getInfo(400, 8);
		
		w1.addsal();
		w1.addWork();
		
		System.out.println(w1.salary);
		
		
	}

}
