package tinvo2006;

public class HinhTron extends HinhHoc {
    private double banKinh;

    public HinhTron(String ten, String mauSac, double banKinh) {
        super(ten, mauSac);
        this.banKinh = banKinh;
    }

    public double tinhDienTich() {
        return Math.PI * banKinh * banKinh;
    }

    public double tinhChuVi() {
        return 2 * Math.PI * banKinh;
    }
}
