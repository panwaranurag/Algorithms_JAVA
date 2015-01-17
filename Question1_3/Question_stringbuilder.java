/**
 * 
 */
package Question1_3;

/**
 * @author ap337
 *
 */
public class Question_stringbuilder {
	static String removeDuplicates(String s) {
	    StringBuilder noDupes = new StringBuilder();
	    for (int i = 0; i < s.length(); i++) {
	        String si = s.substring(i, i + 1);
	        if (noDupes.indexOf(si) == -1) {
	            noDupes.append(si);
	        }
	    }
	    return noDupes.toString();
	}
	
	public static void main(String[] args){
		String test = "anurag";
		removeDuplicates(test);
		System.out.println(test);
	}
	
}
