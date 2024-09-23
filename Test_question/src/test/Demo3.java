package test;
// write java program to print fibonacci series of given number.

public class Demo3 {
	public static void main(String[] args) {

		int firstnum = 0;
		int secondnum = 1;
		int nextnum = 0;

		for (int i = 1; i <= 10; i++) {
			System.out.println(firstnum);

			nextnum = firstnum + secondnum;

			firstnum = secondnum; 
			secondnum = nextnum;

		}
	}

}
