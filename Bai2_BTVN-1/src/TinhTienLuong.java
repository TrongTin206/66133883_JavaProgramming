/**
 * 
 */

/**
 * 
 */
public class TinhTienLuong {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double Giolam = 42;        
        double luongtheogio = 25000; 
        double TongLuong;

        if (Giolam > 40) {
            TongLuong = 40 * luongtheogio 
                      + (Giolam - 40) * luongtheogio * 1.5;
        } else {
            TongLuong = Giolam * luongtheogio;
        }

        System.out.println("Tong luong la: " + TongLuong);
	}

}
