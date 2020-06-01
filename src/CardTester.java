


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
        Card luckyCard=new Card("Ace","Spades");
       
       
        for(int j=0;j<7;j++)
                {   ob[j]=new Card();
                    store[j]=ob[j].randomCard();
                               
                      if(ob[j].getValue()==luckyCard.getValue())
                         {
                              if(ob[j].getSuit()==luckyCard.getSuit())
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
    
     

     
        
        
    

