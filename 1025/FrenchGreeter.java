public class FrenchGreeter implements Greeter {
	@Override
	public String login(Acount guest) {
		return String.format("Bonjour, %s", guest.getName());
	}

	@Override
	public String  logout(Acount guest) {
		return "Au revoir.";
	}

	@Override
	public String like(Acount guest) {
		return "Merci beaucoup";
	}
}
