/**
 * 
 */

/**
 * 
 */
public class PhuongTrinhBacMot {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 3;
		int b = 6;
		if (a == 0) {
            if (b == 0) {
                System.out.println("Phuong trinh vo so nghiem");
            } else {
                System.out.println("Phuong trinh vo nghiem");
            }
        } else {
            double x = (double) -b / a;
            System.out.println("Nghiem x = " + x);
		 }
	}
}
