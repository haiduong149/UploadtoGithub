package Package1;

public class OOP_19_Binhlinh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Binhlinh linh1 = new Binhlinh();
		linh1.setTen("BinhNhat");
		linh1.setTrangBi(true);
		Binhlinh linh2 = new Binhlinh();
		linh2.setTen("BinhNhi");
		linh2.setTrangBi(false);
		
		CungThu CT = new CungThu();
		CT.setTen("Cung Thu");
		CT.setTrangBi(true);
		
		KiemSi KS = new KiemSi();
		KS.setTen("Kiem Si");
		KS.setTrangBi(true);
		
		DauSi DS = new DauSi();
		DS.setTen("Dau Si");
		DS.setTrangBi(true);
		
		linh1.InThongTin();
		linh2.InThongTin();
		CT.InThongTin();
		KS.InThongTin();
		DS.InThongTin();
		
		System.out.println(linh1.ChienDau(linh2));
		System.out.println(linh1.ChienDau(CT));
		System.out.println(KS.ChienDau(DS));

	}

}
