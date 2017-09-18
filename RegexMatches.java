import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class RegexMatches {
	
	   public static void main( String args[] ) {
		      // String to be scanned to find the pattern.
		      String line = "This order QT3001! OK was placed for QT3001! OK?";
		      String line_one = "<!--RAN_VNFM_ERATOMG-->";
		      String line_two = "<virtual-network-function-manager-name>RAN_VNFM_ERATOMG_SEC</virtual-network-function-manager-name>";
		      String VNFM_NAME_repalcement_pattern = "<!--%s-->";
		      String VNFM_NAME = "(^<!-- ([\\w,_]+) \\-\\->.*)";
		      //String pattern = "(\\d+)(.*)(\\D+)";

		      // Create a Pattern object
		      Pattern r = Pattern.compile(VNFM_NAME);
		      String theReplacement = String.format(VNFM_NAME_repalcement_pattern, "440");

		      // Now create matcher object.
		      Matcher m = r.matcher(line_one);
		      if (m.find( )) {
		    	 System.out.println("Found value: " + m.groupCount() );;
		         System.out.println("Found value: " + m.group(0) );
		         System.out.println("Found value: " + m.group(1) );
		         System.out.println("Found value: " + m.group(2) );
		         System.out.println("Found value: " + m.group(3) );
		      }else {
		         System.out.println("NO MATCH");
		         System.out.println(theReplacement);;
		      }
		   }
	}
