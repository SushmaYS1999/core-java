class AshokaHotel{
	public static void main(String args[]){
	String type = "2 Star hotel";
	String address = "M G Road";
	String[] manager = {"shyla","Sudhakar","Bharath","Nandini"};
	int NoOfManagers = 4;
	String[] food = {"kichadi","Egg kurma","Buttor roti","egg Chilli","Chiken keema","paneer rost","Andra Meals","Mutton chops","Mushroom fry","Potato fry","French fries","Chiken Balls","paneer buttor masala","Egg Sandwitch","Chiken soup","Mutton Dum Biriyani"};
	System.out.println("Welcome to our Hotel sir");
	System.out.println("AshokaHotel is a " + type);
	System.out.println("AshokaHotel is there near " + address);
	System.out.println("in AshokaHotel number of managers is " + NoOfManagers);
	System.out.println("-------------------------");
	System.out.println("AshokaHotel Managers are");
	System.out.println("-------------------------");
	for(int a = 0 ; a < manager.length ; a++)
	{
		System.out.println(manager[a]);
	}
	System.out.println("-------------------------");
	System.out.println("List of food items in out hotel is");
	System.out.println("-------------------------");
	for(int b = 0 ; b < food.length ; b++)
	{
		System.out.println(food[b]);
	}
	System.out.println("-----------Thank You--------------");
	}

}