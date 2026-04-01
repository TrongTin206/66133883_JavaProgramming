package QuanLySanPham;
import java.util.ArrayList;
import java.util.List;
public class QuanLySanPham {
	private List<SanPham> danhSach = new ArrayList<>();
	    public void them(SanPham sp) {danhSach.add(sp);
	}
	public void xoaTheoMa(String ma) {
	   for (int i = 0; i < danhSach.size(); i++) {
	       if (danhSach.get(i).getMaSP().equals(ma)) {danhSach.remove(i);
	          System.out.println("Đã xóa sản phẩm " + ma);
	                return;
	    }
	}
	   System.out.println("Không tìm thấy");
	}
	public void timTheoTen(String ten) {
	   for (SanPham sp : danhSach) {
	      if (sp.getTenSP().toLowerCase().contains(ten.toLowerCase())) {sp.hienThi();
	            }
	        }
	    }
	public void sapXepTang() {
	    for (int i = 0; i < danhSach.size() - 1; i++) {
	       for (int j = i + 1; j < danhSach.size(); j++) {
	          if (danhSach.get(i).getGia() > danhSach.get(j).getGia()) {SanPham temp = danhSach.get(i);
	             danhSach.set(i, danhSach.get(j));
	             danhSach.set(j, temp);
	          }
	       }
	    }
	 }
	 public void sapXepGiam() {
	    for (int i = 0; i < danhSach.size() - 1; i++) {
	       for (int j = i + 1; j < danhSach.size(); j++) {
	          if (danhSach.get(i).getGia() < danhSach.get(j).getGia()) { SanPham temp = danhSach.get(i);
	             danhSach.set(i, danhSach.get(j));
	             danhSach.set(j, temp);
	             }
	          }
	      }
	 }
	 public double tongGiaTri() {
	   double tong = 0;
	   for (SanPham sp : danhSach) {tong += sp.getGia() * sp.getSoLuong();}
	   return tong;
	 }
	 public void sapHetHang() {
	    for (SanPham sp : danhSach) {
	       if (sp.getSoLuong() < 10) {sp.hienThi();}
	     }
	  }
	    public void hienThi() {
	        for (SanPham sp : danhSach) {
	            sp.hienThi();
	        }
	    }
	}

