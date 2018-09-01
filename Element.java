/**
   Add a single pure virtual `accept'  method to the base class of the
   Element  hierarchy.   `accept'  is  defined  to  receive  a  single
   argument - a pointer or reference to the abstract base class of the
   Visitor hierarchy.

   Each concrete derived class of the Element hierarchy implements the
   `accept'  method  by  simply  calling the  `visit'  method  on  the
   concrete  derived instance  of the  Visitor hierarchy  that it  was
   passed, passing its "this" pointer as the sole argument.

   The implementation  of `accept'  in each  Element derived  class is
   always the  same.  But  – it  cannot be moved  to the  Element base
   class and inherited  by all derived classes because  a reference to
   `this'  in  the  Element  class   always  maps  to  the  base  type
   Element. [NOT TRUE:  If the abstract base class  Visitor includes a
   public  unimplemented `visit'  method then  the dispatch  will work
   from a concrete  public base class Element's  `accept' method where
   no `accept'  method is implemented  in any of the  concrete derived
   Element classes.]

 */

// abstract class Element {

//     abstract void accept(Visitor v);

//     public String toString() {
// 	return this.getClass().toString();
//     }

// }


public class Element {

    public void accept(Visitor v) {
	System.out.println("In " + this + " with " + v);
	v.visit(this);
    }

    public String toString() {
	return this.getClass().toString();
    }
}
