/**
  Implement a list of diverse types, including
  integers, double-precision floating point numbers,
  and Strings.
 */

public class List_inArraySlots {

    private int[]    intElements;
    private double[] doubleElements;
    private String[] stringElements;
    private int filledElements; // the number of elements in this list
    
    /* type identifier for each element
       That is, typeOfElements[i] == 0 means element i is an integer;
                                     1 means element i is a double;
                                     2 means element i is a String.
        Optional extra education in programming (not comp sci):
            replace these "magic numbers" with an "enumerated type".
     */
    private int[] typeOfElements;

    private static final int INITIAL_CAPACITY = 10;
	private static final int INT_NUM = 0;
	private static final int DOUBLE_NUM = 1;
	private static final int STRING_NUM = 2;

    /**
      Construct an empty list with a small initial capacity.
     */
    public List_inArraySlots() {
		intElements = new int[INITIAL_CAPACITY];
		doubleElements = new double[INITIAL_CAPACITY];
		stringElements = new String[INITIAL_CAPACITY];
		typeOfElements = new int[INITIAL_CAPACITY];
    }


    /**
      @return the number of elements in this list
     */
    public int size() {
		return filledElements;
    }


     /**
       @return a string representation of this list,
       in [a,b,c,] format
      */
    public String toString() {
		String output = "[";
		for (int pos = 0; pos < filledElements; pos++){
			if (typeOfElements[pos] == INT_NUM)
				output += intElements[pos] + ", ";
			else if (typeOfElements[pos] == DOUBLE_NUM)
				output += doubleElements[pos] + ", ";
			else if (typeOfElements[pos] == STRING_NUM)
				output += stringElements[pos] + ", ";
		}
		return output += "]";
    }


    /**
      Appends @value to the end of this list.

      @return true, in keeping with conventions yet to be discussed
     */
     public boolean add( int type   // same meaning as in typeOfElements
                       , int    intValue
                       , double doubleValue
                       , String stringValue
                       ) {
		if( filledElements == intElements.length) expand();
		if (type == INT_NUM){
			intElements[ filledElements] = intValue;
			typeOfElements[filledElements] = INT_NUM;
		}
		else if (type == DOUBLE_NUM){
			doubleElements[filledElements] = doubleValue;
			typeOfElements[filledElements] = DOUBLE_NUM;
		}
		else if (type == STRING_NUM){
			stringElements[filledElements] = stringValue;
			typeOfElements[filledElements] = STRING_NUM;
		}
		filledElements++;
		return true;
     }


    /**
      Double the capacity of the List_inArraySlots,
      preserving existing data.
     */
     private void expand() {
		int[] intBigger = new int[ intElements.length * 2];
		double[] doubleBigger = new double[ doubleElements.length * 2];
		String[] stringBigger = new String[ stringElements.length * 2];
		int[] typeBigger = new int[ typeOfElements.length * 2];
		
        for( int elemIndex = 0; elemIndex < filledElements; elemIndex++){
            intBigger[ elemIndex] = intElements[ elemIndex];
			doubleBigger[ elemIndex] = doubleElements[ elemIndex];
			stringBigger[ elemIndex] = stringElements[ elemIndex];
			typeBigger[ elemIndex] = typeOfElements[ elemIndex];
		}
        intElements = intBigger;
		doubleElements = doubleBigger;
		stringElements = stringBigger;
		typeOfElements = typeBigger;
     }
	 
	 
	 /**
      accessor
      @return element @index from this list
      precondition: @index is within the bounds of the array.
          (Having warned the user about this precondition,
           you should NOT complicate your code to check
           whether user violated the condition.)
     */
    public Element get( int index ) {
		Element value = new Element(index, intElements, 
										doubleElements, 
										stringElements, 
										typeOfElements);
		
		return value;
    }
}