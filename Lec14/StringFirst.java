package Lec14;

public class StringFirst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abc";

		System.out.println(str);
		str.concat("def");
		System.out.println(str);
		String str2 = str + str + "def";
		System.out.println(str2);
		str2 = "def";
		str2 = str2 + "Hello";
		System.out.println(str2);
		str2.concat("bye");
		String str3 = str + "s2" + str2 + "s3";
		System.out.println(str3);
	}

}
