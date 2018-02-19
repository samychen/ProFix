package com.samychen.gracefulwrapper.profix;
import com.samychen.gracefulwrapper.profix.annotation.MethodReplace;

public class Calculate {
    @MethodReplace(clazz = "com.samychen.gracefulwrapper.profix.Calculate", method = "calculateResult")
    public int calculateResult(){
        int i = 0;
        int j = 10;
        return j / i;
    }

}
