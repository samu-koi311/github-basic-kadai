package kadai_026;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter26 {
	
	String input = "";
	String ha = "";
	
	public String getMyChoice() {
		System.out.println("自分のじゃんけんの手を入力しましょう");
		System.out.println("グーはrockのrを入力しましょう");
		System.out.println("チョキはscissorsのsを入力しましょう");
		System.out.println("パーはpaperのpを入力しましょう");
		
		while(true) {
		Scanner hand = new Scanner(System.in);
		input = hand.next();
		System.out.println(input);
		
		switch(input) {
		case "r","s","p" -> { hand.close();
		                      return input;
		}
		
		}
			}
	}
			
	public String getRandom() {
		
		String[] handArray = {"r","s","p"};
		
		int i = (int)Math.floor(Math.random()*3);
		ha = handArray[i];
		return ha;
	}
		
	public void playGame() {
		getRandom();
		HashMap<String,String> play = new HashMap<String,String>();
		
		play.put("r","グー");
		play.put("s", "チョキ");
		play.put("p","パー");
		
		System.out.println("自分の手は" + play.get(input) + "対戦相手の手は" + play.get(ha));
		
		if(input.equals(ha)) {
			System.out.println("あいこです");
		} else if (input.equals("r") && ha.equals("s")) {
			System.out.println("自分の勝ちです");
		} else if (input.equals("r") && ha.equals("p")) {
			System.out.println("自分の負けです");
		}	else if (input.equals("s") && ha.equals("r")) {
				System.out.println("自分の負けです");
		}else if (input.equals("s") && ha.equals("p")) {
			System.out.println("自分の勝ちです");
		}	else if (input.equals("p") && ha.equals("r")) {
				System.out.println("自分の勝ちです");
		}else if (input.equals("p") && ha.equals("s")) {
					System.out.println("自分の負けです");
		
		
		}
	}
}

