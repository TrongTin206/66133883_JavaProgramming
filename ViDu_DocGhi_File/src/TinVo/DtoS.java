package TinVo;

import java.io.*;
public class DtoS {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileReader fr = new FileReader("D:\\testUnicode.txt");
		BufferedReader br = new BufferedReader(fr);
		String s;
		while((s = br.readLine()) != null)
		{
		System.out.println(s);
		}
		fr.close();
	}

}
