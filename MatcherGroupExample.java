import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class MatcherGroupExample {
	
	 public static void main(String[] args) {

	        String text    =
	                  "John writes about this, and John Doe writes about that," +
	                          " and John Wayne writes about everything."
	                ;

	        String patternString1 = "(John) (.+?) ";

	        Pattern pattern = Pattern.compile(patternString1);
	        Matcher matcher = pattern.matcher(text);

	        while(matcher.find()) {
	        	 System.out.println("Printing this line");
	            System.out.println("found: " + matcher.group(0) + "found " + matcher.group(1) +
	                               " "       + " found " + matcher.group(2));
	        }
	    }
}
