class VivantaTajHotel{
	public static void main(String a[]){
	String type = "5 star Hotel";
	String address = "Goragunte Palya";
	String[] manager = {"Anu","Ankush","Preethi","Praveen","Bharath"};
	int noOfManagers = 5 ;
	String food[] = {"Birayani","Gobi","Eggrice","Soup","Kabab","Manchurian","Noodles","Mushroom masala","Non","Roti","Chapathi","Dosa","Poori","Puliyogre","Paneer masala"};
	System.out.println("Welcome to VivantaTajHotel ");
	System.out.println("VivantaTajHotel Hotel Type is " + type);
	System.out.println("VivantaTajHotel address is " + address);
	System.out.println("number of managers in VivantaTajHotel is " + noOfManagers);
	System.out.println("----------------");
	System.out.println("managers names are");
	System.out.println("-----------------");
	
	for(int i = 0; i < manager.length ; i++)
	{
		System.out.println(manager[i]);
	}
	
	System.out.println("----------------");
	System.out.println("List of foods");
	System.out.println("----------------");
	for(int b = 0 ; b < food.length ; b++)
	{
		System.out.println(food[b]);
	}
}
}