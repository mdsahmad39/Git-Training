package filesandio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class DataCopying {
	public static void main(String[] args) {
		BufferedReader br;
		BufferedWriter bw;
		try {
			br = new BufferedReader(new FileReader("input.txt"));
			bw = new BufferedWriter(new FileWriter("output.txt"));
			String s;
			while((s = br.readLine()) != null) {
				bw.write(s);
				bw.newLine();
			}
			bw.close();
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
