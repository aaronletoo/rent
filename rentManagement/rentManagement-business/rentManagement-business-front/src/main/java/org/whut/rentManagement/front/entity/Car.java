package org.whut.rentManagement.front.entity;

/**
 * Created with IntelliJ IDEA.
 * User: Aaron
 * Date: 14-12-30
 * Time: 下午8:38
 * To change this template use File | Settings | File Templates.
 */
public class Car {
    private long id;
    private String name;
    private String description;
    private String price;

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
