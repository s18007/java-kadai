public class JapaneseGreeter implements Greeter {
	@Override
	public void login(Acount guest) {
		System.out.println(String.format("こんにちは、%sさん。", guest.getName()));
	}

	@Override
	public void logout(Acount guest) {
		System.out.println("さようなら。");
	}

	@Override
	public void like(Acount guest) {
		System.out.println("ありがとう。");
	}
}
