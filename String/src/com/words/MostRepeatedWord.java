package com.words;

public class MostRepeatedWord {
	
	static void findFrequency(String st)
	{
		String starr[]= st.split("\\s");
		
		int maxCount=0;
		String word="";
		
		int count;
		for(int i=0;i<starr.length;i++)
		{
			if(starr[i].equals("Visited"))
				continue;
			count=1;
			
			for(int j=i+1;j<starr.length;j++)
			{
				if(starr[i].equalsIgnoreCase(starr[j]))
				{
					count++;
					starr[j]="Visited";
				}
			
			}
			
			//System.out.println(starr[i]+"  -->"+count);
			
			if(count>maxCount)
			{
				maxCount=count;
				word=starr[i];
			}
						
		}
		
		System.out.println("Most repeated word:"+word);
		
	}

	public static void main(String[] args) {
		
      String str="I love my India beacuse India is my country and my country is great";
      
      findFrequency(str);
      
       
    		   
	}
	
}
