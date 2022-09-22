class Theatre{

	static int priceOfKannadaMovies[] = {1000,200,300,500};
	static String kannadaNames[] = {"Robbert","Mejestic","Sarathi","Brundavana"};
	static String hindiNames[] = {"idiot","dabang3","padmavath","Bhool bhooleya "};
	
	
	public static void main(String a[]){
	
	
	System.out.println("Price of kannada movies");
	System.out.print(priceOfKannadaMovies[0] +"  "+ 
	priceOfKannadaMovies[1] +"  "+ 
	priceOfKannadaMovies[2] +"  "+ 
	priceOfKannadaMovies[3]);
	System.out.println("---------------");
	
	System.out.println("List of kannada movies");
	System.out.print(kannadaNames[0] +"  "+ 
	kannadaNames[1] +"  "+ 
	kannadaNames[2] +"  "+ 
	kannadaNames[3] +" ");
	
	System.out.println("---------------");
	System.out.println("List of hindi  movies");
	System.out.print(hindiNames[0] +"  "+ 
	hindiNames[1] +"  "+ 
	hindiNames[2] +"  "+ 
	hindiNames[3]);
	
	
	
	
	}
}