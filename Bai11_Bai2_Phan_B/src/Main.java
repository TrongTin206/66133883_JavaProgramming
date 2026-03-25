import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        XuLyDanhSach ds = new XuLyDanhSach();

        System.out.print("Nhap so luong: ");
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            System.out.print("Nhap so: ");
            ds.them(sc.nextInt());
        }

        System.out.println("Danh sach:");
        ds.hienThi();

        ds.xoaTrung();
        System.out.println("Sau khi xoa trung:");
        ds.hienThi();

        ds.soLonThu2();
        ds.trungBinhChan();
        ds.tachChanLe();
        ds.daoNguoc();
    }
}
