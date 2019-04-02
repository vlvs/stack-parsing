package com.company;

class Parsing {

    void printExpressionCheck(String algebraicExpression) {
        if (expressionCheck(algebraicExpression)) {
            System.out.println(algebraicExpression + " => Valid");
        } else {
            System.out.println(algebraicExpression + " => Invalid");
        }
    }

    private boolean expressionCheck(String algebraicExpression) {
        Stack expressionCheck = new Stack();
        expressionCheck.createStack(algebraicExpression.length());
        for (int i=0;i<algebraicExpression.length();i++) {
            char charAtIndex = algebraicExpression.charAt(i);
            if (charAtIndex == '(' || charAtIndex == '[' || charAtIndex == '{') {
                expressionCheck.addToStack(charAtIndex);
            }
            if ((charAtIndex == ')' || charAtIndex == ']' || charAtIndex == '}' ) && !expressionCheck.isStackEmpty()) {
                char charAtTop = expressionCheck.getStackTop();
                if ((charAtIndex == ')' && charAtTop == '(') || (charAtIndex == ']' && charAtTop == '[')
                        || (charAtIndex == '}' && charAtTop == '{')) {
                    expressionCheck.removeFromStack();
                }
            }
        }
        return expressionCheck.isStackEmpty();
    }
}
