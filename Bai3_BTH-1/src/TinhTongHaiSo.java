/**
 * 
 */

/**
 * 
 */
import java.util.Scanner;
public class TinhTongHaiSo {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhập số thứ nhất: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Nhập số thứ hai: ");
        double num2 = scanner.nextDouble();
        
        double sum = num1 + num2;
        System.out.printf("Tổng của PT.2f và PT.2f là: PT.2f");
        
        scanner.close();
	}

}
