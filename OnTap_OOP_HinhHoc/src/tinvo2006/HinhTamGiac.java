package tinvo2006;

public class HinhTamGiac extends HinhHoc {
    private double a, b, c;

    public HinhTamGiac(String ten, String mauSac, double a, double b, double c) {
        super(ten, mauSac);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public boolean kiemTraHopLe() {
        return (a + b > c) && (a + c > b) && (b + c > a);
    }

    public double tinhChuVi() {
        if (!kiemTraHopLe()) return 0;
        return a + b + c;
    }

    public double tinhDienTich() {
        if (!kiemTraHopLe()) return 0;

        double p = tinhChuVi() / 2;

        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}