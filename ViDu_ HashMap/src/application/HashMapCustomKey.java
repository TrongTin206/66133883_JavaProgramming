package application;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HashMapCustomKey {
	 public static void main(String[] args) {
	        System.out.println("=== HASHMAP VỚI ĐỐI TƯỢNG TÙY CHỈNH LÀM KEY ===\n");
	        
	        // Tạo HashMap với key là SinhVien, value là Danh sách điểm
	        Map<SinhVien, Map<String, Double>> bangDiem = new HashMap<>();
	        
	        // Tạo các sinh viên
	        SinhVien sv1 = new SinhVien("SV001", "Nguyễn Văn A");
	        SinhVien sv2 = new SinhVien("SV002", "Trần Thị B");
	        SinhVien sv3 = new SinhVien("SV003", "Lê Văn C");
	        
	        // Thêm dữ liệu điểm cho sinh viên
	        Map<String, Double> diemSv1 = new HashMap<>();
	        diemSv1.put("Toán", 8.5);
	        diemSv1.put("Lý", 7.5);
	        diemSv1.put("Hóa", 9.0);
	        
	        Map<String, Double> diemSv2 = new HashMap<>();
	        diemSv2.put("Toán", 7.0);
	        diemSv2.put("Lý", 8.0);
	        diemSv2.put("Hóa", 7.5);
	        
	        Map<String, Double> diemSv3 = new HashMap<>();
	        diemSv3.put("Toán", 9.5);
	        diemSv3.put("Lý", 9.0);
	        diemSv3.put("Hóa", 8.5);
	        
	        // Đưa vào map chính
	        bangDiem.put(sv1, diemSv1);
	        bangDiem.put(sv2, diemSv2);
	        bangDiem.put(sv3, diemSv3);
	        
	        // Hiển thị toàn bộ bảng điểm
	        System.out.println("=== TOÀN BỘ BẢNG ĐIỂM ===");
	        for (Map.Entry<SinhVien, Map<String, Double>> entry : bangDiem.entrySet()) {
	            System.out.println("\nSinh viên: " + entry.getKey());
	            System.out.println("Điểm các môn:");
	            for (Map.Entry<String, Double> diem : entry.getValue().entrySet()) {
	                System.out.println("  " + diem.getKey() + ": " + diem.getValue());
	            }
	        }
	        
	        // Tìm kiếm điểm của một sinh viên
	        System.out.println("\n=== TÌM ĐIỂM SINH VIÊN ===");
	        SinhVien svCanTim = new SinhVien("SV002", "Trần Thị B"); // Tạo đối tượng mới với cùng mã SV
	        
	        if (bangDiem.containsKey(svCanTim)) {
	            System.out.println("Tìm thấy sinh viên: " + svCanTim);
	            System.out.println("Điểm: " + bangDiem.get(svCanTim));
	        } else {
	            System.out.println("Không tìm thấy sinh viên");
	        }
	        
	        // Tính điểm trung bình của từng sinh viên
	        System.out.println("\n=== ĐIỂM TRUNG BÌNH TỪNG SINH VIÊN ===");
	        for (Map.Entry<SinhVien, Map<String, Double>> entry : bangDiem.entrySet()) {
	            double tongDiem = 0;
	            int soMon = 0;
	            
	            for (Double diem : entry.getValue().values()) {
	                tongDiem += diem;
	                soMon++;
	            }
	            
	            double diemTB = soMon > 0 ? tongDiem / soMon : 0;
	            System.out.printf("");
	        }
	        
	        // Thêm điểm mới cho sinh viên
	        System.out.println("\n=== THÊM ĐIỂM MÔN MỚI ===");
	        bangDiem.get(sv1).put("Văn", 8.0);
	        System.out.println("Sau khi thêm điểm Văn cho SV001:");
	        System.out.println(sv1 + ": " + bangDiem.get(sv1));
	        
	        // Xóa một môn học khỏi sinh viên
	        System.out.println("\n=== XÓA MÔN HỌC ===");
	        Double diemBiXoa = bangDiem.get(sv2).remove("Hóa");
	        System.out.println("Đã xóa môn Hóa của SV002, điểm: " + diemBiXoa);
	        System.out.println("Sau khi xóa: " + bangDiem.get(sv2));
	        
	        // Kiểm tra nếu không override equals() và hashCode()
	        System.out.println("\n=== LƯU Ý QUAN TRỌNG ===");
	        System.out.println("Khi dùng đối tượng tùy chỉnh làm key trong HashMap,");
	        System.out.println("PHẢI override equals() và hashCode()");
	        System.out.println("Nếu không, sẽ không tìm thấy key dù có cùng giá trị!");
	    }
	}

