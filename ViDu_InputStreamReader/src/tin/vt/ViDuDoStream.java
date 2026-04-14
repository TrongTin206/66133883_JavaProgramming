package tin.vt;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

class ViDuDoStream {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fInput = new FileInputStream("baitho.txt");
		
		//Khai báo biến đối tượng InputStreamReader
		InputStreamReader ipReader = new InputStreamReader(fInput);
		//Khai báo biến đối tượng buffer 
		BufferedReader bufReader = new BufferedReader(ipReader);
		
		//Đọc dữ liệu từ bàn phím, cất vào biến chuỗi
		String line1 = bufReader.readLine(); 
		//In ra dòng đọc được
		System.out.println(line1);
		String line2 = bufReader.readLine(); 
		System.out.println(line2);
	}

}
