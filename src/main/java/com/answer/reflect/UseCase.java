package com.answer.reflect;


import org.junit.Test;
import sun.security.krb5.internal.crypto.Des;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @descreption
 * @Author answer
 * @Date 2019/1/25 15 18
 */
public class UseCase {



    @Test
    public void testTarget() {
        List<Integer> useCases = new ArrayList<>(4);
        Collections.addAll(useCases, 47, 48, 49, 50);
        traceT(useCases, PasswordUtils.class);

    }

    private void traceT(List<Integer> useCase , Class<?> cl) {
        for (Method method : cl.getDeclaredMethods()) {
            Decription decription = method.getAnnotation(Decription.class);
            if (decription != null) {
                System.out.println("found use case " + decription.id() + " " + decription.description());
                useCase.remove(new Integer(decription.id()));
            }
        }
        for (int i : useCase) {
            System.out.println("warning:missing use case -" + i );
        }
    }

}
