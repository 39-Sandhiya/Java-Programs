//%*******PRINT ARRAY ELEMENTS**********
//package base;
//import java.util.Scanner;
//public class Array {
//
//	public static void main(String[] args) {
//		Scanner scan =new Scanner(System.in);
//		while(true) {
//			int[] arr=new int[5];
//			System.out.println();
//			System.out.println("enter 5 elements: ");
//		for(int i=0;i<5;i++) {
//			arr[i]=scan.nextInt();
//		}
//		System.out.println("Entered 5 elements are: ");
//		for(int i=0;i<5;i++) {
//			System.out.println(arr[i]);
//		}
//	}
//}
//}
//*****SUM of array -input n elements*****
//package base;
//import java.util.Scanner;
//public class Array {
//
//	public static void main(String[] args) {
//		Scanner scan =new Scanner(System.in);
//		while(true) {
//			int sum=0;
//			System.out.println();
//			System.out.println("enter n numbers inputs ");
//			int n= scan.nextInt();
//			int[] arr=new int[n];
//			System.out.println("enter elements: ");
//		for(int i=0;i<n;i++) {
//			arr[i]=scan.nextInt();
//			sum+=arr[i];
//		}
//		System.out.println("sum of "+n +" elements are: "+sum);
//			}
//}
//}
//*******Find largest element and smallest element******
//package base;
//import java.util.Scanner;
//public class Array {
//
//	public static void main(String[] args) {
//		Scanner scan =new Scanner(System.in);
//		while(true) {
//			int sum=0;
//			System.out.println();
//			System.out.println("enter n numbers inputs ");
//			int n= scan.nextInt();
//			int[] arr=new int[n];
//			System.out.println("enter elements: ");
//		for(int i=0;i<n;i++) {
//			arr[i]=scan.nextInt();
//		}
//		int smallest=arr[0];
//		for(int i=0;i<n;i++) {
//			if(smallest>arr[i]) { 
//				smallest=arr[i];  
//			}
//		if(largest<arr[i]){
//			largest=arr[i];
//		}
//		System.out.println("smallest : "+smallest);
//		System.out.println("Largest = " + largest);
//			}
//}}
//*****Count even & odd numbers******
//package base;
//import java.util.Scanner;
//public class Array {
//
//	public static void main(String[] args) {
//		Scanner scan =new Scanner(System.in);
//		while(true) {
//			int even_count=0,odd_count=0;
//			System.out.println();
//			System.out.println("enter n numbers inputs ");
//			int n= scan.nextInt();
//			int[] arr=new int[n];
//			System.out.println("enter elements: ");
//		for(int i=0;i<n;i++) {
//			arr[i]=scan.nextInt();
//			if(arr[i]%2==0) {
//				 even_count++;
//			}
//			else {
//				odd_count++;
//			}}
//		System.out.println("even count : "+even_count +" odd count : "+odd_count);		
//			}
//}}
//****Search an element*****
//package base;
//import java.util.Scanner;
//public class Array {
//
//	public static void main(String[] args) {
//		Scanner scan =new Scanner(System.in);
//		while(true) {
//			int sum=0,flag=0;
//			System.out.println();
//			System.out.println("enter n numbers inputs ");
//			int n= scan.nextInt();
//			int[] arr=new int[n];
//			System.out.println("enter elements: ");
//		for(int i=0;i<n;i++) {
//			arr[i]=scan.nextInt();			
//		}
//		System.out.println("enter number to search");
//		int search=scan.nextInt();
//		for(int i=0;i<n;i++) {
//			if(arr[i]==search) {
//				flag=1;
//				break; //didn’t break after finding👉 This wastes time
//			}}
//		if(flag==1) {
//		System.out.println(search +" found");
//		}
//		else {
//			System.out.println(search +"Not found");
//		}
//			}
//}}
// for SEARCHING WITH INDEX*******
//int index = -1;
//
//for(int i = 0; i < n; i++) {
//    if(arr[i] == search) {
//        index = i;
//        break;
//    }
//}
//
//if(index != -1)
//    System.out.println("Found at index " + index);
//else
//    System.out.println("Not found");
//*****Print elements at even index******
//package base;
//import java.util.Scanner;
//public class Array {
//
//	public static void main(String[] args) {
//		Scanner scan =new Scanner(System.in);
//		while(true) {
//			int count=0;
//			System.out.println();
//			System.out.println("enter n numbers inputs ");
//			int n= scan.nextInt();
//			int[] arr=new int[n];
//			System.out.println("enter elements: ");
//		for(int i=0;i<n;i++) {
//			arr[i]=scan.nextInt();
//			}
//		System.out.println("even index elements are: ");
//		for(int i=0;i<n;i+=2) {
//				System.out.println(arr[i]);
//			}}
//		}
//}}
//***Arrays.sort()...sorting an array****
//package base;
//import java.util.Arrays;
//public class Array {
//
//	public static void main(String[] args) {
//		int arr[]= {2,34,5,12,78,89,45,90,36};
//		Arrays.sort(arr);//it returns void and sort the array in place
//		System.out.println("sorting: "+ Arrays.toString(arr));
//		System.out.println("Smallest = " + arr[0]);
//		System.out.println("Largest = " + arr[arr.length - 1]);
//	}
//}
//****Manual Sorting – Important) 👉 Bubble Sort****
//package base;
//public class Array {
//
//	public static void main(String[] args) {
//		int arr[]= {2,34,5,12,78,89,45,90,36};
//		for(int i=0;i<arr.length;i++) {
//			for(int j=0;j<arr.length-1;j++) {
//				if(arr[j]<arr[j+1]) {
//					int temp=arr[j+1];
//					arr[j+1]=arr[j];
//					arr[j]=temp;		
//				}
//			}
//		}
//		for(int i=0;i<arr.length;i++) {
//		System.out.println(arr[i]);
//		}}}
//*****print in reverse order.(this question differ from reverse array..ur question is only print reverse order..not reverse an array)*****
//package base;
//import java.util.Scanner;
//public class Array {
//	public static void main(String[] args) {
//		Scanner scan =new Scanner(System.in);
//		while(true) {
//		System.out.println("enter n number of element: ");
//		int n=scan.nextInt();
//		System.out.println("enter elements ");
//		int[] arr=new int[n];
//		for(int i=0;i<n;i++) {
//			arr[i]=scan.nextInt();
//		}
//		for(int i=arr.length-1;i>=0;i--) {
//				System.out.println(arr[i]);
//				}
//			}
//		}}
//********for reverse an array**********
//int start = 0, end = arr.length - 1;
//
//while(start < end) {
//    int temp = arr[start];
//    arr[start] = arr[end];
//    arr[end] = temp;
//    start++;
//    end--;
//}
//***Second largest element****
//package base;
//public class Array {
//	public static void main(String[] args) {
//		int[] arr= {10,10,21,34,54,10};
//		int largest= Integer.MIN_VALUE;
//		int second= Integer.MIN_VALUE;
//		for(int i=0;i<arr.length;i++) {
//			if(arr[i]>largest) {
//				second=largest;
//				largest=arr[i];
//			}
//			else if(arr[i]>second && arr[i]!=largest) {
//				second=arr[i];
//			}
//		}
//		System.out.println("Second largest : "+second);
//	}
//}
//***Count frequency of each element****
//package base;
//import java.util.Scanner;
//public class Array {
//	public static void main(String[] args) {
//		Scanner scan=new Scanner(System.in);
//		while(true) {
//			System.out.println("enter n number of element: ");
//			int n=scan.nextInt();
//			System.out.println("enter elements ");
//			int[] arr= new int[n];
//			for(int i=0;i<n;i++) {
//				arr[i]=scan.nextInt();
//			}
//			for(int i=0;i<n;i++) {
//				int count=1;
//				if(arr[i]==-1) {
//					continue;
//				}
//				for(int j=i+1;j<n;j++) {
//					if(arr[i]==arr[j]) {
//						count++;
//						arr[j]=-1;
//					}
//				}
//				System.out.println(arr[i]+" occurs "+count +" times");
//			}
//		}
//	}
//}

