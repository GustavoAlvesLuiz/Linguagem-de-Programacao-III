
public class Main {

	public static void main(String[] args) {
		Student maria = new Student(1, 999);
		maria.setNome("Maria");
		maria.setBirthDate("11/06/2000");
		maria.setCourse("SI");
		maria.setSemester((short)4);
		
		Professor emerson = new Professor(2, "217");
		emerson.setNome("Emerson");
		emerson.setLevel("Doutor");
		emerson.setArea("Informática");
		
		AT ju = new AT(3, "891");
		ju.setNome("Julia");
		ju.setArea("TI");
		ju.setRole("Técnica em Laboratório");
		
		printUserData(maria);
		printUserData(emerson);
		printUserData(ju);
	}
	
		private static void printUserData(User user) {
			System.out.println(user.formatPersonalData());
		}
}
