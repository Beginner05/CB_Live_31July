package Lec2;

public class Helloworld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=1;
int c=2;
int d=4;

int res=a++ + d + c++ +a + d++ + d++ + c++;

int ans= --a + --c + res++ - --d - --c + ++a;

System.out.println(ans);
System.out.println(res);
int fres=--res *--ans;
System.out.println(fres);

	}

}
