package codility;

public class frogJump {
	public int solution(int X, int Y, int D) {
	// write your code in Java SE 8
		return (Y-X)%D==0 ? (Y-X)/D : ((Y-X)/D+1);
	}
}
