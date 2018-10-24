public class Main {
	public static void main(String[] args) {
		Acount guest = new Acount(args[0], Country.valueOf(args[1]));

		Greeter greeter = GreeterFactory.getGreeter(guest);

		greeter.login(guest);
		greeter.logout(guest);
		greeter.like(guest);
	}
}
