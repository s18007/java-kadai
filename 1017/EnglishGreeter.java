public class EnglishGreeter implements Greeter {
	@Override
	public void login(Acount guest) {
		System.out.println(String.format("Hello, %s", guest.getName()));
	}

	@Override
	public void logout(Acount guest) {
		System.out.println("Goodbye.");
	}

	@Override
	public void like(Acount guest) {
		System.out.println("Thank you");
	}
}
