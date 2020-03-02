
public class SquareArea implements ISubscriber {

	@Override
	public double notifySubscriber(String input) {
		// TODO Auto-generated method stub
		int side = Integer.parseInt(input);
		return side*side;
	}

	@Override
	public String returnPrintableName() {
		// TODO Auto-generated method stub
		return "Square Area";
	}
	
	

}
