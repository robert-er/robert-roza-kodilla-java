package com.kodilla;

public class FirstClass {

    private String className;

    public FirstClass(String className) {
        this.className = className;
    }

    public String getClassName() {
        return className;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public FirstClass() {
    }

    @Override
    public String toString() {
        return "FirstClass{}";
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }


}
