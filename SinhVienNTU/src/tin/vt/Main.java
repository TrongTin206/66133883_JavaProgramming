package tin.vt;

public class Main {
	public static void main(String[] args) {

        // In ra tên trường của sinh viên NTU
        System.out.println(SinhVien.TEN_TRUONG);

        // In ra Hi, ...
        SinhVien.sayHi();

        SinhVien sv1 = new SinhVien(" Võ Trọng Tín", " CNTT-3");
        SinhVien sv2 = new SinhVien(" Phạm Văn Nam", " CNPT-15");

        sv1.sayHello();
        sv2.sayHello();
	}
}
