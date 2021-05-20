package filesandio;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class ListingFiles {
	public static void main(String[] args) {
		try {
			File directory = new File("F:\\Training\\Operators\\Que-3");
			List<String> textFiles = new ArrayList<String>();

			if (directory.isDirectory()) {
				File[] files = directory.listFiles();
				for (File f : files) {
					String location = f.getAbsolutePath();
					if (location.substring(location.length() - 4).equals(".txt")) {
						textFiles.add(location);
					}
				}
			System.out.println(textFiles);
			} else {
				System.out.println("Given location is not a directory");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
