package com.worametrics.mockitodemo.business;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SomeBusinessImplTest {

    @Test
    void test(){
        DataServiceStub dataServiceStub = new DataServiceStub();
        SomeBusinessImpl someBusiness = new SomeBusinessImpl(dataServiceStub);
        int amount = someBusiness.findGreatestAmountFromAllData();
        assertEquals(25,amount);
    }
}

class DataServiceStub implements DataService{

    @Override
    public int[] retrieveAllData() {
        return new  int[] {25,15,5};
    }
}
