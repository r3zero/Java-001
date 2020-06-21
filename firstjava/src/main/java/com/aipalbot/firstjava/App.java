package com.aipalbot.firstjava;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello welcome to my first java programming!" );
       /*I am now a professional programmer*/
boolean areyoucoming = true;
boolean amNotComing = false;

//calculate the price of 3 items @ 7 dollars each//
int totalPrice;
int quantity = 3;
int costPerItem = 7;
int discountCheck = 17;

totalPrice = costPerItem * quantity;

if(totalPrice > discountCheck)

{
	int newTotalPrice = totalPrice;
	totalPrice = totalPrice - costPerItem;
	
}
	System.out.println("discountPrice :" + totalPrice );
	

	
			//Assignment
			/*
			 * calculate the price of 8 item at 3 dollars
			 * subtract the cost of 2 items from the total price.
			 * if total price is more than 20
			 * display the amount to be paid after discount*/
		
		int costPerItem1 = 3;
		int itemQuantity1 = 8;
		int totalPrice1;
		int discount=0;
		
		
		
		totalPrice1=costPerItem1*itemQuantity1;
	
if(totalPrice1 > 20)
{
	discount=totalPrice1-(2*costPerItem1);
}


	System.out.println("(discountPrice :" +discount );
	
}
		
		
		
			
			
			
			
			
			
			
			

        
	}

