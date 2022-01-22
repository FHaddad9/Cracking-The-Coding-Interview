package ArraysStrings;

import java.util.Arrays;

public class Part1 {
	public static void main(String[] args) {
		String p1 = "abccba";
		String p2 = "cbaabc";
		
		System.out.println(checkPermutation(p1, p2));
		
		String url = "Mr John Smith   ";
		
		System.out.println(urlify(url, url.length()));
	}
	
	public static void isUnique() {
		
	}
	
	public static boolean checkPermutation(String perm1, String perm2) {
		
		if(perm1.length() != perm2.length()) {
			return false;
		}
		
		char[] p1 = perm1.toCharArray();
		char[] p2 = perm2.toCharArray();

		System.out.println(p1);
		System.out.println(p2);
		
		Arrays.sort(p1);
		Arrays.sort(p2);
		
		System.out.println(p1);
		System.out.println(p2);
		
		if(p1 == p2) {
			return true;
		}
		
		return false;
	}
		
	public static String urlify(String url, int len) {
		url.trim();
		char[] ch = url.toCharArray();
		int space = 0;
		
		for(int i = 0; i < len; i++) {
			//ch[i]
		}
		
		return url;
	}
	
	public static void palindromePermutation() {
		
	}
	
	public static void oneAway() {
		
	}
	
	public static void stringCompression() {
		
	}
	
	public static void rotateMatrix() {
		
	}
	
	public static void zeroMatrix() {
		
	}
	
	public static void stringRotation() {
		
	}
	
}


