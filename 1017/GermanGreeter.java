public class GermanGreeter implements Greeter {
	@Override
	public void login(Acount guest) {
		System.out.println(String.format("Guten Tag, %s", guest.getName()));
	}
	
	@Override
	public void logout(Acount guest) {
		System.out.println("Aus Wiedersehen.");
	}

	@Override
	public void like(Acount guest) {
		System.out.println("Danke Schon");
	}
}
