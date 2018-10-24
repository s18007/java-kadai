public class SpanishGreeter implements Greeter {
	@Override
	public void login(Acount guest) {
		System.out.println(String.format("Buenos Dias, %s", guest.getName()));
	}

	@Override
	public void logout(Acount guest) {
		System.out.println("Hasta luego");	
	}
	
	@Override
	public void like(Acount guest) {
		System.out.println("Gracias");
	}
}
