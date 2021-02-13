public class Classroom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Wilder wilder1 = new Wilder("Ralf",true);
		
		Wilder wilder2 = new Wilder("Steffen",true);
		
		Wilder wilder3 = new Wilder("Arne");
		
		Wilder wilder4 = new Wilder("");		
		wilder4.setFirstname("Claus");
		wilder4.setPresent(false);
		
		System.out.println(wilder1.whoAmI());
		System.out.println(wilder2.whoAmI());
		System.out.println(wilder3.whoAmI());
		System.out.println(wilder4.whoAmI());
		

	}

}