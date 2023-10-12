package ArrayofcontaimentMovie;

public class MainTheatre {


	
	
	public static void main(String[] args) {
		
		Movie m[]=new Movie[1];
		
		m[0]=new Movie(101,"rrr",4.5f);
		
		Theatre t1 []=new Theatre[3];
		
		t1[0]=new Theatre("pvr",300f,m[0]);
		t1[1]=new Theatre("cinepolis",250f,m[0]);
		t1[2]=new Theatre("inox",500f,m[0]);
		
        for(Theatre t:t1)
        {
            
        	System.out.println(t);
        }
		
	}

}
