package QuanLySanPham;

public class Main {
	public static void main(String[] args) {
	QuanLySanPham ql = new QuanLySanPham();

    ql.them(new SanPham("SP01", "Laptop", 1500, 5));
    ql.them(new SanPham("SP02", "Chuot", 20, 50));
    ql.them(new SanPham("SP03", "Ban phim", 45, 8));
    ql.them(new SanPham("SP04", "Man hinh", 300, 12));

    System.out.println("Danh sach:");
    ql.hienThi();

    System.out.println("\nTim 'ban':");
    ql.timTheoTen("ban");

    System.out.println("\nSap xep tang:");
    ql.sapXepTang();
    ql.hienThi();

    System.out.println("\nTong gia tri kho:");
    System.out.println(ql.tongGiaTri());

    System.out.println("\nSap het hang:");
    ql.sapHetHang();

    System.out.println("\nXoa SP02:");
    ql.xoaTheoMa("SP02");
    ql.hienThi();
	}
}
