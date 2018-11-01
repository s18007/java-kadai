public class EnglishGreeter implements Greeter {
	@Override
	public String login(Acount guest) {
		return String.format("Hello, %s", guest.getName());
	}

	@Override
	public String logout(Acount guest) {
		return "Goodbye.";
	}

	@Override
	public String like(Acount guest) {
		return "Thank you";
	}
}
