package tinvo;

public class Main {
	public static void main(String[] args) {
    System.out.println("HỆ THỐNG HÌNH HỌC NÂNG CAO\n");
    
    HinhTRon hinhTron =new HinhTRon("Đỏ",5);
    hinhTron.hienThiThongTin();
    hinhTron.quay(90);
    hinhTron.diChuyen(10, 20);
    System.out.println("\n");

    HinhVuong hinhVuong =new HinhVuong("Xanh",4);

    hinhVuong.hienThiThongTin();
    hinhVuong.quay(45);
    hinhVuong.diChuyen(5, 7);
    System.out.println("\n");

    HinhTamGiac hinhTamGiac =new HinhTamGiac("Vàng",6,8);
    hinhTamGiac.hienThiThongTin();
    hinhTamGiac.diChuyen(2, 3);
}
}