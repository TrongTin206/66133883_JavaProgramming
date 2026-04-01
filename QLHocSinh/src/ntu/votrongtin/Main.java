package ntu.votrongtin;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// cau 2a
		HocSinh h1 = new HocSinh("Nguyen Thanh Nguyen", "66CNTT3", (short)20);
		HocSinh h2 = new HocSinh("Nguyen Van B", "66CNTT2", (short)36);
		// cau 2b
		Scanner sc = new Scanner(System.in); // khai bao lop Scanner
		
//		HocSinh h3 = new HocSinh(); // tao moi hs3
//		String tenhs3 = sc.nextLine();
//		String lophs3 = sc.nextLine();
//		short tuoihs3 = sc.nextShort();
//		h3.setTenHS(tenhs3);
//		h3.setLopHS(lophs3);
//		h3.setTuoiHS(tuoihs3);
//		
//		HocSinh h4 = new HocSinh();
//		String tenhs4 = sc.nextLine();
//		String lophs4 = sc.nextLine();
//		short tuoihs4 = sc.nextShort();
//		h4.setTenHS(tenhs4);
//		h4.setLopHS(lophs4);
//		h4.setTuoiHS(tuoihs4);
		// cau 3a
		int n = sc.nextInt();
		ArrayList<HocSinh> ds = new ArrayList<HocSinh>();
		HocSinh hs = new HocSinh();
		String ten, lop;
		short tuoi;
		for(int i = 0; i < n; i++)
		{
			ten = sc.nextLine();
			lop = sc.nextLine();
			tuoi = sc.nextShort();
			hs.setTenHS(ten);
			hs.setLopHS(lop);
			hs.setTuoiHS(tuoi);
			ds.add(hs);
		}
		//cau 3b
		for(HocSinh a: ds)
		{
			System.out.println(a.toString());
		}
		//cau 4a
		ten = sc.nextLine();
		lop = sc.nextLine();
		tuoi = sc.nextShort();
		hs.setTenHS(ten);
		hs.setLopHS(lop);
		hs.setTuoiHS(tuoi);
		ds.add(hs);
		//cau 4b
		for(HocSinh a: ds)
		{
			System.out.println(a.toString());
		}
		//cau 5a
		for(int i = 0; i < n; i++)
		{
			HocSinh hstim = ds.get(i);
			if(hstim.getTenHS() == "Hoa")
			{
				ds.remove(hstim);
				break;
			}
		}
		//cau 5b
		for(HocSinh a: ds)
		{
			System.out.println(a.toString());
		}
	}
}
