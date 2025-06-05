public class String_Builder {
    public static void main(String args[]){
        // append() – Adds a string (or any data type) to the end
StringBuilder sb = new StringBuilder("Hello");
sb.append(" World");
System.out.println(sb);  // Hello World

// insert() – Inserts a string at a specified position
StringBuilder sb1 = new StringBuilder("Hello");
sb1.insert(5, ",");
System.out.println(sb1);  // Hello,

// replace() – Replaces a range of characters with the specified string
StringBuilder sb2 = new StringBuilder("Hello World");
sb2.replace(6, 11, "Java");
System.out.println(sb2);  // Hello Java

// delete() – Deletes characters from start to end (exclusive)
StringBuilder sb3 = new StringBuilder("Hello World");
sb3.delete(5, 11);
System.out.println(sb3);  // Hello

// deleteCharAt() – Deletes the character at the specified index
StringBuilder sb4 = new StringBuilder("Hello");
sb4.deleteCharAt(1);
System.out.println(sb4);  // Hllo

// reverse() – Reverses the entire character sequence
StringBuilder sb5 = new StringBuilder("Hello");
sb5.reverse();
System.out.println(sb5);  // olleH

// toString() – Converts StringBuilder to a String
StringBuilder db7 = new StringBuilder("Hello");
String str = db7.toString();
System.out.println(str);  // Hello

// length() – Returns the number of characters
StringBuilder sb8 = new StringBuilder("Hello");
System.out.println(sb8.length());  // 5

// capacity() – Returns the current capacity (buffer size)
StringBuilder sb9 = new StringBuilder();
System.out.println(sb9.capacity());  // 16 (default initial capacity)

// setCharAt() – Changes the character at a given index
StringBuilder sb10 = new StringBuilder("Hello");
sb10.setCharAt(1, 'a');
System.out.println(sb10);  // Hallo

// charAt() – Returns the character at the specified index
StringBuilder sb11 = new StringBuilder("Hello");
char ch = sb11.charAt(1);
System.out.println(ch);  // e

// substring(start) – Returns substring from given start index
StringBuilder sb12 = new StringBuilder("Hello");
System.out.println(sb12.substring(2));  // llo

// substring(start, end) – Returns substring from start to end-1
StringBuilder sb13 = new StringBuilder("Hello");
System.out.println(sb13.substring(1, 4));  // ell

// ensureCapacity() – Ensures minimum capacity is set
StringBuilder sb14 = new StringBuilder();
sb14.ensureCapacity(50);
System.out.println(sb14.capacity());  // ≥50

// trimToSize() – Trims the capacity to match the length
StringBuilder sb15 = new StringBuilder("Hello");
sb15.trimToSize();
System.out.println(sb15.capacity());  // 5

    }
}