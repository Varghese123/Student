


/*
 * Modifier:Varghese Eldhose
 * Student no:991588959
 */
import java.util.*;
/**
 *
 * @author test
 */
public class CardTester 
{
   
    public static void main(String[] args)
    {    Card c1 = new Card();
         
         Card[] store=new Card[7];
        
        Card ob[]=new Card[7];
        
          Scanner i = new Scanner(System.in); 
        
          System.out.println("Enter a card Rank:");
      
           String a=i.next();
       
           System.out.println("Enter a card Suit:");
       
           String b=i.next();
       
       
        for(int j=0;j<7;j++)
                {   ob[j]=new Card();
                    store[j]=ob[j].randomCard();
                               
                      if(ob[j].getValue()==a)
                         {
                              if(ob[j].getSuit()==b)
                               {
                                   System.out.println("card found!!");
                             
                                }
                         else
                              { 
                                  System.out.println("not found");
                                
                              }
                          }
                    else
                    
                        { System.out.println("no luck!");
                           
                        }
                    
                
                } 
    }
}
    
     

     
        
        
    

