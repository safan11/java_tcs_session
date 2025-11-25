package com.tcs.transaction;

enum Size {
    S("Small"),
    M("Medium"),
    L("Large"),
    XL("Extra Large"),
    XXL("Double Extra Large");

    private final String label;

    // Constructor
    Size(String label) {
        this.label = label;
    }

    // Getter method
    public String getLabel() {
        return label;
    }
}

public class SizeExample {
    public static void main(String[] args) {
        Size size = Size.XL;

        System.out.println("Size Code: " + size);
        System.out.println("Label: " + size.getLabel());
    }
}
