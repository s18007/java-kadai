public class JapaneseGreeter implements Greeter {
	@Override
	public String login(Acount guest) {
		return String.format("こんにちは、%sさん。", guest.getName());
	}

	@Override
	public String logout(Acount guest) {
		return "さようなら。";
	}

	@Override
	public String like(Acount guest) {
		return "ありがとう。";
	}
}
