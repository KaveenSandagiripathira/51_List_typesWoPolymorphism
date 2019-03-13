
public class Element {
	private int    intElement;
    private double doubleElement;
    private String stringElement;
	private int type;
	
	public Element(int pos, int[] intElements, 
							double[] doubleElements,
							String[] stringElements,
							int[] elementTypes) {
								
		intElement = intElements[pos];
		doubleElement = doubleElements[pos];
		stringElement = stringElements[pos];
		type = elementTypes[pos];	
	}
	

}