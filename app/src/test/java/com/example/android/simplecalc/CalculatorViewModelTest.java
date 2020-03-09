package com.example.android.simplecalc;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class CalculatorViewModelTest {

    @Test
    public void computeAdd() {
        CalculatorViewModel cvm = new CalculatorViewModel();

        cvm.setOperandOne("5");
        cvm.setOperandTwo("7");
        String res = cvm.compute(Calculator.Operator.ADD);

        assertThat(res, is("12.0"));
    }

    @Test
    public void computeSub() {
        CalculatorViewModel cvm = new CalculatorViewModel();

        cvm.setOperandOne("10");
        cvm.setOperandTwo("7");
        String res = cvm.compute(Calculator.Operator.SUB);

        assertThat(res, is("3.0"));
    }
    @Test
    public void computeMul() {
        CalculatorViewModel cvm = new CalculatorViewModel();

        cvm.setOperandOne("5");
        cvm.setOperandTwo("7");
        String res = cvm.compute(Calculator.Operator.MUL);

        assertThat(res, is("35.0"));
    }
    @Test
    public void computeDiv() {
        CalculatorViewModel cvm = new CalculatorViewModel();

        cvm.setOperandOne("12");
        cvm.setOperandTwo("6");
        String res = cvm.compute(Calculator.Operator.DIV);

        assertThat(res, is("2.0"));
    }
}