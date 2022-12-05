package com;
class StringCountWithoutLength{
	public static void main(String[] args)
	{
		String str = "sampleString";
      int i = 0;
      for(char c: str.toCharArray()) {
         i++;
      }
      System.out.println("Length of the given string ::"+i);
      
      System.out.println("==========");
      
      String str1 = "sampleString";
      int j = 0;
      String nstr="";
      for(char b: str1.toCharArray()) {
    	  char c=str1.charAt(j);
         j++;
         nstr=c+nstr;
      }
      System.out.println(nstr);
   }
}
		//String str="Xworkz";
		//int count=0;
		//for(int i=0;i<str.();i++)
		//{
			//if(str.charAt(i) != ' ')    
              //  count++;  
		//}
		//System.out.println(count);
	//}
//}