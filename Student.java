package diksha;

class FYBSC{
	String StudName="Diksha";
	float StudPer=80.6f;
	int StudRollno=12;
	long StudMobileNum=8799851799L;
	short Studage=19;
	char StudDiv='A';
	boolean StudProgress=true;
		void StudInfo()
		{
		System.out.println("Student Name is :"+(StudName));
		System.out.println("Student Roll no is:="+(StudPer) );
		System.out.println("Student Mobaile num is:"+(StudRollno));
		System.out.println("Student age is=:"+(Studage));
		System.out.println("Student Div is=:"+(StudDiv));
		System.out.println("Student Progress is:"+(StudProgress));
		
		}
			
}		

class SYBSC{
	String StudName="Sanika";
	float StudPer=90.6f;
	int StudRollno=10;
	long StudMobileNum=8253851799L;
	short Studage=20;
	char StudDiv='A';
	boolean StudProgress=true;	
	void StudInfo()
	{
		System.out.println("Student Name is :"+(StudName));
		System.out.println("Student Roll no is:="+(StudPer) );
		System.out.println("Student Mobaile num is:"+(StudRollno));
		System.out.println("Student age is=:"+(Studage));
		System.out.println("Student Div is=:"+(StudDiv));
		System.out.println("Student Progress is:"+(StudProgress));
	}
	}
class TYBSC{
	String StudName="Kajal";
	float StudPer=70.6f;
	int StudRollno=23;
	long StudMobileNum=9563789245L;
	short Studage=21;
	char StudDiv='b';
	boolean StudProgress=true;	
	void StudInfo()
	{
		System.out.println("Student Name is :"+(StudName));
		System.out.println("Student Roll no is:="+(StudPer) );
		System.out.println("Student Mobaile num is:"+(StudRollno));
		System.out.println("Student age is=:"+(Studage));
		System.out.println("Student Div is=:"+(StudDiv));
		System.out.println("Student Progress is:"+(StudProgress));
	}
	}
public class Student {
 
	public static void main(String[] args) {
		
	
	FYBSC f1 = new FYBSC();
	SYBSC s1 = new SYBSC();
	TYBSC t1 = new TYBSC();
	f1.StudInfo();
	s1.StudInfo();
	t1.StudInfo();
	}
}
