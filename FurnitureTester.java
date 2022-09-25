class FurnitureTester{
	public static void main(String args[]){
		Furniture.setFurnitureName("Sofa");
		Furniture.setPrice(20000);
		Furniture.setFurnitureColor("Red");
		System.out.println("Furniture name is:" +Furniture.getFurnitureName());
		System.out.println("Furniture price is:" +Furniture.getPrice());
		System.out.println("Furniture color is :" +Furniture.getFurnitureColor());
	
	}
}