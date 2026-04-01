package QuanLySanPham;

public class SanPham {
	private String maSP;
	private String tenSP;
	private double gia;
	private int soLuong;

	public SanPham(String maSP, String tenSP, double gia, int soLuong) {
	   this.maSP = maSP;
	   this.tenSP = tenSP;
	   this.gia = gia;
	   this.soLuong = soLuong;
	}
	public String getMaSP() {
	   return maSP;
	}
	public String getTenSP() {
	   return tenSP;
	}
	public double getGia() {
	   return gia;
	}
	public int getSoLuong() {
	   return soLuong;
	}
	public void hienThi() {
	    System.out.println(maSP + " | " + tenSP + " | " + gia + " | " + soLuong);
	}
}	

