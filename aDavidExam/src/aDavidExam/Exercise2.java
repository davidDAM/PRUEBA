package aDavidExam;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Exercise2 {

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

			while ((l = b.readLine()) != null) {
				list.add(l);

			}
			Collections.reverse(list);
			Set<String> h2 = new HashSet<String>(list);

			for (String s : list) {
				if (h2.add(s)) {
					p.println(s);
				}

			}
			
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
