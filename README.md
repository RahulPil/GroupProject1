# GroupProject1

<p>In your textbook, Building Java Programs, 5th Edition, on page 720 of Chapter 10, 
please do Programming Project #1.</p>

<p>Write classes to model a shopping list. 
Make an Item class that represents a grocery item’s name and price, such as tissues for $3. 
Also implement an ItemOrder class that represents a shopper’s desire to purchase a given item
in a given quantity, such as five boxes of tissues. You might wish to implement 
bulk-discounted items, such as two boxes of tissues for $4, which would bring the cost 
of the given item order of 2+2+1</p>

<p>While it is not explicitly specified in the project specification found in the text, 
the user interaction component of this project must be able to support as many 
interactions from a user as s/he wishes; each successive interaction must be prompted, 
with the prompt including the sentinel for input when the user is ready to quit. 
To provide a realistic vision for this project, think about your own 
shopping experience on, say, Amazon, or eBay. Keep in mind the entities with which you 
interact, and the pattern of successive interactions in that environment. This is what 
your application should feel like.</p>

####Summary
1. Create an ItemOrder class that shows how many of each item is being purchased
2. Create an Item class that implements bulk discounts
3. Create a Client class that prompts for user input, looping until exited by user