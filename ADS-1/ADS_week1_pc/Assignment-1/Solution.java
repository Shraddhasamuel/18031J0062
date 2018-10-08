import java.util.Scanner;
import java.util.LinkedList;

class AddLargeNumbers {
    static String head=null;
	class Node
	{
		int data;
		Node next;
		Node(int data)
		{
			this.data=data;
		}
		
	}
    public static LinkedList<String> numberToDigits(String number) 
    {
    	if(head==null)
    	{
    		head=number;
    	}
   return null;
    }
   

    public static String<String> digitsToNumber(LinkedList list) 
    {
    	list.add(list);
    	return list;
    }

    public static LinkedList<String> addLargeNumbers(LinkedList list1, LinkedList list2) 
    {
    	int l1=list1.size();
    	int l2=list2.size();
    	for(int i=l1=1;i>=0;i++)
    	{
    		
    	}
    	for(int j=l2-1;j<=0;j++)
    	{
    		
    	}
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String p = sc.nextLine();
        String q = sc.nextLine();
        switch(input){
            case "numberToDigits":
                LinkedList<String> pDigits = AddLargeNumbers.numberToDigits(p);
                LinkedList<String> qDigits = AddLargeNumbers.numberToDigits(q);
                System.out.println(AddLargeNumbers.digitsToNumber(pDigits));
                System.out.println(AddLargeNumbers.digitsToNumber(qDigits));
                break;

            case "addLargeNumbers":
                LinkedList<String> pDigits = AddLargeNumbers.numberToDigits(p);
                LinkedList<String> qDigits = AddLargeNumbers.numberToDigits(q);
                LinkedList<String> result = AddLargeNumbers.addLargeNumbers(pDigits, qDigits);
                System.out.println(AddLargeNumbers.digitsToNumber(result));
                break;
        }
    }
    
}
