package tinvo;

abstract class NhanVien {
	 protected String maNV;
	 protected String hoTen;

	 public NhanVien(String maNV, String hoTen) {
		 this.maNV = maNV;
		 this.hoTen = hoTen;
	 }
	 public void hienThiThongTin() {
	     System.out.println("Mã nhân viên: " + maNV);
	     System.out.println("Họ tên: " + hoTen);
	 }
	 public abstract double tinhThuong();
}
