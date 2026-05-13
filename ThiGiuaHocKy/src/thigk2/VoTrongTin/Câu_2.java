package thigk2.VoTrongTin;
import java.util.ArrayList;
import java.util.Scanner;
/*
 * Quan ly san pham
 * Them, in ra va in ra theo yeu cau 
 *  Dung ArrayList luu danh sach 
 *  Hard-code 3 san pham ban dau
 *  Nhap them san pham tu ban phim
 *  Tim ra thuc pham chuc nang
 */
public class Câu_2 {
	public static void main(String[] args) {
		ArrayList<SanPham> DS = new ArrayList<>();
		
		 DS.add(new SanPham("001", "Vitamin", "thuc pham chuc nang ", 100));
	     DS.add(new SanPham("002", "Sua", "thuc pham ", 200));
	     DS.add(new SanPham("003", "Dau nanh", "thuc pham", 60));

	     System.out.println("Danh sach ban dau:");
	     for (SanPham sp : DS) {
	         sp.Xuat();
	}
	Scanner sc = new Scanner(System.in);
	System.out.print("Nhap ma san pham : ");
	String ma = sc.nextLine();
	System.out.print("Nhap ten san pham: ");
	String ten = sc.nextLine();
	System.out.print("Nhap loai san pham: ");
	String loai = sc.nextLine();
	System.out.print("Nhap gia san pham: ");
	double gia = sc.nextDouble();
	DS.add(new SanPham(ma, ten, loai, gia));
	System.out.println("\nDanh sach sau khi them cac san pham la:");
    for (SanPham sp : DS) {
        sp.Xuat();
    }
    System.out.println("\nSan pham loai thuc pham chuc nang la :");
    for (SanPham sp : DS) {
    	if (sp.getloaisanpham().equalsIgnoreCase("Thuc pham chuc nang")) {
            sp.Xuat();
        	}
    	}
	}
}
