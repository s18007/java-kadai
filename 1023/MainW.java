import java.io.*;

public class MainW {
	public static void main(String[] args) {
		final String fileName = "Test.txt";
		final String content = "abc";
		if (writeToFile(fileName, content)) {
			System.out.println(String.format("ファイルへの書き込みに成功しました。: %s", fileName));
				
		} else {
		System.out.println(String.format("ファイルへの書き込みに失敗しました。: %s", fileName));
		}
	}

	private static boolean writeToFile(String fileName, String context) {
		File file = new File(fileName);
		try (
				FileWriter fw = new FileWriter(file);
				BufferedWriter bw = new BufferedWriter(fw);
				printWriter pw = new PrintWriter(bw);
		) {
				pw.println(context);
				return true;
		} catch (IOException e) {
			return false;
		}
	}
}
