package com.in28miniutes.learnspringframework.exercise02;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

//@Component
@Repository
@Primary
public class MySqlDataService implements DataService {
    @Override
    public int[] retrieveData() {
        return new int[] {1,2,3,4,5};
    }
}
