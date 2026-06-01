package application;
import java.util.Scanner;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


class Main {
public static void main(String[] args) {
	TuDienAnhViet tuDien = new TuDienAnhViet();
    Scanner scanner = new Scanner(System.in);
    
    while (true) {
        System.out.println("\n=== TỪ ĐIỂN ANH-VIỆT ===");
        System.out.println("1. Tra từ");
        System.out.println("2. Thêm từ");
        System.out.println("3. Xóa từ");
        System.out.println("4. Hiển thị tất cả");
        System.out.println("5. Tìm kiếm gần đúng");
        System.out.println("6. Thống kê");
        System.out.println("7. Thoát");
        System.out.print("Chọn chức năng: ");
        
        int luaChon = 0;
        try {
            luaChon = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Vui lòng nhập số!");
            continue;
        }
        
        switch (luaChon) {
            case 1:
                System.out.print("Nhập từ tiếng Anh cần tra: ");
                String tuCanTra = scanner.nextLine().toLowerCase();
                tuDien.traTu(tuCanTra);
                break;
                
            case 2:
                System.out.print("Nhập từ tiếng Anh: ");
                String tuAnh = scanner.nextLine().toLowerCase();
                System.out.print("Nhập nghĩa tiếng Việt: ");
                String tuViet = scanner.nextLine();
                tuDien.themTu(tuAnh, tuViet);
                break;
                
            case 3:
                System.out.print("Nhập từ tiếng Anh cần xóa: ");
                String tuCanXoa = scanner.nextLine().toLowerCase();
                tuDien.xoaTu(tuCanXoa);
                break;
                
            case 4:
                tuDien.hienThiTatCa();
                break;
                
            case 5:
                System.out.print("Nhập từ khóa tìm kiếm: ");
                String tuKhoa = scanner.nextLine();
                tuDien.timKiemGanDung(tuKhoa);
                break;
                
            case 6:
                tuDien.thongKe();
                break;
                
            case 7:
                System.out.println("Cảm ơn đã sử dụng từ điển!");
                scanner.close();
                return;
                
            default:
                System.out.println("Lựa chọn không hợp lệ!");
        }
    }
}
}