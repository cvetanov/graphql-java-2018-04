package com.gcv.graphql.demo;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Component;

@Component
public class Query implements GraphQLQueryResolver {

    public POJO simple() {
        POJO pojo = new POJO();
        pojo.setField1("field1");
        pojo.setField2("field2");
        return pojo;
    }

    public ComplexPOJO complex() {
        ComplexPOJO complexPOJO = new ComplexPOJO();
        complexPOJO.setPojo(simple());
        complexPOJO.setComplexity(1);
        return complexPOJO;
    }

}
