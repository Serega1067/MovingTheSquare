# Interface.
## Task.
### Moving the square.
Create interactive graphical application in which we will use interfaces.

The task is to create an application that will use buttons to move 
a square across the screen.

There will be two buttons on the form - UP and DOWN, which will allow 
you to move the square up and down, respectively.

Let's write the code of a form that contains three components - two buttons 
for control and a panel that can draw a square with certain coordinates 
and can "listen" to events from buttons.

Listening skills are achieved very simply - our panel implements 
the ActionListener interface (this interface is described in the Swing 
library).

The component can listen to events from both buttons - it is registered 
as a listener for both.
