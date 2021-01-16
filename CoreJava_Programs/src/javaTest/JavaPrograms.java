package javaTest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;
import java.util.Vector;

public class JavaPrograms {
	public static String RemoveDuplicates()	{
		Set set = new HashSet();
		StringBuilder output = new StringBuilder();
		Scanner input = new Scanner(System.in);
	    System.out.println("Enter the required string value ::");
	    String reqString = input.nextLine();
	    
	    char[] myArr = reqString.toCharArray();
	    for(char ch : myArr)
	    {
	    	if(!set.contains(ch))
	    	{
	    		set.add(ch);
	    		output.append(ch);
	    	}
	    }

	    System.out.println("The Output value is :" + output);
		return output.toString();		
	}
	
	public static void StrigCompare()
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the string value : ");
		String s1 = input.nextLine();
		String s2 = new String("Periyava");
		System.out.println("String comparison using == operator :" + s1==s2);
		System.out.println("String comparison using equals() method :" + s1.equals(s2));
	}
	
	public static void CheckLeapYear()
	{
		System.out.println("Enter the year to check it is leap or not");
		int year = new Scanner(System.in).nextInt();
		if((year % 400 == 0) || ((year %4 == 0) && (year % 100!=0)))
		{
			System.out.println("Year " + year + " is a Leap Year");
		}
		else
		{
			System.out.println("Year " + year + " is not a Leap Year" );
		}
	}
	
	public static void NoOfOccurance()
	{
		//Creating a HashMap, key :Character  value : occurrences as Integer
		HashMap<Character,Integer>charCount = new HashMap<Character,Integer>();
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the string value :");
		String strInput = input.nextLine();
        
		//Converting inputString to char array
		char[] charArr = strInput.toCharArray();
		for(char ch : charArr)
		{
			if(charCount.containsKey(ch))
			{
				charCount.put(ch, charCount.get(ch)+1);
			}
			else
			{
				charCount.put(ch,1);
			}			
		}
		
		System.out.println(charCount);
	}
	
	public static void CheckPalindromeNo()
	{
		Scanner input = new Scanner(System.in);
		int reminder, sum = 0, temp;
		System.out.println("Enter the Number :");
		int num = input.nextInt();		
		temp = num;
		
		while(num > 0)
		{
			reminder = num % 10;	//	to get the reminder
			sum = (sum*10)+reminder;
			num = num / 10;
		}
		
		if(temp == num)	{
			System.out.println("The number is Palindrome : ");			
		}
		else	{
			System.out.println("The number is  not a Palindrome: ");
		}			
	}
	
	public static void CheckPalindromeString(String sInput)
	{
		String reverse = "";
		int length = sInput.length();
		for(int i = length - 1; i >= 0; i--)
		{
			reverse = reverse + sInput.charAt(i);
		}
		
		if(reverse.equals(sInput))
			System.out.println("Palindrome"); 
		else
			System.out.println("Not Palindrome");
	}
	
	public static void StringTokenize()
	{
		StringTokenizer sToken = new StringTokenizer("Welcome to the world of Seleium Automation!!!");
		while(sToken.hasMoreTokens())	{
			System.out.println(sToken.nextToken());
		}				
	}
	
	public static void CheckArmstrong()	
	{
		int cube = 0, mod, temp;
		int no = 371;
		temp = no;
		while (no > 0)	{
			mod = no % 10;
			no = no / 10;
			cube = cube + (mod * mod * mod);
		}
		
		if(temp == cube)
			System.out.println("armstrong number");   
	    else  
	        System.out.println("Not armstrong number");   
	}
	
	public static void FibonacciSeries()
	{
		int n1=0, n2=1, n3, i, count = 10;
		System.out.println(n1 + " " + n2);		//	Prints 0 and 1
		
		for(i = 2; i < count; ++i)		//loop starts from 2 because 0 and 1 are already printed 
		{
			n3=n1+n2;
			System.out.println(" " + n3);
			n1 = n2;
			n2 = n3;
		}
	}
	
	public static void CheckPrimeNo()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Number to check: ");
		String strInput = scan.nextLine();
		boolean bFlag = false;
		int num = Integer.parseInt(strInput);
		
		for(int i = 2; i <= num/2; ++i)
		{
			if(num % i == 0)
			{
				bFlag = true;
				break;
			}
		}
		
		if(!bFlag)
		    System.out.println(num + " is a prime number.");
	    else
	        System.out.println(num + " is not a prime number.");
	}

	public static void CountVowelConsonant()
	{
		int vCount = 0, cCount = 0, len = 0;
		String str = "This is really a simple sentence";
		len = str.length();
		str = str.toLowerCase();
		
		for(int i = 0; i < len; i++)
		{
			if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u')
			{
				vCount++;
			}
			else if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
			{
				cCount++;
			}
		}
		
		System.out.println("Number of vowels: " + vCount);    
        System.out.println("Number of consonants: " + cCount);  
	}
	
	public static void CheckAnagram()
	{
		String str1 = "Listen";
		String str2 = "Silent";
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		
		if(str1.length() != str2.length())
		{
			System.out.println("Both the strings are not Anagram");
		}
		else
		{
			//	Converting both the array to character array
			char[] chStr1 = str1.toCharArray();
			char[] chStr2 = str2.toCharArray();
			Arrays.sort(chStr1);
			Arrays.sort(chStr2);
			
			if(Arrays.equals(chStr1, chStr2) == true)
			{
				System.out.println("Both the strings are Anagram");				
			}
			else
			{
				System.out.println("Both the strings are not Anagram");	
			}			
		}		
	}
	
	public static void RemveSpaces()
	{
		String str = "Welcome   to   the Java Programming";
		for(char ch : str.toCharArray())
		{
			if(ch != ' ')
				System.out.print(ch);
		}
	}
	
	public static void DuplicateNoFinder()
	{
		int[] arr = new int[] {1, 2, 3, 4, 2, 7, 8, 8, 3, 1, 4, 7};
		int len = arr.length;		
        System.out.println("Duplicate numbers in the given int array: ");  

        for(int i = 0; i < len; i++)
        {
        	for(int j = i + 1; j <len; j++)
        	{
        		if(arr[i] == arr[j])
        		{
        			System.out.println(arr[j]);
        		}
        	}
        }
	}

	public static void DuplicateWordFinder()
	{
		String str = "Big black bug bit a big black dog on his big black dog nose";
		int count;
		str = str.toLowerCase();
		String[] words = str.split(" ");
		System.out.println("Duplicate words in a string: ");
		
		for(int i = 0; i < words.length; i++)
		{
			count = 1;
			for(int j = i+1; j < words.length; j++)
				if(words[i].equals(words[j]))
				{
					count++;
					words[j] = "0";		//Set words[j] to 0 to avoid printing visited word
				}
			
			if(count > 1 && words[i]!="0")
				System.out.println(words[i]);
		}			
	}
	
	public static void DuplicateCharFinder()
	{
		String sInput = "Java Collections Program";
		char[] charArray = sInput.toCharArray();
		// build HashMap with character and number of times they appear in String
		Map<Character, Integer> charMap = new HashMap<Character, Integer>();
		for(Character ch : charArray)
		{
			if(charMap.containsKey(ch))	
			{
				charMap.put(ch, charMap.get(ch)	+ 1);
			}
			else
			{
				charMap.put(ch, 1);
			}
		
			// Iterate through HashMap to print all duplicate characters of String
			Set<Map.Entry<Character, Integer>> entrySet = charMap.entrySet();
			//System.out.printf("List of duplicate characters in String '%s' %n", sInput);
			for(Map.Entry<Character, Integer> entry : entrySet)
			{
				if(entry.getValue() > 1)
				{
					System.out.printf("%s : %d %n", entry.getKey(), entry.getValue());
				}
			}
			
		}		
	}
	
	public static void TestArrayList()
	{
		ArrayList<String> arrList = new ArrayList<String>();
		arrList.add("Ganesh");
		arrList.add("Shiva");
		arrList.add("Vishnu");
		arrList.add("Murugan");
		arrList.add("Swaminathan");
		arrList.add("Sastha");
		arrList.add("Iyyapan");
		arrList.add("Eshwaran");
		
		System.out.println("Element in the ArrayList are : "); 
		Iterator itr = arrList.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}		
	}
	
	public static void TestLinkedList()
	{
		LinkedList<String> linkList = new LinkedList<String>();
		linkList.add("Ramachandran");
		linkList.add("Rajagopal");
		linkList.add("Raghuraman");
		linkList.add("Ramanan");
		linkList.add("Rajaram");
		linkList.add("Ramachandran");
		linkList.add("Rajasekar");
		linkList.add("Rajaram");
		
		System.out.println("The elements in the Linkedlist are : ");
		Iterator<String> itr = linkList.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}		
	}
	
	public static void TestVector()
	{
		Vector<String> v = new Vector<String>();
		v.add("apple");
		v.add("bananna");
		v.add("guava");
		v.add("pineapple");
		v.add("grapes");
		v.add("jackfruit");
		v.add("orange");
		
		System.out.println("Elements in the Vector are : ");
		Iterator<String> itr = v.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}						
	}
	
	public static void TestHashSet()
	{
		HashSet<String> hSet = new HashSet<String>();
		hSet.add("Ravi");
		hSet.add("Vijay");
		hSet.add("Raja");
		hSet.add("Raman");
		hSet.add("Ravi");
		hSet.add("Vignesh");
		hSet.add("Ajith");
		hSet.add("Ajith");
		hSet.add("Raman");
		
		System.out.println("Element in HasSet are : ");
		Iterator<String> itr = hSet.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
	
	public static void TestTreeSet()
	{
		TreeSet<String> tSet = new TreeSet<String>();
		tSet.add("Ajay");
		tSet.add("Bala");
		tSet.add("Ganesh");
		tSet.add("Karthik");
		tSet.add("Narayanan");
		tSet.add("Raman");
		tSet.add("Thiru");
		tSet.add("Vijay");
		
		System.out.println("Elements in the TreeSet are : ");
		Iterator<String> itr = tSet.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
	
	public static void SortIntArray()
	{
		int[] intArray = new int[] {52,45,32,64,12,87,78,98,23,7};
		int temp = 0;
		int length = intArray.length;
		//	Print the original array
		for(int i = 0; i < length; i++)
		{
			System.out.print(intArray[i] + " ");
		}
		
		//	Sort the array using in ascending order using 2 for loops
		for(int i = 0; i < length; i++)
		{
			for(int j = i+1; j < length; j++)
			{
				if(intArray[i] > intArray[j])
				{
					//	Swap elements if not in order
					temp = intArray[i];
					intArray[i] = intArray[j];
					intArray[j] = temp;
				}
			}			
		}
		
		System.out.println("\n Array sorted in ascending order: ");
		for(int i = 0; i < length; i++)
		{
			System.out.print(intArray[i] + " ");
		}		
	}
	
	public static void IntArrayCount()
	{
		int [] intputArray = new int[] {12, 9, 12, 9, 10, 9, 10, 11, 4, 5, 6, 7, 8, 5, 4, 12, 9};
		Map<Integer, Integer> arrayCountMap = new HashMap<Integer, Integer>();
		//	Checking every element of the inputArray
		for(int i : intputArray)
		{
			if(arrayCountMap.containsKey(i))
			{
                //If element is present in elementCountMap, incrementing it's count by 1
				arrayCountMap.put(i, arrayCountMap.get(i)+1);				
			}
			else
			{
                //If element is not present in elementCountMap, 
                //adding this element to elementCountMap with 1 as it's value
				arrayCountMap.put(i, 1);
			}
		}
		
		System.out.println("Input Array : " + Arrays.toString(intputArray));
		System.out.println("Element count: " + arrayCountMap);
	}
	
	public static void main(String[] args) {
		//RemoveDuplicates();
		//StrigCompare();
		//NoOfOccurance();
		//CheckLeapYear();
		//CheckPalindromeNo();
		//CheckPalindromeString("malayalam");
		//StringTokenize();
		//ChecksArmstrong();
		//FibonacciSeries();
		//CheckPrimeNo();
		//DuplicateNoFinder();
		//DuplicateWordFinder();
		//DuplicateCharFinder();
		//	Characters a, e, i, o, u are known as vowels in the English alphabet. Any character other than that is known as the consonant.
		//CountVowelConsonant();
		
		//	An anagram of a string is another string that contains same characters, only the order of characters can be different. For example, “abcd” and “dabc” are anagram of each other.
		//	LISTEN - SILENT & TRIANGLE - INTEGRAL
		//CheckAnagram();
		//RemveSpaces();
		//TestArrayList();	//	It uses a dynamic array to store the duplicate element of different data types. The ArrayList class maintains the insertion order and is non-synchronized. The elements stored in the ArrayList class can be randomly accessed.
		
		/*	LinkedList implements the Collection interface. It uses a doubly linked list internally to store the elements. 
		It can store the duplicate elements. It maintains the insertion order and is not synchronized. 
		In LinkedList, the manipulation is fast because no shifting is required.*/
		//TestLinkedList();
		//TestVector();
		//TestHashSet();	//	It represents the collection that uses a hash table for storage. Hashing is used to store the elements in the HashSet. It contains unique items.
		//TestTreeSet();	//	The elements in TreeSet stored in ascending order.
		//SortIntArray();
		IntArrayCount();
		
	}
}
