package org.whut.rentManagement.business.front.mapper;

import org.whut.platform.fundamental.orm.mapper.AbstractMapper;
import org.whut.rentManagement.business.front.entity.Car;

import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: Aaron
 * Date: 14-12-30
 * Time: 下午8:39
 * To change this template use File | Settings | File Templates.
 */
public interface CarMapper extends AbstractMapper<Car> {
    public List<Map<String,String>> getListByAppId(long appId);
}
