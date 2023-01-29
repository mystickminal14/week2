/*write a program that reads a number between 1,000 and 999,999 from
the user, where the user enters a comma in the input. Then print the
number without a comma. Here is a sample dialog:
Please enter an integer between 1,000 and 999,999: 23,456
23456
Hint: Read the input as a string. Measure the length of the string.
Suppose it contains n characters. Then extract substrings consisting of
the first n – 4 characters and the last three characters.
*/

import java.util.Scanner;
public class Comma{
public static void main(String [] args){

Scanner insert= new Scanner(System.in);

System.out.println("enter number betweeen 1000 to 999,999, however please apply commas");
String inse=insert.nextLine();

 String leng=inse.length();

System.out.println( leng.substring(2,4));
}}