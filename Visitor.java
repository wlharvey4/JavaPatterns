/**
   The Visitor pattern represents an  operation to be performed on the
   elements of  an object  structure without  changing the  classes on
   which it operates.

   Create  a  Visitor class  hierarchy  that  defines a  pure  virtual
   `visit' method in the abstract base class for each concrete derived
   class in the aggregate node hierarchy.

   Each  `visit' method  accepts  a  single argument  -  a pointer  or
   reference to an original Element derived class.

   The Visitor pattern makes adding new operations (or utilities) easy
   - simply add a new Visitor derived class.

   But,  if the  subclasses in  the aggregate  node hierarchy  are not
   stable,  keeping   the  Visitor  subclasses  in   sync  requires  a
   prohibitive amount of effort.
 */

abstract class Visitor {

    // abstract void visit(ElementOne   e1);

    // abstract void visit(ElementTwo   e2);

    // abstract void visit(ElementThree e3);

    // abstract void visit(ElementFour  e4);

    public void visit(Element e) {}

    public String toString() {
	return this.getClass().toString();
    }
}
