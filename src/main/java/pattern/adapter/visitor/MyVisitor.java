package pattern.adapter.visitor;

public class MyVisitor implements Visitor{

    @Override
    public void visit(Subject subject) {
        System.out.println("visit the subject " + subject.getSubject());
    }
}
