


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
       
        int h=0;
       
        for(int j=0;j<7;j++)
                {  
                    ob[j]=new Card();
                   
                    store[j]=ob[j].randomCard();
                               
                      if(ob[j].getValue()==luckyCard.getValue())
                          
                           {
                              if(ob[j].getSuit()==luckyCard.getSuit())
                                 {
                                   h=0;
                                    
                                 }
                         else
                              { 
                                  
                                   h=1;
                              }
                           
                           }
                             
                           else
                                h=1;
                         
                   }
          if(h==1)
             { 
                 System.out.println("Card not found!");
             }
        
             
               else
          
               System.out.println("The card is in the lucky deck!!!");
                    
                
                } 
    }

    
     

     
        
        
    

