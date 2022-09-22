class EmpireHotel{
	public static void main(String a[]){
	String type = "3 star hotel";
	String address = "Nagarabava";
	String[] manager = {"Sumanth","Sangeetha","Navya","Vaibhavai","Sushma"};
	int NoOfManager = 5;
	String[] food = {"*Rice bath","*Hydrabadi Biriyani","*Palak Pannir","*Butter-Non","*Chilli chiken","*Egg Biriyani","*Chilli Pannir","*Chiken Tandoori","*Egg Kurma","*Creamy Chiken","*Brakolies Killlet","*Egg Manchurian","*Chiken Lolipop","*Dal Kichadi","*Mutton Pepper rost"};
	System.out.println("Welcom to our Hotel sir");
	System.out.println("EmpireHotel is " + type);
	System.out.println("EmpireHotel is there in " + address);
	System.out.println("number of Managers in EmpireHotel is " + NoOfManager);
	System.out.println("-------------");
	System.out.println("Manager names is");
	System.out.println("--------------");
	for(int i = 0; i < manager.length; i++)
	{
		System.out.println(manager[i]);
	}
	System.out.println("---------------");
	System.out.println("List of items are");
	System.out.println("-------------");
	for(int j = 0; j < food.length; j++)
	{
		System.out.println(food[j]);
	}
	System.out.println("-----------Thank You--------------");
	}

}