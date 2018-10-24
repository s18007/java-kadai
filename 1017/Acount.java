public class Acount {
	private final String name;
	private final Country country;

	public Acount(String name, Country country) {
		this.name = name;
		this.country = country;
	}

	public String getName() {
		return name;
	}

	public Country getCountry() {
		return country;
	}
}
