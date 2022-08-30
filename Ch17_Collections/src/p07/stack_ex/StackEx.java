package p07.stack_ex;

import java.util.Stack;

public class StackEx {

	public static void main(String[] args) {
		Stack<Coin> coinBox = new Stack<Coin>();

		coinBox.push(new Coin(100));
		coinBox.push(new Coin(50));
		coinBox.push(new Coin(500));
		coinBox.push(new Coin(10));

		while (!coinBox.isEmpty()) {
			Coin coin = coinBox.pop();	// 원소를 빼냄, coin에 원소는 없는 상태
			System.out.println("꺼내온 동전 : " + coin.getValue() + "원");
		}

		System.out.println();

		for (Coin coin : coinBox) {
			System.out.println("꺼내온 동전 : " + coin.getValue() + "원");
		}
	}
}
