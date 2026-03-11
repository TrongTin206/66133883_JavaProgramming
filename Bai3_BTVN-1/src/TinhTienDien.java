/**
 * 
 */

/**
 * 
 */
import java.util.Scanner;
public class TinhTienDien {
/**
* @param args
*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.print("Nhập số kWh điện đã sử dụng: ");
		double kwh = scanner.nextDouble();
		double gia1 = 3000;
		double gia2 = 4000;
		double gia3 = 5000;
		double gia4 = 6000;
		double gia5 = 7000;

		double tien = 0;

		if (kwh <= 50) {
			tien = kwh * gia1;
		} 
		else if (kwh <= 100) {
		    tien = 50 * gia1 + (kwh - 50) * gia2;
		} 
		else if (kwh <= 200) {
		    tien = 50 * gia1 + 50 * gia2 + (kwh - 100) * gia3;
		} 
		else if (kwh <= 300) {
		    tien = 50 * gia1 + 50 * gia2 + 100 * gia3 + (kwh - 200) * gia4;
		} 
		else {
		    tien = 50 * gia1 + 50 * gia2 + 100 * gia3 + 100 * gia4 + (kwh - 300) * gia5;
		}

		System.out.printf("Số điện đã dùng: %.2f kWh\n", kwh);
		System.out.printf("Tiền điện phải trả: %.2f", tien);

		scanner.close();
	}
}
