package Demo;
class Bankinfo
{
	private String Bankholder_name;
	private int bankAcc_No;
	private int bank_IFCcode;
	private int bank_pinno;
	
	public String getBankholder_name() {
		return Bankholder_name;
	}
	public void setBankholder_name(String bankholder_name) {
		Bankholder_name = bankholder_name;
	}
	public int getBankAcc_No() {
		return bankAcc_No;
	}
	public void setBankAcc_No(int bankAcc_No) {
		this.bankAcc_No = bankAcc_No;
	}
	public int getBank_IFCcode() {
		return bank_IFCcode;
	}
	public void setBank_IFCcode(int bank_IFCcode) {
		this.bank_IFCcode = bank_IFCcode;
	}
	public int getBank_pinno() {
		return bank_pinno;
	}
	public void setBank_pinno(int bank_pinno) {
		this.bank_pinno = bank_pinno;
	}
	
}
public class Encapsulation2 {
	public static void main(String[] args)
	{
		Bankinfo b1=new Bankinfo();
		b1.setBankholder_name("Diksha");
		b1.setBankAcc_No(45657786);
		b1.setBank_IFCcode(546);
		b1.setBank_pinno(3456);
		System.out.println(b1.getBankholder_name()+"\n"+b1.getBankAcc_No()+"\n"+b1.getBank_IFCcode()+"\n"+b1.getBank_pinno());
	}
}
