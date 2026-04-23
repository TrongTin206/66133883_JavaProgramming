package thigk2.VoTrongTin;
import java.util.Scanner;
/* 
 * Nhap toa do 2 diem cua hinh chu nhat
 * Tinh chu vi và dien tich 
 * Chieu dai =| x2-x1|
 * Chieu rong =|y2-y1|
 */
public class Câu_1 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Nhap x1: ");
        int x1=sc.nextInt();
        System.out.print("Nhap y1: ");
        int y1=sc.nextInt();
        
        System.out.print("Nhap x2: ");
        int x2=sc.nextInt();
        System.out.printf("Nhap y2: ");
        int y2=sc.nextInt();
        
        int dai=Math.abs(x2 - x1);
        int rong=Math.abs(y2 - y1);
        
        int Chuvi= 2*(dai + rong);
        int Dientich= dai * rong;
        
        System.out.println("Chu vi: "+ Chuvi);
        System.out.print("Dien tich: "+ Dientich);   
	}
}
