package com.tyh.model;

import java.io.Serializable;

public class order implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order.order_id
     *
     * @mbggenerated Thu Mar 11 13:44:19 CST 2021
     */
    private String orderId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order.user_id
     *
     * @mbggenerated Thu Mar 11 13:44:19 CST 2021
     */
    private String userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order.user_name
     *
     * @mbggenerated Thu Mar 11 13:44:19 CST 2021
     */
    private String userName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table order
     *
     * @mbggenerated Thu Mar 11 13:44:19 CST 2021
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order.order_id
     *
     * @return the value of order.order_id
     *
     * @mbggenerated Thu Mar 11 13:44:19 CST 2021
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order.order_id
     *
     * @param orderId the value for order.order_id
     *
     * @mbggenerated Thu Mar 11 13:44:19 CST 2021
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order.user_id
     *
     * @return the value of order.user_id
     *
     * @mbggenerated Thu Mar 11 13:44:19 CST 2021
     */
    public String getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order.user_id
     *
     * @param userId the value for order.user_id
     *
     * @mbggenerated Thu Mar 11 13:44:19 CST 2021
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order.user_name
     *
     * @return the value of order.user_name
     *
     * @mbggenerated Thu Mar 11 13:44:19 CST 2021
     */
    public String getUserName() {
        return userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order.user_name
     *
     * @param userName the value for order.user_name
     *
     * @mbggenerated Thu Mar 11 13:44:19 CST 2021
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }
}