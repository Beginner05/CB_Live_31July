package Le15;

public class StringBuilderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
StringBuilder sb=new StringBuilder("abc");
sb.append("def");
System.out.println(sb);

String str=new String(sb);
System.out.println(str);
	}

}
