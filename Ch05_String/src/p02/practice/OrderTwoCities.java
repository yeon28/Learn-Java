package p02.practice;

import java.util.Scanner;

public class OrderTwoCities {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.println("첫번째 도시를 입력하세요");
		String city1 = in.nextLine();
		System.out.println("두번째 도시를 입력하세요");
		String city2 = in.nextLine();

		if (city1.compareTo(city2) < 0) {
			System.out.println("2개 도시의 오름차순 " + city1 + "," + city2);
		} else {
			System.out.println("2개 도시의 오름차순 " + city2 + "," + city1);
		}
	}

}
