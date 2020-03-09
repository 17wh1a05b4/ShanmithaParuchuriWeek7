package behavioral;

public class iterMainMethod {
	public static void main(String[] args) {
		students std = new students();
		System.out.println("List of Students:");
		for(iterator itr = std.getIterator();itr.hasnext();){
			String student = (String)itr.next();
			System.out.println(student + " ");
		}
	}
}
