package application;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TuDienAnhViet {
private Map<String, String> tuDien;
    
    public TuDienAnhViet() {
        tuDien = new HashMap<>();
        khoiTaoDuLieu();
    }
    
    private void khoiTaoDuLieu() {
        // Thêm một số từ mẫu
        tuDien.put("hello", "xin chào");
        tuDien.put("goodbye", "tạm biệt");
        tuDien.put("computer", "máy tính");
        tuDien.put("keyboard", "bàn phím");
        tuDien.put("mouse", "chuột máy tính");
        tuDien.put("programming", "lập trình");
        tuDien.put("java", "ngôn ngữ lập trình Java");
        tuDien.put("algorithm", "thuật toán");
    }
    
    // Thêm từ mới
    public void themTu(String tuAnh, String tuViet) {
        if (tuDien.containsKey(tuAnh)) {
            System.out.println("Từ '" + tuAnh + "' đã tồn tại. Bạn có muốn cập nhật? (y/n)");
            Scanner sc = new Scanner(System.in);
            String luaChon = sc.nextLine().toLowerCase();
            if (luaChon.equals("y")) {
                tuDien.put(tuAnh, tuViet);
                System.out.println("Đã cập nhật từ '" + tuAnh + "'");
            }
        } else {
            tuDien.put(tuAnh, tuViet);
            System.out.println("Đã thêm từ '" + tuAnh + "'");
        }
    }
    
    // Tra từ
    public void traTu(String tuAnh) {
        if (tuDien.containsKey(tuAnh)) {
            System.out.println(tuAnh + ": " + tuDien.get(tuAnh));
        } else {
            System.out.println("Không tìm thấy từ '" + tuAnh + "' trong từ điển");
        }
    }
    
    // Xóa từ
    public void xoaTu(String tuAnh) {
        if (tuDien.containsKey(tuAnh)) {
            String tuViet = tuDien.remove(tuAnh);
            System.out.println("Đã xóa từ '" + tuAnh + "' (" + tuViet + ")");
        } else {
            System.out.println("Không tìm thấy từ '" + tuAnh + "' để xóa");
        }
    }
    
    // Hiển thị tất cả từ
    public void hienThiTatCa() {
        if (tuDien.isEmpty()) {
            System.out.println("Từ điển trống!");
            return;
        }
        
        System.out.println("\n=== TỪ ĐIỂN ANH-VIỆT ===");
        System.out.println(String.format("")) ;
        System.out.println("=".repeat(50));
        
        for (Map.Entry<String, String> entry : tuDien.entrySet()) {
            System.out.println(String.format(""));
        }
        System.out.println("Tổng số từ: " + tuDien.size());
    }
    
    // Tìm kiếm gần đúng
    public void timKiemGanDung(String tuKhoa) {
        System.out.println("\nKết quả tìm kiếm cho '" + tuKhoa + "':");
        boolean timThay = false;
        
        for (Map.Entry<String, String> entry : tuDien.entrySet()) {
            if (entry.getKey().toLowerCase().contains(tuKhoa.toLowerCase()) ||
                entry.getValue().toLowerCase().contains(tuKhoa.toLowerCase())) {
                System.out.println(String.format(""));
                timThay = true;
            }
        }
        
        if (!timThay) {
            System.out.println("Không tìm thấy kết quả nào");
        }
    }
    
    // Thống kê
    public void thongKe() {
        System.out.println("\n=== THỐNG KÊ TỪ ĐIỂN ===");
        System.out.println("Tổng số từ: " + tuDien.size());
        
        // Đếm số từ bắt đầu bằng các chữ cái
        Map<Character, Integer> thongKeChuCai = new HashMap<>();
        for (String tuAnh : tuDien.keySet()) {
            if (!tuAnh.isEmpty()) {
                char chuCaiDau = tuAnh.toLowerCase().charAt(0);
                thongKeChuCai.put(chuCaiDau, thongKeChuCai.getOrDefault(chuCaiDau, 0) + 1);
            }
        }
        
        System.out.println("\nThống kê theo chữ cái đầu:");
        for (Map.Entry<Character, Integer> entry : thongKeChuCai.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " từ");
        }
    }
}