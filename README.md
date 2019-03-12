# All_List_inArraySlots-w-o-polymorphism-
## implement a list of diverse types without polymorphism
by Kaveen Sandagiripathira and Rachael Cheung

A fork of 4F_List_inArraySlots_v0, aimed at
understanding how such a list
might be programmed without the benefits of polymorphism.

## List_inArraySlots Class
#### Fields:
```
private int[]    intElements; // array containing int elements of the list
private double[] doubleElements; // array containing double elements of the list
private String[] stringElements; // array containing String elements of the list
private int filledElements;  // the number of elements in this list

private int[] typeOfElements; // array containing the respective types of elements in the list

private static final int INITIAL_CAPACITY = 10; // initial capacity for all arrays (or the list)
private static final int INT_NUM = 0; // "magic number" for int types 
private static final int DOUBLE_NUM = 1; // "magic number" for double types 
private static final int STRING_NUM = 2; // "magic number" for String types 
```

#### Constructor(s):
```
/** Constructor that: 
      -initiates all arrays to have a size of INITIAL_CAPACITY */
public List_inArraySlots ()
```

#### Methods:
``` 
// Returns the number of elements in the list (not the capacity)
public int size() 

// Returns a String representation of the list (not including null elements)
public String toString()

// Appends an integer, "value", to the array of the respective type  
public boolean add (int value, int intValue, double doubleValue, String stringValue)

// Doubles the capacity of all arrays (or the list), preserving existing data
private void expand()

```

## UserOfList class:
- Creates an instance of List_inArraySlots
- Incrementally adds elements to the list using list.add()

