package dayOne;

public class HW {

	public static void main(String[] args) {
      // TODO Auto-generated method stub
		
		System.out.println("Hello World");
		
		//STRINGS
	
		//Create a string variable called fName and set it to your first name
	       String fName = "Eva";
	       System.out.println(fName); 
	       
		//Create a int variable that stores the length of fname variable (use methods)
	       String fname = "Eva";
	     System.out.println("The length of the fname string is: " + fname.length());
	       
	    //Create a string variable called lName and set it to your last name
	       String lName = "Sikder";
	       System.out.println(lName);

	   //Create a string variable called fullName and set it to fName concatenated and lName
	       String fNAme = "Eva";
	       String lNAme = "Sikder";
	       System.out.println(fNAme + " " + lNAme);
	       
	   //print fullName variable
	       String fullName = "Eva Sikder";
	       System.out.println(fullName);
	       
	  //print fullName variable but use a string method to set it to all upper case
	       String FULLNAME = "Eva Sikder";
	       System.out.println(FULLNAME.toUpperCase());
	       
	  //print the 3rd index of fullName (you'll need to use charAt() method)
	       String myStr = "Eva Sikder";
	       char result = myStr.charAt(3);
	       System.out.println(result);
	       
	  //create a string and set it to " There are spaces in this sentences. "
	       String txt = "There are spaces in this sentence";
	       System.out.println(txt);
	    	      
	 //what method can we use to print the sentence without white spaces? 
	       String MyStr = "     the sentence without white spaces    ";
	       System.out.println(MyStr);
	       System.out.println(MyStr.trim());
	       
	       
	       //INTEGERS AND MATH
	       
	 //create an integer variable and set it to your age (give your own names moving forward).
	       int myAge = 28;
	       System.out.println(myAge);
	       
	 /*create an if/else statement that prints "My age is over 25" if your age is over 25 or print
	   My age is less than 25" if it is less than 25.*/
	       int age = 28;
	       if (age > 25) {
	    	   System.out.println("My age is over 25 ");
	       }
	       else {
	    	   System.out.println("My age is less than 25");
	       }

	    
	 //create an integer variable that stores your age multiplied by 2.
	       int AGe = 28; 
	       int Result = AGe*2;
	       System.out.println (Result);
	      
	       
	// Create an integer variable that is your age subtracted by 5.
	       int AGE = 28;
	       int sub = AGE-5;
	       System.out.println(sub);
	       
	//print the remainder (modulo) between 15 divided by 6.
	       int x = 15;
	       int y = 6;
	       System.out.println(15 % 6);
	     
	//print the following line "we're all in this." (how can we handle special characters in strings?)
	       String special = "we\'re all in this";
	       System.out.println(special);
	    	   
	//store the value of 13 + 12.56 as a variable.
	       int x1 = 13;
	       float y2 = 12.56f;	   
	       System.out.println(x1 + y2);
	
   //how can we generate a random number between 0 and 1?
	      	   int randomNum = (int) (Math.random() * 1);
	       System.out.println(Math.random());
	       
	       
	       
		
	}
	
	
	public static void evaNme() {
		
		System.out.println( "BLAH BLAH BLAH!!!" );
		
	}
	
}
			
