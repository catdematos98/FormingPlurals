import java.util.Scanner;

public class FormingPlurals extends LanguageUtils {

	static final Scanner IN = new Scanner(System.in);
	static String noun;
	
	public static void main(String[] args) {
		//read
		while(true){
			//read
			System.out.printf("Give me a noun to pluralize:");
			noun = IN.nextLine();
			
			//eval && print
			System.out.println(LanguageUtils.pluralizeNoun(noun));
		}
		
	}

}
