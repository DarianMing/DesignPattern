package pattern.adapter.interpreter;

public class Minus implements Express {
    @Override
    public int interpre(Context context) {
        return context.getNum1() - context.getNum2();
    }
}
