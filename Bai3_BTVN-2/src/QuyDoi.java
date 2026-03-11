/**
 * 
 */

/**
 * 
 */
import java.util.Scanner;
public class QuyDoi {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập số tiền USD: ");
		double USD = scanner.nextDouble();

		double tyGia = 26245;
		double VND = USD * tyGia;

		System.out.printf("Số tiền USD: %.2f\n", USD);
		System.out.printf("Quy đổi ra VND: %.2f", VND);

		scanner.close();
	}

}
