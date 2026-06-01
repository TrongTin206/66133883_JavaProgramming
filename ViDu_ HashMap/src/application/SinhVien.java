package application;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class SinhVien {
	private String maSV;
    private String hoTen;
    
    public SinhVien(String maSV, String hoTen) {
        this.maSV = maSV;
        this.hoTen = hoTen;
    }
    
    // Getter
    public String getMaSV() { return maSV; }
    public String getHoTen() { return hoTen; }
    
    // QUAN TRỌNG: Override equals() và hashCode() khi dùng làm key trong HashMap
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SinhVien sinhVien = (SinhVien) o;
        return Objects.equals(maSV, sinhVien.maSV);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(maSV);
    }
    
    @Override
    public String toString() {
        return maSV + " - " + hoTen;
    }
}

