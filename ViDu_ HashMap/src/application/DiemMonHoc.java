package application;

//Lớp DiemMonHoc
class DiemMonHoc {
 private String tenMonHoc;
 private double diem;
 
 public DiemMonHoc(String tenMonHoc, double diem) {
     this.tenMonHoc = tenMonHoc;
     this.diem = diem;
 }
 
 public String getTenMonHoc() { return tenMonHoc; }
 public double getDiem() { return diem; }
 
 @Override
 public String toString() {
     return tenMonHoc + ": " + diem;
 }
}