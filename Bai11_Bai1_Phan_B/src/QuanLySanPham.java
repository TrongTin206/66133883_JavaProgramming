import java.util.*;
public class QuanLySanPham {
	 private ArrayList<SanPham> list = new ArrayList<>();

	    public void themSP(SanPham sp) {
	        list.add(sp);
	    }

	    public void xoaTheoMa(String ma) {
	        list.removeIf(sp -> sp.getMaSP().equalsIgnoreCase(ma));
	    }

	    public void timTheoTen(String ten) {
	        for (SanPham sp : list) {
	            if (sp.getTenSP().toLowerCase().contains(ten.toLowerCase())) {
	                System.out.println(sp);
	            }
	        }
	    }

	    public void sapXepTang() {
	        Collections.sort(list, Comparator.comparingDouble(SanPham::getGia));
	    }

	    public void sapXepGiam() {
	        Collections.sort(list, (a, b) -> Double.compare(b.getGia(), a.getGia()));
	    }

	    public double tongGiaTri() {
	        double tong = 0;
	        for (SanPham sp : list) {
	            tong += sp.getGia() * sp.getSoLuong();
	        }
	        return tong;
	    }

	    public void sapHetHang() {
	        for (SanPham sp : list) {
	            if (sp.getSoLuong() < 10) {
	                System.out.println(sp);
	            }
	        }
	    }

	    public void hienThi() {
	        for (SanPham sp : list) {
	            System.out.println(sp);
	     }
	}
}

