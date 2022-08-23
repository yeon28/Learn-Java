package p03.object_class_method_practice;

/*
 * Object 클래스의 equal , toString 메소드 모두 override
 */
public class Point {

	private int x;
	private int y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;

	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Point) {
			Point p = (Point) obj;
			if ((this.x == p.x) && (this.y == p.y)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public String toString() {
		return ("Point x = " + x + ", y = " + y);
	}
}
