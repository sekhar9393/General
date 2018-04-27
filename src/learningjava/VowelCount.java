package learningjava;



import java.util.*;

class Vowels {
	String s;   
	Set<String> set = new HashSet<String>();
	Vowels(String s, LinkedHashSet<String> set) {
		this.s = s;
		this.set = set;
	}
	public void evaluator() {  
		Collections.addAll(set, s.split(""));
		int vn = 0;
		String vowel = "";
		List<String> vowels = new ArrayList<String>();
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			switch(it.next()) {
			case "a":
			case "e":
			case "i":
			case "o":
			case "u":
			
				vn++;       
				vowel = it.next();
				vowels.add(vowel);  
			}
		}
		System.out.println("Number of vowels is " + vn);	}
}

public class VowelCount {
	public static void main(String[] args) {
		LinkedHashSet<String> set1 = new LinkedHashSet<String>();
		Vowels q = new Vowels("TestLeaf", set1);
		q.evaluator();
	}
} 