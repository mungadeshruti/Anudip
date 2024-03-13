package comstring.demo;

public class StringDemo {
	/*
	 * String Comparison
	String comparison can be done in 3 ways.
	1.	Using equals() method
	2.	Using == operator
	3.	By CompareTo() method

	 */

	public static void main(String[] args) {
		//concat two strings
				String name1="shrutika";
				String name2="mungade";
				String name3=name1.concat(name2);
				//System.out.println(name3);
				
				String name4="shrutika";
				String name5="mungade";
				String name6=name4+name5;
				//System.out.println(name6);
				
				/* Using equals() method
				 * equals() method compares two strings for equality. 
				 * It compares the content of the strings.
				 *  It will return true if string matches, else returns false.
				 *
				 */
				String s = "Hell";//using string literral way      // string pool area
				String s1 = "Hello";//using string literral way 
				String s2 = "Hello";//using string literral way 
				
				String s3=new String("Hello");//using new keyword
				String s4=new String("Java"); 
				String s5=new String("Java");
				
				//System.out.println(s.equals(s1)); //false
				//System.out.println(s1.equals(s2));//true
				//System.out.println(s2.equals(s3));//true
				
				//Using == operator
				String ss1 = "Java";  // using literal way
				String ss2 = "Java";  // using literal way
				
				String ss3 = new String ("Java"); // using new opeartor //heap memory 
				String ss4=new String("Java");
				
				System.out.println(ss1==ss2); //true 
				System.out.println(ss1==ss3);// false
				System.out.println(ss3==ss4); //
				
				//By compareTo() method
				
				//String class function
				//charAt()
				String name="shrutika";
						//	 0123456
				System.out.println(name.charAt(2));//d
				
				//equalsIgnoreCase()
				
				/*equalsIgnoreCase() determines the equality of two Strings,
				ignoring thier case (upper or lower case doesn't matters with this fuction ).*/
				
				String na="SHRUTIKA";
				System.out.println(na.equalsIgnoreCase("padmaja"));//boolean return type = true
				
				/*length()
				length() function returns the number of characters in a String.*/
				String na1="shrutika mungade";
				System.out.println(na1.length());// 13
				
				/*replace()
				replace() method replaces occurances of character with a specified new character.*/
				String na2="shrutika mungade";
				
				System.out.println(na2.replace('s', 's'));
				
				
				/*substring()
				substring() method returns a part of the string. substring() method has two forms*/
				String na4="123456789";
				System.out.println(na4.substring(3));
				System.out.println(na4.substring(3, 7));
				System.out.println(na4.toString());
				
				/*
				 * toLowerCase()
		toLowerCase() method returns string with all uppercase characters converted to lowercase.

				 */
				/*toUpperCase()
		This method returns string with all lowercase character changed to uppercase.
		*/
				
				//trim()
				

			}

		}




	