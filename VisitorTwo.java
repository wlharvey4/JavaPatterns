public class VisitorTwo extends Visitor {

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
