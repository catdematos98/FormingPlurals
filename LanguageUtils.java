public class LanguageUtils {

	public static String pluralizeNoun (String noun) {
		//for single character inputs
		if(noun.length()==1){
			noun+="'s";
			return noun;
		} 
		
		//for word like "mother-in-law"
		CharSequence dashEnding = "";
		CharSequence dash = "-";
		if(noun.contains(dash)){
			dashEnding = noun.subSequence(noun.indexOf(dash.toString()), noun.length());
			noun = noun.substring(0, noun.indexOf(dash.toString()));
		}
		
		//for nouns that are already in plural form
		if (noun.equals("deer") ||noun.equals("disco")){
			System.out.println("here");
			return noun + dashEnding;
		}
		
		//special case
		if (noun.equals("man"))
			return noun = "men" +dashEnding; 
		else if (noun.equals("moose"))
			return noun;
		else if(noun.equals("goose"))
			return noun = "geese";

		
		char nounLastLetter = noun.charAt(noun.length()-1);  //last letter in the noun
		char nounSecondLastLetter = noun.charAt(noun.length()-2); //second to las letter in the noun

		//concatenates the two chars into string
		String nounEnding = new StringBuilder().append(nounSecondLastLetter).append(nounLastLetter).toString(); 

		
		if(nounEnding.equalsIgnoreCase("fe")){
			noun = noun.substring (0,(noun.length()-1));
			nounEnding = "ves";	
		}
		else if(nounLastLetter == 'f'){
			noun = noun.substring(0, noun.length()-1);
			nounEnding = "ves";	
		}
		else if (nounEnding.equalsIgnoreCase("sh") || nounEnding.equalsIgnoreCase("ch") || nounLastLetter == 'x'){
			nounEnding = "es";	
		}
		else if(nounLastLetter == 'z'){
			nounEnding = "zes";	
		}
		else if(nounLastLetter == 's'){
			nounEnding = "";	
		}
		else if (nounLastLetter == 'y' &&
				nounSecondLastLetter != 'a' && 
				nounSecondLastLetter != 'e' && 
				nounSecondLastLetter != 'i'&&
				nounSecondLastLetter != 'o' &&
				nounSecondLastLetter != 'u'){
				System.out.println(5);
				
				noun = noun.substring (0,(noun.length()-1));
				nounEnding = "ies"; 
		}
		else{
			nounEnding = "s";
		}
		
		noun = noun + nounEnding + dashEnding;
		return noun;
	}

}
