package Package1;
import java.util.*;
public class JA1_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
		 int a, b;
		 System.out.print("Nhap a: "); //print thay vi println, no se in ra, nhung khong xuong dong
		    a = sc.nextInt(); // sc.nextInt() la cach de lay gia tri tu ban phim, no se cho toi khi chung ta nhap mot so.
		    System.out.print("Nhap b: ");
		    b = sc.nextInt();
		String Tong =String.format("a+b= %d", (a+b));
		 System.out.println(Tong);
	}

}
