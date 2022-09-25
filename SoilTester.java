class SoilTester{
	public static void main(String args[]){
		Soil.setSoilName("sand");
		Soil.setSoilColor("orange");
		Soil.setSoilType("riverSand");
		System.out.println("Soil name is  :" +Soil.getSoilName());
		System.out.println("Soil Color is  :" +Soil.getSoilColor());
		System.out.println("Soil type is  :" +Soil.getSoilType());
	
	}
}