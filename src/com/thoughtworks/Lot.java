package com.thoughtworks;


import java.util.ArrayList;
import java.util.List;

public class Lot {
    //domain term,在OO建模的时候使用这些词,代码向业务语言靠齐
    //核心概念
    //名词
    //parkingLot
    //Vehical
    //Ticket
    //rooms/space
    //动词
    //park
    //take

    //isFull方法来返回停车场状态,这个和抛异常其实没有区别,是API 风格的不一样,要么都是异常要么都是空

    private final int parkingLotSize;
    List<Car> carsInLot = new ArrayList<>();


    public Lot(int i) {
        this.parkingLotSize = i;
    }

    public String parking(Car car) {
        //一个参数表达两个含义
        if (carsInLot.size() == parkingLotSize) {
            return "failed to parking";
        }
        carsInLot.add(car);
        return "success to parking";
    }

    public String getCar(Car car) {
        //以car取car很奇怪
        if (carsInLot.contains(car)) {
            carsInLot.remove(car);
            return "success to get car";
        }
        return "failed to get car";
    }
}
