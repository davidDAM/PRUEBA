package aDavidExam;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercise1 {
	public static void main(String[] args) throws IOException {
		BufferedReader b = null;
		PrintWriter p = null;
		File input = new File(args[0]);
		File output = new File("tempfile.txt");
		try {
			b = new BufferedReader(new FileReader(input));
			p = new PrintWriter(new FileWriter(output));

			String l = null;
			List<String> list = new ArrayList<String>();

			int count = 0;
			int j = 0;
			String temp = null;
			while ((l = b.readLine()) != null) {
				list.add(l);
				count++;

			}
			Collections.reverse(list);
			//input.delete();
			//output.renameTo(input);
			
			for(int i=0;i<count;i++){
					
					temp = list.get(j);
					p.println(temp);;
					j++;
					
			}
			input.delete();
			output.renameTo(input);

		} finally {
			if (b != null) {
				b.close();
			}
			if (p != null) {
				p.close();
			}

		}

	}
}
