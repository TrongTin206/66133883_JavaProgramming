package tinvo;

public class HinhTamGiac extends HinhHoc
	implements CoTheDiChuyen {

	private double day;
	private double chieuCao;
	public HinhTamGiac(
		String mauSac,
		double day,
		double chieuCao) {
			super(mauSac);
			this.day = day;
			this.chieuCao = chieuCao;
		}
	public double tinhDienTich() {
		return (day * chieuCao) / 2;
	}
	public void diChuyen(double x, double y) {
		System.out.println("Hình tam giác di chuyển đến (" + x + ", " + y + ")");
	}
}
