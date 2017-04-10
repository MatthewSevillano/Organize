import java.util.*;
public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner in=new Scanner (System.in);
	//ask user for a number
	System.out.println("How many people are there");
	int amount=in.nextInt();
	String[] values= new String[amount];
	for (int x=0;x<values.length;x++){
	System.out.println("Enter name "+(x+1));
	values[x]=in.next();
	}
	Arrays.sort(values);
	System.out.println("your first name is "+values[values.length-2]);
	System.out.println("your last name is "+values[values.length-1]);
}

}

