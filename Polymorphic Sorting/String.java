import java.util.Scanner;
public class String
{

public static void main (String[] args)
{
String[] StringList;
int size;
Scanner scan = new Scanner(System.in);
System.out.print ("\nHow many integers do you want to sort? ");
size = scan.nextInt()+1;

StringList = new String[size];
System.out.println ("\nEnter the words...");
for (int i = 0; i < size; i++)
StringList[i] = scan.nextLine();
Sorting.DESinsertionsort(StringList);
System.out.println ("\nYour words in sorted order...");
for (int i = 0; i < size; i++)
System.out.print(StringList[i] + " ");
System.out.println ();
}
}