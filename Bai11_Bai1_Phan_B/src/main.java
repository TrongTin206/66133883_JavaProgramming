
public class main {
	 public static void main(String[] args) {
	        QuanLySanPham ql = new QuanLySanPham();

	        ql.themSP(new SanPham("SP01", "Laptop", 15000, 5));
	        ql.themSP(new SanPham("SP02", "Chuột", 200, 50));
	        ql.themSP(new SanPham("SP03", "Bàn phím", 500, 8));

	        System.out.println("Danh sách:");
	        ql.hienThi();

	        System.out.println("\nTìm 'lap':");
	        ql.timTheoTen("lap");

	        System.out.println("\nSắp xếp tăng:");
	        ql.sapXepTang();
	        ql.hienThi();

	        System.out.println("\nTổng giá trị kho:");
	        System.out.println(ql.tongGiaTri());

	        System.out.println("\nSắp hết hàng:");
	        ql.sapHetHang();
	    
	}
}
