package com.company;

import sun.jvm.hotspot.oops.OopUtilities;

public class Main {

    public static void main(String[] args) {
        OuterClass.NestedStaticClass instanceNestStaticClass = new OuterClass.NestedStaticClass();
        instanceNestStaticClass.printMsg();
    }
}
