package org.whut.inspectManagement.business.device.mapper;

import org.apache.ibatis.annotations.Param;
import org.whut.inspectManagement.business.device.entity.Device;
import org.whut.inspectManagement.business.device.entity.DeviceTypeTag;
import org.whut.platform.fundamental.orm.mapper.AbstractMapper;

import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 14-5-15
 * Time: 下午3:41
 * To change this template use File | Settings | File Templates.
 */
public interface DeviceMapper extends AbstractMapper<Device> {
    public List<Device> findByCondition(Map<String,Object> map);
    public long getIdByNumber(@Param("number") String number,@Param("appId") long appId);
    public List<Map<String,String>> getListByCondition(@Param("deviceType") String deviceType,@Param("deviceNumber") String deviceNumber,@Param("tagName") String tagName,@Param("appId") long appId);
    public List<Map<String,String>> getListByTagId(long tagId);
    public String getNameById(long id);
    public List<Device> getListByAppId(long appId);
    public long getIdByName(@Param("name") String name, @Param("appId") long appId);
    public List<Device> getInfoByCondition(@Param("name")String name,@Param("number")String number,@Param("deviceTypeId")long deviceTypeId,@Param("appId")long appId);
}
