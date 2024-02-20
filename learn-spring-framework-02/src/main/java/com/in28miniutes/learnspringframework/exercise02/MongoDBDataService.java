package com.in28miniutes.learnspringframework.exercise02;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

//@Component
@Repository
public class MongoDBDataService implements DataService {
    @Override
    public int[] retrieveData() {
        return new int[] {11,22,33,44,55};
    }
}
