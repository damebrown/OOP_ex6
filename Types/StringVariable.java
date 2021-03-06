package oop.ex6.Types;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * the class represents a String variable
 */
class StringVariable extends Variable {

    private final static Pattern VALIDITY_PATTERN = Pattern.compile("[\\\"\\\'].*[\\\"\\\']");

    /**
     * @param variableString the variable declaration line
     * @param isGlobal       turned on in case it is global
     * @param isFinal        turned on in case it is final
     * @throws IllegalTypeException in case of wrong variable instanceiation
     */
    StringVariable(String variableString, boolean isGlobal, boolean isFinal) throws IllegalTypeException {
        super(variableString, isGlobal, isFinal);
        type = "String";
    }


    @Override
    /*
    checks for this class's type's variable's validity
     */
    public boolean isValid(String value) {
        Matcher stringMatcher = VALIDITY_PATTERN.matcher(value);
        return stringMatcher.matches();
    }

}
