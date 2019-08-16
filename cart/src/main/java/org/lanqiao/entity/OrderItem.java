package org.lanqiao.entity;

public class OrderItem {
    private Integer order_item_id;

    private Integer order_id;

    private String product_name;

    private Integer product_count;

    private Integer produce_price;

    public Integer getOrder_item_id() {
        return order_item_id;
    }

    public void setOrder_item_id(Integer order_item_id) {
        this.order_item_id = order_item_id;
    }

    public Integer getOrder_id() {
        return order_id;
    }

    public void setOrder_id(Integer order_id) {
        this.order_id = order_id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name == null ? null : product_name.trim();
    }

    public Integer getProduct_count() {
        return product_count;
    }

    public void setProduct_count(Integer product_count) {
        this.product_count = product_count;
    }

    public Integer getProduce_price() {
        return produce_price;
    }

    public void setProduce_price(Integer produce_price) {
        this.produce_price = produce_price;
    }
}