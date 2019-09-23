
public class User 
{ 
	
	 String firstName; 
     String lastName; 
	 int age; 
	 int salary; 
    
    setAge(21);
   isValidAge(age);
    fullName("Srinu","Egiripoina");

	/* Ensure age cannot be less than 0 or greater than 100.
Add a isValidAge method to check that employee age is between 18 to 60.
Add a getFullName to return the full name of the person. */
	public int getAge() 
	{ 
	return geekAge; 
	} 

	
	public String getName() 
	{ 
	return geekName; 
	} 
	
	
	public int getRoll() 
	{ 
	return geekRoll; 
	} 

	
	public void setAge( int newAge) 
	{ 
    if(newAge>=0 && newAge<=100){ 
	age = newAge; 
    }
    else{System.out.print("Age out of bounds \n");}
	} 

    public void isValidAge( int newAge) 
	{ 
    if(age>=18 && age<=60){ 
	System.out.println("Valid age"); 
    }
    else{System.out.print("Not a Valid Age");}
	} 

	
	public void fullName(String firstName, String lastName) 
	{ 
	System.out.println("Full name is: "+ firstName + " " + lastName);
	} 
	
	 
	
} 
