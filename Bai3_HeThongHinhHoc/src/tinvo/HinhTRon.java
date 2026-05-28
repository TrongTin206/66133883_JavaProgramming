package tinvo;

public class HinhTRon extends HinhHoc
	implements CoTheQuay, CoTheDiChuyen {
	private double banKinh;
	public HinhTRon(String mauSac, double banKinh) {
		super(mauSac);
		this.banKinh = banKinh;
	}
	public double tinhDienTich() {
		return Math.PI * banKinh * banKinh;
	}
	public void quay(double goc) {
		System.out.println("Hình tròn quay " + goc + " độ");
	}
	public void diChuyen(double x, double y) {
		System.out.println("Hình tròn di chuyển đến (" + x + ", " + y + ")");
	}
}

