package com;

import org.junit.Assert;
import org.junit.Test;

public class ParenthesesTest {

    @Test
    public void isValidTrue() {
        Assert.assertTrue(Parentheses.isValid("()"));
        Assert.assertTrue(Parentheses.isValid("[]"));
        Assert.assertTrue(Parentheses.isValid("{}"));
        Assert.assertTrue(Parentheses.isValid("()[]{}"));
        Assert.assertTrue(Parentheses.isValid("[(){}]"));
        Assert.assertTrue(Parentheses.isValid("[(){[()()]}]{()[{}]}()"));
    }

    @Test
    public void isValidFalse() {
        Assert.assertFalse(Parentheses.isValid(null));
        Assert.assertFalse(Parentheses.isValid(""));
        Assert.assertFalse(Parentheses.isValid("(]"));
        Assert.assertFalse(Parentheses.isValid("([)]"));
        Assert.assertFalse(Parentheses.isValid("][][]"));
        Assert.assertFalse(Parentheses.isValid("{{{"));
    }

}
