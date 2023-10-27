package StringBufferBuilder;

public class StringBufferDemo {

	public static void main(String[] args) {
		
				StringBuffer sb1= new StringBuffer(5);
				System.out.println(sb1.capacity());
				
//				StringBuffer sb2= new StringBuffer("Hello");
//				System.out.println(sb2.capacity());
//				
//				StringBuffer sb3= new StringBuffer();
//				System.out.println(sb3.capacity());
//				
				//+, concat
				
				// append
				
				 String s1="Java";
				 s1.concat("Programs");
				 
				 System.out.println(s1);
				 // s1= s1.concat("Programs")
				
				sb1.append("Hello");
						
				System.out.println(sb1);
				
				System.out.println("Capacity:"+sb1.capacity());
				
				sb1.append("World");
		        System.out.println(sb1);
				
				System.out.println("Capacity:"+sb1.capacity());  // (oldcap*2)+2
				
				String s2="HelloWorld";
				String s3="HelloWorld";
				
				
			}

		}

	
