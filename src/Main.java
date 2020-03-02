import java.util.Scanner;

public class Main {
	private static ISubscriber subscribers [] = {
			new SquareArea(),
	};
	
	
	
	public static void main(String[] args) {
		Topic mathTopic = new Topic();
		for (ISubscriber sub : subscribers) {
			mathTopic.addSubscriber(sub);
		}
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		sc.close();
		mathTopic.dispatchEvent(input);
	}
}
