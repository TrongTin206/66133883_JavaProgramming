
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

	    public String getMaSP() { return maSP; }
	    public String getTenSP() { return tenSP; }
	    public double getGia() { return gia; }
	    public int getSoLuong() { return soLuong; }

	    public void setGia(double gia) { this.gia = gia; }
	    public void setSoLuong(int soLuong) { this.soLuong = soLuong; }

	    public String toString() {
	    	return maSP + " | " + tenSP + " | " + gia + " | " + soLuong;
	}
}
