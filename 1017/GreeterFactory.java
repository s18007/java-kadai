public class GreeterFactory {
	public static Greeter getGreeter(Acount guest) {
			switch (guest.getCountry()) {
			case JAPAN:
				return new JapaneseGreeter();
			case FRANCE:
				return new FrenchGreeter();
			case GERMANY:
				return new GermanGreeter();
			case USA:
				return new EnglishGreeter();
			case SPAIN:
			default:	
				return new SpanishGreeter();	
			}
	}
}
