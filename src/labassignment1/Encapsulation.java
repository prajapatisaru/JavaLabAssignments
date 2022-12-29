package labassignment1;
class Encap{  
	private String text;   
	public String getName(){  
		return text;  
	}   
	public void setName(String text){  
		this.text=text;  
	}  
public class Encapsulation {
			    public static void main(String[] args) {
			         Encap ex =  new Encap();
			 		ex.setName("Encapsulation Demo");
			 		System.out.println(ex.getName());
			    }
			   
			    }  
	}

