public class SpanishGreeter implements Greeter {
	@Override
	public String login(Acount guest) {
		return String.format("Buenos Dias, %s", guest.getName());
	}

	@Override
	public String logout(Acount guest) {
		return "Hasta luego";	
	}
	
	@Override
	public String like(Acount guest) {
		return "Gracias";
	}
}