//***copy one array to other ****
//package base;
//import java.util.Scanner;
//public class Array {
//	public static void main(String[] args) {
//		Scanner scan =new Scanner(System.in);
//		while(true) {
//			System.out.println();
//			System.out.println("enter n numbers inputs ");
//			int n= scan.nextInt();
//			int[] arr=new int[n];
//			System.out.println("enter elements: ");
//		for(int i=0;i<n;i++) {
//			arr[i]=scan.nextInt();
//		}
//		System.out.println("copied array ");
//		int[] copy=new int[n];
//		
//		for(int i=0;i<n;i++) {
//			copy[i]=arr[i];
//			System.out.println(copy[i]);
//		}
//}}}
//*****Find index of element******
//package base;
//import java.util.Scanner;
//public class Array{
//public static void main(String[] args) {
//	Scanner scan= new Scanner(System.in);
//	while(true) {
//		System.out.println();
//		System.out.println("enter n numbers inputs ");
//		int n= scan.nextInt();
//		int[] arr=new int[n];
//		System.out.println("enter elements: ");
//	for(int i=0;i<n;i++) {
//		arr[i]=scan.nextInt();
//	}
//	System.out.println("enter element to find index ");
//	int find=scan.nextInt();
//	for(int i=0;i<n;i++) {
//		if(find==arr[i]) {
//			System.out.println("index at "+i);
//		}
//	}
//	}
//}
//}
//*****Check if Array is Sorted******
//package base;
//import java.util.Scanner;
//public class Array {
//
//	public static void main(String[] args) {
//		Scanner scan =new Scanner(System.in);
//		while(true) {
//			int even_count=0,odd_count=0;
//			System.out.println();
//			System.out.println("enter n numbers inputs ");
//			int n= scan.nextInt();
//			int[] arr=new int[n];
//			System.out.println("enter elements: ");
//		for(int i=0;i<n;i++) {
//			arr[i]=scan.nextInt();
//		}
//		boolean sorted=true;
//		for(int i=0;i<n-1;i++) {
//		if(arr[i]>arr[i+1]) {
//			sorted=false;
//			break;
//		}}
//		System.out.println("elements sorted! "+sorted);
//			}
//		}}
// REMOVE DUPLICATES 
//package base;
//import java.util.Scanner;
//public class Array {
//
//	public static void main(String[] args) {
//		Scanner scan =new Scanner(System.in);
//		while(true) {
//			int even_count=0,odd_count=0;
//			System.out.println();
//			System.out.println("enter n numbers inputs ");
//			int n= scan.nextInt();
//			int[] arr=new int[n];
//			System.out.println("enter elements: ");
//		for(int i=0;i<n;i++) {
//			arr[i]=scan.nextInt();
//		}
//		for(int i=0;i<n;i++) {
//			boolean isduplicate=false;
//			for(int j=0;j<i;j++) {
//				if(arr[i]==arr[j]) {
//					isduplicate=true;
//					break;
//				}
//			}
//			if(!isduplicate) {
//			System.out.println(arr[i]);
//			}
//		}
//		
//		}		
//}}
//FIND DUPLICATE ELEMENTS
//package base;
//import java.util.Scanner;
//public class Array {
//
//	public static void main(String[] args) {
//		Scanner scan =new Scanner(System.in);
//		while(true) {
//			System.out.println();
//			System.out.println("enter n numbers inputs ");
//			int n= scan.nextInt();
//			int[] arr=new int[n];
//			System.out.println("enter elements: ");
//		for(int i=0;i<n;i++) {
//			arr[i]=scan.nextInt();
//		}
//		for(int i=0;i<n;i++) {
//			boolean isdupli=false;
//			for( int j=0;j<i;j++){
//				if(arr[i]==arr[j]) {
//					isdupli=true;
//					break;
//				}
//			}
//			if(isdupli) {
//				System.out.println(arr[i]);
//			}
//		}
//		}		
//}}
//merge 2 array
//package base;
//import java.util.Scanner;
//public class Array {
//
//	public static void main(String[] args) {
//		Scanner scan =new Scanner(System.in);
//			int[] arr1= {12,24,36,48,60};
//			int[] arr2= {72,84,96,108};
//			int len1=arr1.length;
//			int len2=arr2.length;
//			int len3=len1+len2;
//			int[] arr3=new int[len3];
//			for(int i=0;i<len1;i++) {
//				arr3[i]=arr1[i];
//			}
//			for(int i=0;i<len2;i++) {
//				arr3[len1+i]=arr2[i];
//			}
//			System.out.println("full output");
//			for(int i=0;i<len3;i++) {
//			System.out.println(arr3[i]);
//			}	
//}}
//ARRAY INTERSECTION
//package base;
//import java.util.Scanner;
//public class Array {
//	public static void main(String[] args) {
//		Scanner scan =new Scanner(System.in);
//			int[] arr1= {24,36,48,60,2};
//			int[] arr2= {12,84,36,108,24,60};
//			int l1=arr1.length;
//			int l2=arr2.length;
//			for(int i=0;i<l1;i++) {
//				boolean is_intersect=false;
//				for(int j=0;j<l2;j++) {
//					if(arr1[i]==arr2[j]) {
//						is_intersect=true;
//						break;
//					}
//				}
//				if(is_intersect) {
//				System.out.println(arr1[i]);
//				}
//			}				
//}}
//find palindrome or not
//package base;
//public class Array {
//	public static void main(String[] args) {
//int[] arr = {1,4,2,1};
//
//int start = 0;
//int end = arr.length - 1;
//
//boolean isPalindrome = true;
//
//while(start < end) {
//
//    if(arr[start] != arr[end]) {
//        isPalindrome = false;
//        break;
//    }
//
//    start++;
//    end--;
//}
//
//if(isPalindrome) {
//    System.out.println("Palindrome");
//} else {
//    System.out.println("Not Palindrome");
//}}}
//ALTERNATIVE APPROACHES FOR PALINDROME
//using FOR LOOP
//boolean isPalindrome = true;
//
//for(int i = 0; i < arr.length/2; i++) {
//    if(arr[i] != arr[arr.length - 1 - i]) {
//        isPalindrome = false;
//        break;
//    }
//}
//Reverse array and compare
//int[] arr = {1,2,3,2,1};
//int[] rev = new int[arr.length];
//
//for(int i = 0; i < arr.length; i++) {
//    rev[i] = arr[arr.length - 1 - i];
//}
//
//boolean same = true;
//
//for(int i = 0; i < arr.length; i++) {
//    if(arr[i] != rev[i]) {
//        same = false;
//        break;
//    }
//}
//FIND MISSING NUMBER
//package base;
//import java.util.Scanner;
//public class Array {
//	public static void main(String[] args) {
//			int[] arr= {1,2,3,5};
//			int n=5,missing;
//			int total,sum=0;
//			for(int i=0;i<arr.length;i++) {
//				sum+=arr[i];
//			}
//			total=n*(n+1)/2;
//			missing=total-sum;
//			System.out.println(missing);		
//	}}