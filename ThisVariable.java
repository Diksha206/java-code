package com.inheritance;

class Medicine
{
	String Medicinename;
	int MedicineMFG;
	int MedicineEXP;
	Medicine(String Medicinename,int MedicineMFG,int MedicineEXP)
	{
		this.Medicinename=Medicinename;
		this.MedicineMFG=MedicineMFG;
		this.MedicineEXP=MedicineEXP;
		System.out.println(Medicinename);
		System.out.println(MedicineMFG);
		System.out.println(MedicineEXP);
	}
	
}
public class ThisVariable {
	public static void main(String[] avg)
	{
		Medicine c1= new Medicine("Aspirin",2021,2025);

	}

}
