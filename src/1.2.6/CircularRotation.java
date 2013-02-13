
public class CircularRotation {

	public  boolean circular(String t,String s){
		for(int i=0;i<t.length();i++){
			String tmp =t.substring(0, i);
			if( s.indexOf(tmp)!= -1)
			{
				if(s.equals( t.substring(i,t.length())+tmp  ))
					return true;
										
			}
		}
		return false;
	}
}
