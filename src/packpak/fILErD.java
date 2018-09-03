package packpak;

import java.io.FileReader;
import java.util.Scanner;
import java.io.BufferedReader;

public class fILErD {

	public static void main(String[] args) {
	int a ;
		FileReader fr =null;
		BufferedReader br = null;
		String path = "C:\\Users\\mdnas\\Desktop\\PuBg.txt";

		try {
			fr = new FileReader(path);
		} catch (Exception ex) {
			System.out.println("FILE NOT LOCATED");//my comment
		}

		try {
			br = new BufferedReader(fr);
			String data = "";
			while ((data = br.readLine()) != null) {
				System.out.println(data);
			
		}
				;
		} catch (Exception ex) {
			System.out.println("File is not readble");
		}
//Montaz bhai added in this group, montaz bhai please reply me a mail or add my number in whats app
		//i am sending how to commit
		//baki dui public koi?
	}

}
