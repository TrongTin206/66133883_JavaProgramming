package tinvo;

public class Main {
	public static void main(String[] args) {

        System.out.println("HỆ THỐNG NHÂN VIÊN\n");
        NhanVienVanPhong vanPhong =new NhanVienVanPhong("Văn Phòng","Nguyễn Văn Nam",12000000 );
        vanPhong.hienThiThongTin();
        System.out.println("Lương: " + vanPhong.tinhLuong());
        System.out.println("Thưởng: " + vanPhong.tinhThuong());
        System.out.println("Xếp loại: " + vanPhong.xepLoai());
        
        NhanVienKinhDoanh kinhDoanh =new NhanVienKinhDoanh("Kinh Doanh","Trần Thị Nga",90000000);
        kinhDoanh.hienThiThongTin();
        System.out.println("Lương: " + kinhDoanh.tinhLuong());
        System.out.println("Thưởng: " + kinhDoanh.tinhThuong());
        System.out.println("Xếp loại: " + kinhDoanh.xepLoai());
        System.out.println("\n");

        QuanLy quanLy =new QuanLy("Quản Lý","Lê Văn Cường",30000000);
        quanLy.hienThiThongTin();
        System.out.println("Lương: " + quanLy.tinhLuong());
        System.out.println("Thưởng: " + quanLy.tinhThuong());
        System.out.println("Xếp loại: " + quanLy.xepLoai());
    }
}
