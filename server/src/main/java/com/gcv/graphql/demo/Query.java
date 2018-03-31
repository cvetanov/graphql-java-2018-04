package com.gcv.graphql.demo;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Component;

@Component
public class Query implements GraphQLQueryResolver {

    public POJO h() {
        POJO pojo = new POJO();
        pojo.setHello("hello");
        return pojo;
    }

}
