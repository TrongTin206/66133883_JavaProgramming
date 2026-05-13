package thigk2.VoTrongTin;
import java.io.*;
import java.util.*;

public class Câu_3 {
	 public static void main(String[] args) throws FileNotFoundException{
		        ArrayList<Double> ds = new ArrayList<>();

		        Scanner file = new Scanner(new File("BaiThi"));
		        while (file.hasNext()) {
		            ds.add(file.nextDouble());
		        }

		        System.out.println("Danh sach:");
		        for (double x : ds) {
		            System.out.print(x + " ");
		        }

		        Scanner sc = new Scanner(System.in);
		        System.out.print("\nNhap X: ");
		        double X = sc.nextDouble();

		        boolean timThay = false;
		        for (double x : ds) {
		            if (x == X) {
		                timThay = true;
		                break;
		            }
		        }

		        if (timThay)
		            System.out.println("Co X");
		        else
		            System.out.println("Khong co X");
		    }
		}
