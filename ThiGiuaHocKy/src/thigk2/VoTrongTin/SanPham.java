package thigk2.VoTrongTin;

public class SanPham {
	private String masanpham;
	private String tensanpham;
	private String loaisanpham;
	private double giasanpham;  
	
	public SanPham() {}
	
	public SanPham(String masanpham, String tensanpham, String loaisanpham, double giasanpham) {
		this.masanpham=masanpham;
		this.tensanpham=tensanpham;
		this.loaisanpham=loaisanpham;
		this.giasanpham=giasanpham;
	}
	public String getmasanpham() { 
		return masanpham;
		}
	public void setmasanpham(String masanpham) {
		this.masanpham=masanpham;
	}
	public String gettensanpham() {
		return  tensanpham;
	}
	public void settensanpham(String tensanpham) {
		this.tensanpham=tensanpham;
	}
	public String getloaisanpham() { 
		return masanpham;
		}
	public void setloaisanpham(String loaisanpham) {
		this.loaisanpham=loaisanpham;
	}
	public double getgiasanpham() { 
		return giasanpham;
		}
	public void setgiasanpham(double giasanpham) {
		this.giasanpham=giasanpham;
	}
	public void Xuat() {
		System.out.println(masanpham + " - " + tensanpham + " - " + loaisanpham + " - "+ giasanpham + " - ");
	}
}
	
	
	
	
