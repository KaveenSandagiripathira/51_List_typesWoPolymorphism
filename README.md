# All_List_inArraySlots-w-o-polymorphism-
## implement a list of diverse types without polymorphism
by Kaveen Sandagiripathira and Rachael Cheung

A fork of 4F_List_inArraySlots_v0, aimed at
understanding how such a list
might be programmed without the benefits of polymorphism.

## List_inArraySlots Class
#### Fields:
```
private int filledElements; // the number of elements in this list

private Element[] list; // array containing elements of different types 

private static final int INITIAL_CAPACITY = 10; // initial capacity of the list
```

#### Constructor(s):
```
/** Constructor that: 
      -initiates Element array to have a size of INITIAL_CAPACITY */
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

// Returns element at a specific index from this list
public Element get (int index)

```

## UserOfList class:
- Creates an instance of List_inArraySlots
- Incrementally adds elements to the list using list.add()
- tests methods in List_inArraySlots

