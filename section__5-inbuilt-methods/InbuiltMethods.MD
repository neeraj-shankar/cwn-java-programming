# In-buit Methods in Java

## Java provides a rich set of inbuilt methods across various classes in its standard library. Here are some commonly used inbuilt methods categorized by their respective classes

### String Class

- **`length()`**: Returns the length of the string.
- **`charAt(int index)`**: Returns the character at the specified index.
- **`substring(int beginIndex, int endIndex)`**: Returns a substring from the specified start to end index.
- **`indexOf(String str)`**: Returns the index of the first occurrence of the specified substring.
- **`equals(Object another)`**: Compares this string to the specified object.
- **`toLowerCase()` / `toUpperCase()`**: Converts all characters in the string to lower/upper case.
- **`trim()`**: Removes leading and trailing whitespace.

### StringBuilder/StringBuffer Class

- **`append(String str)`**: Appends the specified string to this character sequence.
- **`insert(int offset, String str)`**: Inserts the specified string at the specified position.
- **`delete(int start, int end)`**: Removes characters from the specified start to end index.
- **`reverse()`**: Reverses the sequence of characters.

### Arrays Class

- **`sort(int[] a)`**: Sorts the specified array into ascending order.
- **`binarySearch(int[] a, int key)`**: Searches the specified array for the specified key using the binary search algorithm.
- **`fill(int[] a, int val)`**: Assigns the specified value to each element of the specified array.
- **`toString(int[] a)`**: Returns a string representation of the array contents.

### Collections Class

- **`sort(List<T> list)`**: Sorts the specified list into ascending order.
- **`reverse(List<?> list)`**: Reverses the order of the elements in the specified list.
- **`shuffle(List<?> list)`**: Randomly permutes the elements in the list.
- **`binarySearch(List<? extends Comparable<? super T>> list, T key)`**: Searches the list for the key using the binary search algorithm.

### Math Class

- **`abs(int a)`**: Returns the absolute value of an integer.
- **`max(int a, int b)`**: Returns the greater of two int values.
- **`min(int a, int b)`**: Returns the smaller of two int values.
- **`pow(double a, double b)`**: Returns the value of the first argument raised to the power of the second argument.
- **`sqrt(double a)`**: Returns the correctly rounded positive square root of a double value.

### System Class

- **`currentTimeMillis()`**: Returns the current time in milliseconds.
- **`arraycopy(Object src, int srcPos, Object dest, int destPos, int length)`**: Copies an array from the specified source array to the specified position of the destination array.
- **`gc()`**: Suggests that the Java Virtual Machine expend effort toward recycling unused objects.

### Object Class

- **`equals(Object obj)`**: Indicates whether some other object is "equal to" this one.
- **`hashCode()`**: Returns a hash code value for the object.
- **`toString()`**: Returns a string representation of the object.
- **`clone()`**: Creates and returns a copy of this object.

These methods form the backbone of many Java programs, providing essential functionality for string manipulation, array handling, mathematical calculations, and more. Java's standard library is extensive, and these are just a few of the many useful methods available.
