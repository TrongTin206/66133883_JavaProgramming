package tinvo;

public class Laptop extends ThietBiDienTu
	implements CoTheKetNoiInternet {
	public Laptop(String ten, double gia, String hangSanXuat) {
		super(ten, gia, hangSanXuat);
	}
	public void bat() {
		System.out.println(ten + " khởi động...");
	}
	public void tat() {
	    System.out.println(ten + " đang shutdown...");
	}
	public void ketNoiWifi() {
	     System.out.println(ten + " đang kết nối internet...");
	}
	public void ngatKetNoi() {
	     System.out.println(ten + " đã ngắt internet");
	}
}