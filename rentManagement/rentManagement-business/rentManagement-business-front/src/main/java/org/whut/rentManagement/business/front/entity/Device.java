package org.whut.rentManagement.business.front.entity;

/**
 * Created with IntelliJ IDEA.
 * User: Aaron
 * Date: 14-12-30
 * Time: 下午3:43
 * To change this template use File | Settings | File Templates.
 */
public class Device {
    private long id;
    private String name;
    private String address;
    private String description;
    private long price;
    private Long appId;

    public Long getAppId() {
        return appId;
    }

    public void setAppId(Long appId) {
        this.appId = appId;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }
}
