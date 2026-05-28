package tinvo;

abstract class ThietBiDienTu {
    protected String ten;
    protected double gia;
    protected String hangSanXuat;

    public ThietBiDienTu(String ten, double gia, String hangSanXuat) {
        this.ten = ten;
        this.gia = gia;
        this.hangSanXuat = hangSanXuat;
    }

    public abstract void bat();
    public abstract void tat();

    public void hienThiThongTin() {
        System.out.println("Tên: " + ten);
        System.out.println("Giá: " + gia);
        System.out.println("Hãng sản xuất: " + hangSanXuat);
    }
}