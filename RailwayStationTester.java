class RailwayStationTester{
	public static void main(String args[]){
		RailwayStation.setStationName("Shimoga Town");
		RailwayStation.setDirection("Shimoga -> Banglore");
		RailwayStation.setTrainName("JanShatabdhi");
		System.out.println("RailwayStation name is  :" +RailwayStation.getStationName());
		System.out.println("Train from  :" +RailwayStation.getDirection());
		System.out.println("Train name is  :" +RailwayStation.getTrainName());
	
	}
}