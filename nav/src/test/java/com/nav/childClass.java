package com.nav;

public class childClass extends parentClass {

    @Override
    public void methodA() {
        System.out.println("Child: methodA (overridden)");
    }

    @Override
    public void methodB() {
        System.out.println("Child: methodB (overridden)");
    }

    @Override
    public void methodC() {
        System.out.println("Child: methodC (overridden)");
    }

    @Override
    public void methodD() {
        System.out.println("Child: methodD (overridden)");
    }

    public void childUnique1() {
        System.out.println("Child: unique method 1");
    }

    public void childUnique2() {
        System.out.println("Child: unique method 2");
    }
    
    


}
