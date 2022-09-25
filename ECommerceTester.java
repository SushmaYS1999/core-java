class ECommerceTester{
	public static void main(String args[]){
		ECommerce.setBrandId(65872);
		ECommerce.setBrandName("Trendz");
		ECommerce.setDressType("kurtha");
		ECommerce.setDressColor("Purpal");
		System.out.println("Brand is:" +ECommerce.getBrandName());
		System.out.println("Dress type is:" +ECommerce.getDressType());
		System.out.println("Dress color is:" +ECommerce.getDressColor());
	
	}
}