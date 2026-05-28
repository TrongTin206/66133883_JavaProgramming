package tinvo;

public class MayTinhBang extends ThietBiDienTu
implements CoTheKetNoiInternet, CoTheCamUng {

	public MayTinhBang(String ten, double gia, String hangSanXuat) {
		super(ten, gia, hangSanXuat);
	}
	public void bat() {
		System.out.println(ten + " đang bật...");
	}
	public void tat() {
		System.out.println(ten + " đang tắt...");
	}
	public void ketNoiWifi() {
		System.out.println(ten + " kết nối Wifi thành công");
	}
	public void ngatKetNoi() {
		System.out.println(ten + " đã ngắt mạng");
	}
	public void cham() {
		System.out.println("Chạm trên tablet");
	}

	public void vuot() {
		System.out.println("Vuốt trên tablet");
	}
}
