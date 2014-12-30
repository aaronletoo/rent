package org.whut.rentManagement.business.front.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.whut.rentManagement.business.front.service.DeviceService;

import javax.ws.rs.Path;

/**
 * Created with IntelliJ IDEA.
 * User: Aaron
 * Date: 14-12-30
 * Time: 下午3:43
 * To change this template use File | Settings | File Templates.
 */
@Component
@Path("/device")
public class DeviceServiceWeb {
    @Autowired
    private DeviceService deviceService;
}
