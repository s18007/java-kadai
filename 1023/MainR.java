import java.io.*;

public class MainR {
	private static final String LINE_SEPARATOR = System.lineSeparator();

	public static void main(String[] args) {
		System.out.println(readFromFile("test.txt");
	}

	public static String readFromFile(String fileName) {
		File file = new File(FileNmae);
		StringBuilder sb = new StringBuilder();
		
		try (
				FielReader fr = new FileReader(File);
				BufferedReader br = new BufferedReader(fr);
		) {
			String line;
			while ((line = br.readLine()) != null) {
				sb.append(line).append(LINE_SEPARATOR);
			}
			return sb.toString();
		} catch (FileNotFoundException e) {
			System.err.println(String.format("ファイルが見つかりません: %s", fileName));
			return null;
		} catch (IOException e) {
			System.err.println(String.format("ファイル読み込みに失敗しました。: %s", fileName));
			return null;
		}
	}
}
