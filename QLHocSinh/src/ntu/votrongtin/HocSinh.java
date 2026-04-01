package ntu.votrongtin;

public class HocSinh {
	private String tenHS, lopHS;
	private short tuoiHS;
	public HocSinh() 
	{
		
	}
	public HocSinh(String tenHS, String lopHS, short tuoiHS)
	{
		super();
		this.tenHS = tenHS;
		this.lopHS = lopHS;
		this.tuoiHS = tuoiHS;
	}
	public String getTenHS() 
	{
		return this.tenHS;
	}
	public String getLopHS()
	{
		return this.lopHS;
	}
	public short getTuoiHS() 
	{
		return this.tuoiHS;
	}
	public void setTenHS(String tenHS)
	{
		this.tenHS = tenHS;
	}
	public void setTuoiHS(short tuoiHS)
	{
		this.tuoiHS = tuoiHS;
	}
	public void setLopHS(String lopHS)
	{
		this.lopHS = lopHS;
	}
	@Override
	public String toString()
	{
		return ("HS " + tenHS + " " + tuoiHS + " tuoi" + " dang hoc lop " + lopHS);
		
	} 
}
