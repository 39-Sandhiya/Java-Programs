//*******PRINT EACH CHARACTER********
//package base;
//
//public class string {
//
//	public static void main(String[] args) {
//	
//				String name= "sandhiya";
// /*				for(int i=0;i<name.length();i++) {
//					System.out.println(name.charAt(i));
//			} THIS OR BELOW */		
//				char[] array=name.toCharArray();
//					System.out.println(array);
//			}
//}

//******FIND LENGTH WITHOUT length()*******
//package base;
//
//public class string {
//
//	public static void main(String[] args) {
//				int count=0;
//				String name= "sandy_sambath";
//			/*	while(true) {
//					try {
//						name.charAt(i);
//						count++;
//						i++;
//				}catch(Exception e) {
//						break;
//					}  THIS OR BELOW  */
//			for(int i=0;i<(name.toCharArray()).length;i++) {
//			count++;	
//	}
//	System.out.println(count);
//	}}

//*****Count vowels******
//package base;
//
//public class string {
//
//	public static void main(String[] args) {
//				
//				String name= "kvyoOgasruiu";
//				int count=0;
//				for(int i=0;i<name.length();i++) {
//					char vow=Character.toLowerCase( name.charAt(i));
//					if(vow=='a' || vow=='e'|| vow=='i'|| vow=='o'|| vow=='u') {
//						count++;
//					}
//					
//				}
//				System.out.println(count);				
//	}}

//*****Convert to uppercase manually*****
//package base;
//
//public class string {
//
//	public static void main(String[] args) {
//				
//				String name="sandhiyayogasri";	
//				String result="";    /*s-->115 S-->83 115-83=32  */	
//				for(int i=0;i<name.length();i++) {
//				char arr=name.charAt(i);
//				if(arr>='a' && arr<='z') {
//				    arr= (char)(arr-32);
//				}	
//				result+=arr;
//				}	
//				System.out.println(result);
//	} 
//	}

//***Count digits in string****
//package base;
//
//public class string {
//
//	public static void main(String[] args) {
//				int count=0;
//			String name="san56dhi25ya8366";
//			for(int i=0;i<name.length();i++) {
//			char ch=name.charAt(i);
//			if(ch>='0' && ch<='9') {
//			count++;
//			}
//		}System.out.println(count);
//	}}

//*****Remove spaces*****
//package base;
//public class string {
//
//	public static void main(String[] args) {
//					
//				String name="  u  ie gahvxsandy wq b    ";
//				String result="";
//				for(int i=0;i<name.length();i++) {
//					char ch=name.charAt(i);
//					if(ch!=' ') {
//						result+=ch;
//					}
//				}
//				System.out.println(result);
//				
//	}}

//*******Check empty string*********
//package base;
//
//public class string {
//
//	public static void main(String[] args) {
//			String s=" ";	
//			if(s.isEmpty()) {  /* if(s.length() == 0) */
//				System.out.println("empty");
//			}
//			else {
//				System.out.println("not empty");
//			}				
//	}}

// ________________*************_________________


//**********Reverse string**********

//package base;
//
//public class string {
//
//	public static void main(String[] args) {
//			String s="kevi65kevi";
//			String rev="";
//			for(int i=s.length()-1;i>=0;i--) {
//				char ch=s.charAt(i);
//				rev+=ch;
//			}
//			System.out.println(rev);
//	}
//}
//*****Palindrome check******
//package base;
//
//public class string {
//
//	public static void main(String[] args) {
//			String s="smadams";
//			String rev="";
//			for(int i=s.length()-1;i>=0;i--) {
//				char ch=s.charAt(i);
//				rev+=ch;
//			}
//			if(rev.equals(s)) {
//				System.out.println("palindrome");
//			}
//			else {
//				System.out.println("not a palindrome");
//			}
//	}
//}
//*******************(OR)*****************ALTERNATIVE FOR ABOVE*******
//🔁 Better (no extra string)
//int start = 0, end = s.length()-1;
//boolean isPal = true;
//
//while(start < end) {
//    if(s.charAt(start) != s.charAt(end)) {
//        isPal = false;
//        break;
//    }
//    start++;
//    end--;
//}
//
//System.out.println(isPal ? "Palindrome" : "Not Palindrome");

