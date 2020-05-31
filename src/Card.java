/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
/**
 *
 * import java.@author test
 */

public class Card {
    Random rg= new Random();
     
   
    private String suit;
    //Hearts,Spades,Diamonds,Clubs
      

        private String value;
        
        public Card()
        {
            
        }
                
        
        public Card(String givenSuit,String givenValue)
        {
            suit=givenSuit;
            value=givenValue;
        }
    public String getSuit() {
        return suit;
    }
    
    

    public void setSuit(String suit) {
        if(suit.equals("Hearts")||suit.equals("Spades")||suit.equals("Diamonds")||suit.equals("Clubs"))
        {
        this.suit = suit;
        }
        else
        {
            System.out.println("Not valid Suit");
        }
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        
        
    
        
            this.value = value;
        
    }
    public Card randomCard()
        {
            String r=randomRank();
            String s=randomSuit();
            return (new Card(r,s));
                 
        }
       public String randomRank()
       {
           String rank;
           int r= 1+ rg.nextInt(13);
           switch(r)
           {
               case 1:
                   rank="Ace";
                   break;
               case 2:
                   rank="Two";
                   break;
               case 3:
                   rank="Three";
                   break;
               case 4:
                   rank="Four";
                   break;
               case 5:
                   rank="five";
                   break;
               case 6:
                   rank="Six";
                   break;
               case 7:
                   rank="seven";
                   break;
               case 8:
                   rank="eight";
                   break;
               case 9:
                   rank="Nine";
                   break;
               case 10:
                   rank = "ten";
                   break;
               case 11:
                   rank="jack";
                   break;
               case 12:
                   rank="queen";
                   break;
               default:
                   rank="king";
                   break;
           }
           return rank;
       }
       
       public String randomSuit()
       {  String s=" ";
             int r=rg.nextInt(4)+1;
             switch (r)
             {
                 case 1:
                     s="Spades";
                     break;
                 case 2:
                     s="Hearts";
                     break;
                 case 3:
                     s="Diamonds";
                     break;
                 case 4:
                     s="Clubs";
                     break;
                 default:
                     System.out.println("error!");
             }
           return s;
}
   
      
      
     @Override
       public String toString()
               
       {
           return (value +" "+ suit);
       }
     
    
  
} 


