package tinvo2006;

public class Main {
    public static void main(String[] args) {

        HinhChuNhat h1 = new HinhChuNhat("Hình Chữ Nhật", "Đỏ", 5, 3);
        HinhTron h2 = new HinhTron("Tròn", "Xanh", 2);
        HinhTamGiac h3 = new HinhTamGiac("Hình Tam Giác", "Vàng", 3, 4, 5);

        System.out.println("Hình Chữ Nhật");
        System.out.println("Diện tích: " + h1.tinhDienTich());
        System.out.println("Chu vi: " + h1.tinhChuVi());

        System.out.println("\nHình Tròn");
        System.out.println("Diện tích: " + h2.tinhDienTich());
        System.out.println("Chu vi: " + h2.tinhChuVi());

        System.out.println("\nHình Tam Giác");
        System.out.println("Diện tích: " + h3.tinhDienTich());
        System.out.println("Chu vi: " + h3.tinhChuVi());
    }
}
