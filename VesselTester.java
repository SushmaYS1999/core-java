class VesselTester{
	public static void main(String args[]){
		Vessel.setVesselName("Preasure Cooker");
		Vessel.setVesselType("Hawkins  stainless steel");
		Vessel.setVesselPrice(5000);
		System.out.println("Vessel name is  :" +Vessel.getVesselName());
		System.out.println("Vessel type is :" +Vessel.getVesselType());
		System.out.println("Vessel Price is  :" +Vessel.getVesselPrice());
	
	}
}