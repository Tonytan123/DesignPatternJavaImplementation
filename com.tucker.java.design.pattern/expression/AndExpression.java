package expression;

/**
 * @author tonyc
 */
public class AndExpression implements Expression{
    Expression expressionOne;
    Expression expressionTwo;

    AndExpression(Expression expressionOne, Expression expressionTwo) {
        this.expressionOne = expressionOne;
        this.expressionTwo = expressionTwo;
    }

    @Override
    public boolean interpret(String name) {
        return expressionOne.interpret(name) && expressionTwo.interpret(name);
    }
}
