/**
   Everything for "elements"  and "visitors" is now  set-up.  When the
   client needs an  operation to be performed, he  creates an instance
   of the  Vistor object,  calls the `accept'  method on  each Element
   object, and passes the Visitor object.

   The  `accept' method  causes flow  of control  to find  the correct
   Element subclass.  Then when the `visit' method is invoked, flow of
   control  is vectored  to  the correct  Visitor subclass.

   DOUBLE  DISPATCH: `accept'  dispatch plus  `visit' dispatch  equals
   double dispatch.
 */

public class ElementDemo {
    public static void main(String args[]) {

	Element e1 = new ElementOne();
	Element e2 = new ElementTwo();
	Element e3 = new ElementThree();
	Element e4 = new ElementFour();

	Visitor v1 = new VisitorOne();
	Visitor v2 = new VisitorTwo();

	e1.accept(v1);
	e2.accept(v1);
	e3.accept(v1);
	e4.accept(v1);

	System.out.println();

	e1.accept(v2);
	e2.accept(v2);
	e3.accept(v2);
	e4.accept(v2);
    }
}
