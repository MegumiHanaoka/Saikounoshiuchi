import java.util.Random;

public class Randam {

	public static void main(String[] args) {
		Random random = new Random();
		int randomValue = random.nextInt(16);
		
		String[] hands = { "赤池", "赤石", "巌", "大川", "蔵原", "小林", "鈴木", "但馬", "辻山", "戸川", "常世田", "錦", "西牧", "吉崎", "原田", "澤田"  };
	    Random r = new Random();
	    for(int i=0 ; i<6 ; i++) {
	      String hand = hands[r.nextInt(16)];
	      System.out.println(hand + "さん");
	    }
	}

}
