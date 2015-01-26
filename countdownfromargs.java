public class countdownfromargs{
     public static void main(String[] args){
	 try{
	 int max=Integer.parseInt(args[0]);
	      if(max>0){
		  for(int i=max;i>=0;i--){
		       System.out.printf(i+ " ");
		     }
			 }else{
			 System.out.println("please enter a positive number");
			 }
	 }
			  catch(ArrayIndexOutOfBoundsException e){
		            System.out.println("no argument provided");
		      }
		      catch(NumberFormatException e2){
		         System.out.println("please only insert integers");
		      }
	 
	 }
}
