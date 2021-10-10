#Make Change Project

## Description
This is my very first Java project.  I've created a cash register that accepts exact change and informs the customer if they did not provide enough money for their purchase.  The cash register also provides change back if the customer provided more money than the total cost of their items.  

## How it Works
My main method uses the scanner to get input from the customer to establish the cost of the item and the amount of money they are using to complete the purchase.  If the customer provides the exact amount of the purchase price the sequence ends.  If they do not provide enough money to complete the purchase they receive an error.  

When the customer provides too much money they will receive change back.  When change is due back to the customer I wanted to call on another method that encompasses the mathematical equation that determines how much change the customer gets back.  The equations also ensures the customer receives their change back in the highest denomination of bills and coins possible.  The math is based on the amount of pennies in each respective dollar and coin amount.  

## What I Learned
I learned that calling on myMethod from main required required me to first establish the exact change due and then push that amount down to myMethod.  Initially, I did not do this which caused my change equations to be useless. They were not receiving the exactChange input from main which is my baseline for computing the denominations that are returned back to the customer.

## Technologies Used
Java, Eclipse, Git, terminal, atom.
