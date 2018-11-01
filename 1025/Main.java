public class Main {
	public static void main(String[] args) {
		Acount guest = new Acount(args[0], Country.valueOf(args[1]));

		Greeter greeter = GreeterFactory.getGreeter(guest);

		System.out.println(greeter.login(guest));
		System.out.println(greeter.logout(guest));
		System.out.println(greeter.like(guest));
	}
}
