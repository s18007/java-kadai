public class FrenchGreeter implements Greeter {
	@Override
	public void login(Acount guest) {
		System.out.println(String.format("Bonjour, %s", guest.getName()));
	}

	@Override
	public void logout(Acount guest) {
		System.out.println("Au revoir.");
	}

	@Override
	public void like(Acount guest) {
		System.out.println("Merci beaucoup");
	}
}
