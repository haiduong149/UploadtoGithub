package Package1;
import java.util.Random;
import java.util.Scanner;
public class TroChoiXucXac {
	private int GiaTri1, GiaTri2;				
	private Boolean Thang = false, Thua = false, Hoa = false;  // phai co gia tri ban dau, neu kh se bao loi bi null				
	public int getGiaTri1() {				
		return GiaTri1;			
	}				
	public void setGiaTri1(int giaTri1) {				
		GiaTri1 = giaTri1;			
	}				
	public int getGiaTri2() {				
		return GiaTri2;			
	}				
	public void setGiaTri2(int giaTri2) {				
		GiaTri2 = giaTri2;			
		if (GiaTri2 > GiaTri1) Thua= true;			
		else if (GiaTri2 < GiaTri1) Thang = true;			
		else  Hoa = true;			
	}				
	public Boolean getThang() {				
		setGiaTri2(GiaTri2);			
		return Thang;			
	}				
	public Boolean getThua() {				
		setGiaTri2(GiaTri2);			
		return Thua;			
	}				
	public Boolean getHoa() {				
		setGiaTri2(GiaTri2);			
		return Hoa;			
	}				
	private Scanner sc = new Scanner (System.in);				
	private  int NhapGiaTri () 				
	{				
		boolean kiemtra = false;			
		int so=0;			
		while (kiemtra == false)			
		{			
				try 	
				{	
					System.out.println("Nhap gia tri muon cuoc");
					so= sc.nextInt();
					kiemtra= true;
				}	
				catch (Exception a)   	
				{	
					System.out.println("Sai quy cach nhap lieu");
					sc.nextLine();
					kiemtra = false;
				}	
		}			
		return so;			
	}				
	public void InThongTin()				
	{				
		  if (Thang== true) System.out.println("Nguoi choi thang");			
		  else if (Hoa == true) System.out.println("Nguoi choi hoa");			
		  else  System.out.println("Nguoi choi thua");			
	}				
	public void BatDau () {				
		do {			
		setGiaTri1 (NhapGiaTri());			
		if (GiaTri1<3 || GiaTri1>18)			
		{			
			System.out.println("Ket Thuc");		
			return;		
// Neu khong co return o day thi chuong trinh se kg dung ma chay tiep phan ben duoi					
		}			
		Random rd= new Random (); 			
		//Java.util.Random cung cap phuong thuc nextInt() voi tham so truyen vao la mot so nguyen khong am dung de sinh so ngau nhien			
		//trong pham vi tu 0 den gia tri cho truoc			
		// Gia tri cua so ngau nhien >=0 va nho hon tham so truyen vao			
		// De co duoc pham vi [1,6] thi tham so truyen vao la 6 va gia tri tra ve cua phuong thuc cong them1			
		int l1 = rd.nextInt(6) + 1;			
		int l2 = rd.nextInt(6) + 1;			
		int l3 = rd.nextInt(6) + 1;			
		System.out.println("Ket qua xuc xac : " + l1 + ","+ l2 + "," + l3 + "\nTong:" + (l1+l2+l3));			
		setGiaTri2(l1+l2+l3);			
		InThongTin();			
		Thang = Thua = Hoa= false; // Sau 1 lan choi, tra ve gia tri nhu ban dau la false de tiep tuc			
		}			
		while (GiaTri2 >=3 && GiaTri2 <=18); // chi ket thuc khi ma nguoi choi nhap giatri1 <3 hoac giatri1 , con gia tri 2 o day se luon thoa dieu kien			
}					

}
