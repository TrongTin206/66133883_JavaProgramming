package tinvo;

public class HinhVuong extends HinhHoc
	implements CoTheQuay, CoTheDiChuyen {

	private double canh;
	public HinhVuong(String mauSac, double canh) {
		super(mauSac);
		this.canh = canh;
	}
	public double tinhDienTich() {
		return canh * canh;
	}
	public void quay(double goc) {
		System.out.println("Hình vuông quay " + goc + " độ");
	}
	public void diChuyen(double x, double y) {
		System.out.println("Hình vuông di chuyển đến (" + x + ", " + y + ")");
	}
}
