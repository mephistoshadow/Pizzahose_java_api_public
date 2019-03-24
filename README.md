# a2-starter
pair programmed features:

Feature1:Submit a new order:
Driver:Siqi Yang
navigator:Yufei Yang


Feature2:Ask for the menu:
Driver:Yufei Yang
navigator:Siqi Yang


Should give a reflection on how it went, and what you liked and disliked about this process:
The process of the pair programming involves a lot of discussions and in-person meetings. We pick 3 days that are available for both of us to discuss the design pattern, how the overall structure if the project should be, and how we should start coding the project.


What we like about the process is that we found discussion will help us to solve many confusions from reading the assignment handout. We will ask/search on piazza when we feel confused and unsure.


Disliked about the process is that we spend a lot of time convincing each other about the design pattern, how to code the project, what is the type of the attributes, etc. We took a long time to communicate with each other what we have done and the input, output of functions.



How to use the API:
Using the main function, the user can achieve the following by typing Submit/update/cancel/delivery/Menu/Price:

1.Submit: submit a order, which allow user to order pizzas, drinks, and toppings please note here, we provide the instrction for user how to use it, follow the exact same instrction as provided.

2.update: update an order

3.cancel: cancel an order

4.delivery: delivery an order using different methods.

5.Menu: return the full menu.

6.Price: return the price of an item.

More instruction is typed in the main function. follow instructions that are printed out in the console.
The default menu and price is saved in a menu.json file, which can be changed later using functions in the menu class.

Tools: intellij

Design pattern:
1.Factory design pattern, we set three factories. Topping factory, drink factory and pizza factory. These factories are used to create different type of toppings/drinks/pizzas. By using this disgn pattern, we make our program more flexible, we can esaily add a new topping/drink/pizza and assign different property to them without making major changes in our code.

2.Builder design pattern, when we create the order, we silpt the process into serveral small parts to build an order. By using this design pattern, we can avoid long constructor and make our project more flexible.









