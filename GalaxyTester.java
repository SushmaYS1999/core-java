class GalaxyTester{
	public static void main(String args[]){
		Galaxy.setGalaxyName("Spiral Galaxy");
		Galaxy.setGalaxyType("Milky Way");
		Galaxy.setNumberOfStars("200 Billion stars");
		System.out.println("Galaxy name is  :" +Galaxy.getGalaxyName());
		System.out.println("Galaxy type is :" +Galaxy.getGalaxyType());
		System.out.println("Number Of Stars in Galaxy is  :" +Galaxy.getNumberOfStars());
	
	}
}