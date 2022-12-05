1] what is platform independence?
	
	the program which is written once can be executed in other os platforms . no need to rewrite the program again in that platform.
	means the program which is written useing windows os that can be executed in the mac,linux,unix os.no need to rewrite the program.
	platform is nothing but the of processor which the program or proccess being excuted the program which is written once can be executed in the
	different proccessor called platform independence.we commenly called it as write once run anywhere.java is a platform independence language, beacuse compiled .Class file can be
	executed in the different platform no need to recompile the program.
	
2] what is the difference between primitive and non primitive data types?
	primitive  data types:
		*they are 8 primitive datatypes.
		*byte,short,int,long,float,double,char,boolean
		*
   non primitive data type:
		*they are n number of non primitive data type are there.
		*String,array,and class names.
	
3] explain class and its members with an example?
   *class:
			class is a blue print of an object.it is a design, it contain status and behaviour.status represents the variables,and behaviour represents the method.
   *variables:
			variable is a container it stores data and value.
							or
			variable is a register area it is allocated in a memory.
   *constructor:
			constructor is a special type of menthod as which the class and constructor name should be same. there is no return type.
   *members:
			where the members are declared a inside class outside menthod.
   *block:
			block is either static or non static. it contains  code snippet.
   *method:
			method is a block of code.it will be used for reusability purpose.
	
   *eg:class Hotel{
	 Hotel(){
				System.out.println("Taj Hotel is ");
			}
			String name;
			String brand;
			void tj(){
						System.out.println("Banni friends hotel ge hogona");
					}
	
				}
			public static void main(String[] args)
			{
				class HotelTester{
				public static void main(String[] args){

				Hotel i1 = new Hotel();
				i1.name = "Taj";
				i1.brand = "5star";
				System.out.println(i1.name +" " +i1.brand);
			}
			
4] write a program to accept two inputs and recived marks,calculate percentage and returns?
class Percentage{
	public static void main(String[] args)
	{
		int java=60;
		int web=80;
		int totalMarks=100;
		
		int total= java+web;
		float result=(total / 2);
		if(total%2==0)
		{
				System.out.println(result);
		}
		return;
	}
}

6] explain main method with the memory its executes in?
	public static void main(String[] a){

	}

	*public is the access specifier which the file can be accessed anywher in the system java compiler will load that file .

	*static is the non access modifier which will allocate the memory in the compilation time.

	*void is the return type which will not return any value to the user .

	*main is the methode name wher the execution will began jvm will search for the main methode for the execution purpose.

	*String is the non primitive datatype which will store the data which are passed in the command line in an String array.


	
7] program for reverse of a given number?
	import java.util.Scanner;
	class Reverse{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int reverse=0;
		System.out.println("enter a number");
		int n=sc.nextInt();
		while(n!=0)
		{
			int remainder = n % 10;
			reverse = reverse * 10 + remainder;
			n=n/10;	
		}
		System.out.println(reverse);
	  }
	}

8] program to find hours into seconds? 
class Hours{
	public static void main(String[] args)
	{
		int h=2;
		float sec=h*3600;
		System.out.println(sec);
	}
}

	
9] program to find Armstrong numbers?	
class Armstrong{
		public static void main(String[] args){
			int n=121,m,remainder,result=0;
			m=n;
			while(m!=0)
			{
				remainder=m %10;
				result+=Math.pow(remainder,3);
				m/=10;
			}
			if(result==n)
			{
				System.out.println(n +"is a Armstrong number");
			}
			else
			{
				System.out.println(n +"is not a Armstrong number");
			}
		}
}

	