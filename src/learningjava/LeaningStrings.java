/**
 * 
 */
package learningjava;

/**
 * @author sekhar9393
 *
 */
public class LeaningStrings {
public static void main(String[] args) {
	
	String str="AB12C";
	String strIncremented=new String();
	for(int i=0;i<str.length();i++){
		strIncremented+=(char)(str.charAt(i)+1);
	}
	System.out.println(strIncremented);
/*for(int i=0;i<str1.length()-1;i++) {
	out = (String)(str1.charAt(i)+1);
}*/

	/*char[] ch = str1.toCharArray();
	for (char c : ch) {
		System.out.println(c);
	}*/
}

}
