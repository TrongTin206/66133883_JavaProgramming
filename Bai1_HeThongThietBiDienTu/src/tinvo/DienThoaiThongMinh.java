package tinvo;

public class DienThoaiThongMinh extends ThietBiDienTu
implements CoTheKetNoiInternet, CoTheCamUng {

	public DienThoaiThongMinh(String ten, double gia, String hangSanXuat) {
		super(ten, gia, hangSanXuat);
	}

	public void bat() {
		System.out.println(ten + " đang bật...");
	}
	public void tat() {
		System.out.println(ten + " đang tắt...");
	}
	public void ketNoiWifi() {
		System.out.println(ten + " đang kết nối Wifi...");
	}
	public void ngatKetNoi() {
		System.out.println(ten + " đã ngắt Wifi");
	}
	public void cham() {
		System.out.println("Đang chạm màn hình " + ten);
	}
	public void vuot() {
		System.out.println("Đang vuốt màn hình " + ten);
	}
}