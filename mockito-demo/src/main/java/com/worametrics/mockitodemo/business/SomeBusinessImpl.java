package com.worametrics.mockitodemo.business;

public class SomeBusinessImpl {

    public SomeBusinessImpl(DataService dataService) {
        this.dataService = dataService;
    }

    private DataService dataService;

    public int findGreatestAmountFromAllData(){
        int[] data = dataService.retrieveAllData();
        int greatestValue = Integer.MIN_VALUE;
        for (int value : data){
            if (value > greatestValue){
                greatestValue = value;
            }
        }
        return greatestValue;
    }
}

interface DataService{
    int[] retrieveAllData();
}