//******count WORDS*******
//package base;
//
//public class string {
//
//	public static void main(String[] args) {
//			int word=0;
//		String s="helo guys iam dd suyv sa  sandy from ece";
//			for(int i=0;i<s.length();i++) {
//				if(s.charAt(i)!=' ' && (i==0 || s.charAt(i-1)==' ')) {
//					word++;
//				}
//			}
//			System.out.println("WORD COUNT :" + word);
//	}
//}  					OR			
//package base;
//
//public class string {
//
//	public static void main(String[] args) {
//			int word=0;
//		String s=" helo guys iam sa  sandy from ece";
//		s=s.trim(); /*remove space at start and end*/
//		String[] words=s.split("\\s+");
//		System.out.println(words.length);
//	}
//}
//******REMOVE duplicate CHARACTER*******
//package base;
//
//public class string {
//
//	public static void main(String[] args) {
//			String s="sandhiyayogasri";
//			String result="";
//			for(int i=0;i<s.length();i++) {
//				char ch=s.charAt(i);
//				boolean dupli=false;
//				for(int j=0;j<i;j++) {
//					char cs=s.charAt(j);
//					if(ch==cs) {
//						dupli=true;
//					}
//				}
//				if(!dupli) {
//					result+=ch;
//				}
//			}
//			System.out.println(result);
//	}
//}
//*****Find frequency of characters******
//package base;
//
//public class string {
//
//	public static void main(String[] args) {
//		String s="sandhiyasam";
//		
//		for(int i=0;i<s.length();i++) {
//			int count=0;
//			char C=s.charAt(i);
//			for(int j=0;j<s.length();j++) {
//				char C2=s.charAt(j); 
//				if(C==C2) {
//					count++;
//				}
//			}
//			boolean freq=false;
//			for(int k=0;k<i;k++) {
//				if(s.charAt(k)==C) {
//				freq=true;
//				break;
//			}
//			}
//		
//		 if(!freq){
//			System.out.println("freq of "+C +":"+count);
//		}}
//		
//	}
//}
//********First non-repeating character*******
//package base;
//
//public class string {
//
//	public static void main(String[] args) {
//		String s="sskkbrryj";
//		
//		for(int i=0;i<s.length();i++) {
//			char c=s.charAt(i);
//			boolean yes=true;
//			for(int j=0;j<s.length();j++) {
//				char c2=s.charAt(j);
//				
//				if(i!=j && c==c2) {
//					yes=false;
//					break;
//				}
//			}if(yes) {
//				System.out.println(c);
//				break;/*becoz of 1st non repeating char ...if just repeating char mean dont add break*/
//			}
//		}
//}
//	}
//*******count substring occurence********
//package base;
//
//public class string {
//
//	public static void main(String[] args) {
//		String s="sansansanthisansansansansan";
//		int count=0;
//		String sub = "san";
//		for(int i=0;i<=s.length()-sub.length();i++) {
//			if(s.substring(i,i+sub.length()).equals(sub)){
//				count++;
//			}
//		}
//		System.out.println(count);
//		}
//	
//		}
//********TOGGLE CASE***(Example Input : "JaVa" Output: "jAvA")
//package base;
//
//public class string {
//
//	public static void main(String[] args) {
//		String s="SANDkaviYOGAbadriSAMBz";	
//		String res="";
//		for(int i=0;i<s.length();i++) {
//			char ch=s.charAt(i);
//			if(ch>='a' && ch<='z') {
//				ch= (char)(ch -32 );	
//			}
//			else if(ch>='A' && ch<='Z') {
//				ch=(char)(ch + 32);
//			}
//			res+=ch;
//		}
//		System.out.println(res);
//}
//}
