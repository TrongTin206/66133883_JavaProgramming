package tinvo;

public class NhanVienVanPhong extends NhanVien
	implements CoTheTinhLuong, CoTheXepLoai {
	private double luongCoBan;
	public NhanVienVanPhong(
		String maNV,
		String hoTen,
		double luongCoBan) {
			super(maNV, hoTen);
			this.luongCoBan = luongCoBan;
		}
	public double tinhLuong() {
		return luongCoBan;
	}
	public String xepLoai() {
		return "Nhân viên giỏi";
	}
	public double tinhThuong() {
		return tinhLuong() * 0.1;
	}
}
