
public class 나무Test {

	public static void main(String[] args) {
		
		나무 대나무 = new 대나무();
		
		나무 사과나무 = new 소나무();
		
		나무[] 긴나무 = new 나무[2];
		
		int[] a = new int[10];
		
		a[0] = 10;
		
		긴나무[0] = 대나무;
		긴나무[1] = 사과나무;
		
		사과나무.유용하다();
		
		소나무 so; // 소나무의 임의의 이름을 'so'라 지정
		나무 tr; // 나무의 임의의 이름을 'tr'라 지정
		tr = new 나무(); // tr에 나무()
		
		so = (소나무)tr; // so는 소나무타입인 tr 값을 받는다.
		
		
		//다형성
		
		
		
		
	}

}
