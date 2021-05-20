package filesandio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PhoneNumbers {
	public static void main(String[] args) throws IOException {
		BufferedReader br1 = new BufferedReader(new FileReader("phoneOne.txt"));
		BufferedReader br2 = new BufferedReader(new FileReader("phoneTwo.txt"));

		List<String> phoneBookOne = new ArrayList<String>();
		List<String> phoneBookTwo = new ArrayList<String>();

		String number;
		while ((number = br1.readLine()) != null) {
			phoneBookOne.add(number);
		}

		while ((number = br2.readLine()) != null) {
			phoneBookTwo.add(number);
		}

		BufferedWriter bw = new BufferedWriter(new FileWriter("phoneThree.txt"));
		for (String num : phoneBookOne) {
			if (!phoneBookTwo.contains(num)) {
				bw.write(num);
				bw.newLine();
			}
		}

		br1.close();
		br2.close();
		bw.close();
	}
}
