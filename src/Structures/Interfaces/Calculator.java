package Structures.Interfaces;

import Exceptions.MalformedExpressionException;

public interface Calculator {
    int getResult() throws MalformedExpressionException;
}
