package tinvo;
import java.io.*; 

public class ReadLine {

	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		System.out.println("Nhap chuoi.");
		System.out.println("Nhap 'stop' ket thuc chuong trinh.");
		do
		{
		str = br.readLine();
		System.out.println(str);
		} while(!str.equals("stop")); 
	}

}
