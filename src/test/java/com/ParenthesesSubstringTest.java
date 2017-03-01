package com;

import org.junit.Test;

import org.junit.Assert;

public class ParenthesesSubstringTest {

    @Test
    public void invalidStrings() {
        Assert.assertEquals(0, ParenthesesSubstring.lengthOfLongestValid(""));
        Assert.assertEquals(0, ParenthesesSubstring.lengthOfLongestValid(null));
        Assert.assertEquals(0, ParenthesesSubstring.lengthOfLongestValid("("));
        Assert.assertEquals(0, ParenthesesSubstring.lengthOfLongestValid(")))))))"));
        Assert.assertEquals(0, ParenthesesSubstring.lengthOfLongestValid("(("));
    }

    @Test
    public void validSubstrings() {
        Assert.assertEquals(2, ParenthesesSubstring.lengthOfLongestValid("((()"));
        Assert.assertEquals(4, ParenthesesSubstring.lengthOfLongestValid(")()())"));
        Assert.assertEquals(6, ParenthesesSubstring.lengthOfLongestValid("()(()))))"));
    }

}
