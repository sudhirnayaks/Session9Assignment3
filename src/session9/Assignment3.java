package session9;
import java.util.HashMap;

public class Assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, String> employee=new HashMap<>();
		employee.put(111,"Sudhir");
		employee.put(222, "Nayak");
		employee.put(333, "Sujir");
		employee.put(444, "Bahubali");
		
	    System.out.println("****** Displaying only Values************");
		System.out.println(employee.values());

	}

}
