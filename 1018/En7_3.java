import java.util.HashMap;
import java.util.Map;

public class En7_3 {
	public static void En7_3(String[] args) {
		Map<String, String> fruits = new HashMap<>();
		fruits.put("りんご", "apple");
		fruits.put("orange", "オレンジ");
		fruits.put("banana", "バナナ");

		System.out.println(fruits.get("りんご"));
	}
}
