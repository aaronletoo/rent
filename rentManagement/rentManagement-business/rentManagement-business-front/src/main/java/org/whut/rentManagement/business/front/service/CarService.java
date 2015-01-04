package org.whut.rentManagement.business.front.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.whut.rentManagement.business.front.entity.Car;
import org.whut.rentManagement.business.front.mapper.CarMapper;

import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: Aaron
 * Date: 14-12-30
 * Time: 下午8:39
 * To change this template use File | Settings | File Templates.
 */
public class CarService {
    @Autowired
    CarMapper carMapper;
    public void add(Car car){
        carMapper.add(car);
    }

    public int delete(Car car){
        return carMapper.delete(car);
    }

    public int update(Car car){
        return carMapper.update(car);
    }
    public List<Map<String,String>> getListByAppId(long appId) {
        return carMapper.getListByAppId(appId);
    }

}
