package p01.basic2;

public class Point {

	int x, y;

	public void set(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void showPoint() {	// 점 좌표 출력
		System.out.println("(" + x + "," + y + ")");
	}

}
