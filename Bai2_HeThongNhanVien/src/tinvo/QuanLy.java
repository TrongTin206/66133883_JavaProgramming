package tinvo;

public class QuanLy extends NhanVien
	implements CoTheTinhLuong, CoTheXepLoai {
	private double luong;
	public QuanLy(
		String maNV,
		String hoTen,
		double luong) {
			super(maNV, hoTen);
			this.luong = luong;
	}
	public double tinhLuong() {
		return luong;
	}
	public String xepLoai() {
		return "Quản lý xuất sắc";
	}
	public double tinhThuong() {
		return tinhLuong() * 0.3;
	}
}