/**
   Each operation to be supported  is modelled with a concrete derived
   class of  the Visitor hierarchy.   The `visit' methods  declared in
   the Visitor base class are now  defined in each derived subclass by
   allocating  the  "type  query  and   cast"  code  in  the  original
   implementation to the appropriate overloaded visit method.

   VisitorOne, VisitorTwo,  etc., represent distinct operations  to be
   performed on each of the Element subclasses.
 */

public class VisitorOne extends Visitor {

    public void visit(ElementOne e1) {
	System.out.println(e1 + " is visiting " + this);
    }

    public void visit(ElementTwo e2) {
	System.out.println(e2 + " is visiting " + this);
    }

    public void visit(ElementThree e3) {
	System.out.println(e3 + " is visiting " + this);
    }

    public void visit(ElementFour e4) {
	System.out.println(e4 + " is visiting " + this);
    }

}
