package com.gcv.graphql.types;

public class ComplexPOJO {

    private int complexity;
    private POJO pojo;

    public int getComplexity() {
        return complexity;
    }

    public void setComplexity(int complexity) {
        this.complexity = complexity;
    }

    public POJO getPojo() {
        return pojo;
    }

    public void setPojo(POJO pojo) {
        this.pojo = pojo;
    }
}
