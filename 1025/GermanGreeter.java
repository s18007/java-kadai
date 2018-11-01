public class GermanGreeter implements Greeter {
	@Override
	public String login(Acount guest) {
		return String.format("Guten Tag, %s", guest.getName());
	}
	
	@Override
	public String logout(Acount guest) {
		return "Aus Wiedersehen.";
	}

	@Override
	public String like(Acount guest) {
		return "Danke Schon";
	}
}
