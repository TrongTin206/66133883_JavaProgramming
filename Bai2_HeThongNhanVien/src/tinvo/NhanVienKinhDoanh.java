package tinvo;

public class NhanVienKinhDoanh extends NhanVien
	implements CoTheTinhLuong, CoTheXepLoai {

	private double doanhSo;

	public NhanVienKinhDoanh(
		String maNV,
		String hoTen,
		double doanhSo) {
			super(maNV, hoTen);
			this.doanhSo = doanhSo;
		}
	public double tinhLuong() {
		return doanhSo * 0.2;
	}
	public String xepLoai() {
		return "Xuất sắc";
	}
	public double tinhThuong() {
		return tinhLuong() * 0.2;
	}
}
