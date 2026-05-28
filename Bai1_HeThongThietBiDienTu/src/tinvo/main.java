package tinvo;

public class main {
	public static void main(String[] args) {

        System.out.println("HỆ THỐNG THIẾT BỊ ĐIỆN TỬ\n");
        DienThoaiThongMinh dienThoai = new DienThoaiThongMinh("iPhone 13 Pro Max",13000000,"Apple");
        dienThoai.hienThiThongTin();
        dienThoai.bat();
        dienThoai.ketNoiWifi();
        dienThoai.cham();
        dienThoai.vuot();
        System.out.println("\n-\n");

        MayTinhBang tablet =new MayTinhBang("iPad Air",18000000,"Apple");
        tablet.hienThiThongTin();
        tablet.bat();
        tablet.ketNoiWifi();
        System.out.println("\n-\n");
        
        Laptop victus =new Laptop("HP Victus 15",25000000,"HP");

        victus.hienThiThongTin();
        victus.bat();
        victus.ketNoiWifi();
        victus.ngatKetNoi();
        victus.tat();
    }
}

