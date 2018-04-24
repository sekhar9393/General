package learningjava;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class NumberDigitsAsc {
public static void main(String[] args) {
	Integer n = 19673;
	String input = n.toString();
	System.out.println("Input - "+input);
	char[] nums = input.toCharArray();
	Arrays.sort(nums);
	Set<Character> list=new HashSet<>();
	for(char i:nums)
	{
		list.add(i);
	}
	System.out.print("Output - ");
	for(Character index:list)
	{
		System.out.print(index);
	}

		}
}
	

