class Forest{
	public static void main(String args[]){
		String animalName1 = "Chita";
		String animalName2 = "Tiger";
		String animalName3 = "Elephant";
		String animalName4 = "Fox";
		
		String animalName[] = {animalName1, animalName2, animalName3,animalName4};
		String ref0 = animalName[0];
		String ref1 = animalName[1];
		
		System.out.println("Forset animals are" + ref0);
		System.out.println("Forset animals are" + ref1);
		
		System.out.println("-----------------");
		for(int i = 0; i < animalName.length; i++)
		{
		System.out.println( animalName[0]  + " " + animalName[2] + " " + animalName[3]);
		
		}
	}

}