package com.coding.game;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import com.coding.game.javastack.JavaStack;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class JavaStackTest {
    @Parameters(name = "({index}): isBalanced({0})={1}")
    public static Collection data(){
        return Arrays.asList(new Object[][]{
            {"",true},
            {"({}[])",true},
            {"(({()})))",false},
            {"({(){}()})()({(){}()})(){()}",true},
            {"{}()))(()()({}}{}",false},
            {"}}}}",false},
            {"))))",false},
            {"{{{",false},
            {"(((",false},
            {"[]{}(){()}((())){{{}}}{()()}{{}{}}",true},
            {"[[]][][]",true},
            {"}{",false}
        });
    }

    @Parameter(value = 0)
    public String input;

    @Parameter(value = 1)
    public boolean expected;
    
    @Test
    public void isBalanced(){
        assertEquals(expected, JavaStack.isBalanced(input));
    }
    
}