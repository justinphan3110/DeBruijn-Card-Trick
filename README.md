# De Bruijn Card Trick

This project is call de Bruijn Card Trick which will create a "magic trick". You will arrange the the card deck in the order similiar to
the order in UsedDeck.txt file. Then you will ask the player to cut a deck in random position. Next you will take out the 6 simultaneous card
from the deck. 

You will then ask the player to tell you only the COLOR of this 6-card. Then you will enter Black as 0, Red as 1 in the input window in this
application. for example, if the 6 cards turn out to be RED-RED-BLACK-BLACK-RED-RED; you will enter 110011. The application will give you the
right card that the player is holding

![image](https://user-images.githubusercontent.com/44376091/49333565-05215880-f58f-11e8-9396-38fb0c3c851e.png)

Click enter you will get the result as

![image](https://user-images.githubusercontent.com/44376091/49333569-166a6500-f58f-11e8-932c-c07e81440743.png)




### Prerequisites

To modify my code, you only need basic knowledge of Java and Data Structures(Lists, HashMap, and I/O) and JavaFX ( in this code, the graphics were made mainly from JavaFX Dialog)

### Installing

To start the program, there is 3 ways:
1. Run the DeBruijnCardTrick.jar
2. Run the DeBruijnCardTrick.exe (prefered)
3. download the class CustomVoting and Candidate (remember to modify the package) and run it in a new project in IDE.

You should see a new window pops up


![image](https://user-images.githubusercontent.com/44376091/49334707-53902080-f5aa-11e8-840d-d88a2d69eb13.png)



### Code

  I generate a arbitary sequence included only Binary Number (0 and 1) base on de Bruijn's to create uniques sequence of 2 consisted only
  1 or 0. You can use a program online at
  [de Bruijn arbitrary sequences](http://www.hakank.org/comb/debruijn_arb.cgi)
  
  In which you will type in the N as 52 as there are 52 cards in the deck and 2 as the Base
  
  ![image](https://user-images.githubusercontent.com/44376091/49333624-f6877100-f58f-11e8-924c-8838d195d3a8.png)


  We will use this sequence to predict the specific cards (in this case will be go in set of 6) only base on the color
  
  
  To do so, we will have a specific Card.java class to assign 52 cards
  
  ![image](https://user-images.githubusercontent.com/44376091/49333639-46fece80-f590-11e8-821c-8fbb707e982f.png)


  Then you can set the up 52-cards Deck in the DeBruijnCardTrick.java class
  
  ![image](https://user-images.githubusercontent.com/44376091/49333642-6b5aab00-f590-11e8-8dfc-8c97c8a34c3d.png)

  
  We will initilize the sequence we will use first:
  
  ![image](https://user-images.githubusercontent.com/44376091/49333676-37cc5080-f591-11e8-812a-205480c7dc8a.png)

  
  In this cased I will set up the orginal Deck which consisted of the full 52-cards in order first and then I will assign the 
  separated usedCard List for the game which only add elements from the Original List
  
  ![image](https://user-images.githubusercontent.com/44376091/49333647-99d88600-f590-11e8-843a-c99d83b294d8.png)


Note: You can use I/O java for the usedCard List instead of initialize the whole list again

 I will then set up a LinkedHashMap (which is better than HaspMap in this case because it will print the elements in insertion order - 
 FIFO). The LinkedHashMap will included the key as the 47 6-element-substrings we get from the de Bruijn arbitrary sequence
 and the value as the 6-cards each substring will hold.
 
 ![image](https://user-images.githubusercontent.com/44376091/49333671-110e1a00-f591-11e8-8fbc-a5dc2a25bcd6.png)


  Finally, when put in the answer in the DialogBox, we will check (using Lambda Expression) in each of the .keyset of our LinkedHashMap -cardMap-
  
  ![image](https://user-images.githubusercontent.com/44376091/49333710-98f42400-f591-11e8-8b36-51cf67d3c436.png)

## Built With
* [De Bruijn sequence](https://en.wikipedia.org/wiki/De_Bruijn_sequence)
* [de Bruijn arbitrary sequences](http://www.hakank.org/comb/debruijn_arb.cgi)
* [LinkedHashMap](https://docs.oracle.com/javase/8/docs/api/java/util/LinkedHashMap.html)
* [Lambda Expression](https://docs.oracle.com/javase/tutorial/java/javaOO/lambdaexpressions.html)
* [JavaFX](https://docs.oracle.com/javase/8/javafx/get-started-tutorial/jfx-overview.htm)
* [JavaFX Dialog](https://docs.oracle.com/javase/8/javafx/api/javafx/scene/control/Dialog.html)

## Contributing
  my roomate - Ashwin- for the idea and the math on the problem

##Author
  Long Phan 
