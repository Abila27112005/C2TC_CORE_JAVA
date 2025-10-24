package com.tnsif.Day4.secondpackage;

public class Base {
    int varDefault = 10;         // default access
    public int varPublic = 20;   // public access
    private int varPrivate = 30; // private access
    protected int varProtected = 40; // protected access

    void methodDefault() {
        System.out.println("Default access Base class");
        System.out.println("Default Variable : " + varDefault);
    }

    public void methodPublic() {
        System.out.println("Public access Base class");
        System.out.println("Public Variable : " + varPublic);
    }

    private void methodPrivate() {
        System.out.println("Private access Base class");
        System.out.println("Private Variable : " + varPrivate);
    }

    protected void methodProtected() {
        System.out.println("Protected access Base class");
        System.out.println("Protected Variable : " + varProtected);
    }
}
