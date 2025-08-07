package Package1;

public class Binhlinh {
	protected String  Ten;  
	protected double SucManh =50;  
	protected Boolean TrangBi;
	public String getTen() {
		return Ten;
	}
	public void setTen(String ten) {
		Ten = ten;
	}
	public double getSucManh() {
		return SucManh;
	}	
	public Boolean getTrangBi() {
		return TrangBi;
	}
	public void setTrangBi(Boolean trangBi) {
		TrangBi = trangBi;
		SucManh = TinhSucManh();
	}
	protected double TinhSucManh ()
	{
		return TrangBi ? SucManh *= 1.1 : SucManh;  
	}
	public void InThongTin ()
	{
		System.out.println(Ten + " co chi so suc manh " + SucManh);
	}
	public int ChienDau(Binhlinh LINH)
	{
		return SucManh < LINH.SucManh ? -1 : SucManh == LINH.SucManh ? 0 : 1;
	}	

}
