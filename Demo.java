package nice;
   class Math
   {
	    static String collageName="SMBST clg";
	   int stdrollnum=35;
	   String StudentName="diksha";
	   
     
   
     void collageName()
     {
    	 System.out.println("collage name is:"+collageName);
    	 System.out.println("stdrollnum:"+stdrollnum);
    	 System.out.println("StudentName:"+StudentName);
     }
   
   }
public class Demo {
	public static void main(String[] agrs)
	{
		Math m1=new Math();
		m1.collageName();
		
	}

}
