/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gdosoftware.mercadopago.domain;

import java.text.SimpleDateFormat;

/**
 *
 * @author Daniel Gago
 */
public class MPPayment {
    private Long id;
    private Double transaction_amount;
    private Double total_paid_amount;
    private String currency_id;
    private String status;// "approved","pending"
    private String status_detail;//"accredited","pending_waiting_payment"
    private String operation_type;
    private String date_approved;// "2017-12-28T10:00:25.000-04:00" null si esta pendiente
    private String date_created; // "2017-12-28T10:00:22.000-04:00",
    private Double amount_refunded;
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getTransaction_amount() {
        return transaction_amount;
    }

    public void setTransaction_amount(Double transaction_amount) {
        this.transaction_amount = transaction_amount;
    }

    public Double getTotal_paid_amount() {
        return total_paid_amount;
    }

    public void setTotal_paid_amount(Double total_paid_amount) {
        this.total_paid_amount = total_paid_amount;
    }

    public String getCurrency_id() {
        return currency_id;
    }

    public void setCurrency_id(String currency_id) {
        this.currency_id = currency_id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus_detail() {
        return status_detail;
    }

    public void setStatus_detail(String status_detail) {
        this.status_detail = status_detail;
    }

    public String getOperation_type() {
        return operation_type;
    }

    public void setOperation_type(String operation_type) {
        this.operation_type = operation_type;
    }

    public String getDate_approved() {
        return date_approved;
    }

    public void setDate_approved(String date_approved) {
        this.date_approved = date_approved;
    }

    public String getDate_created() {
        return date_created;
    }

    public void setDate_created(String date_created) {
        this.date_created = date_created;
    }

    public Double getAmount_refunded() {
        return amount_refunded;
    }

    public void setAmount_refunded(Double amount_refunded) {
        this.amount_refunded = amount_refunded;
    }

    @Override
    public String toString() {
        return "MPPayment{" + "id=" + id + ", transaction_amount=" + transaction_amount + ", total_paid_amount=" + total_paid_amount + ", currency_id=" + currency_id + ", status=" + status + ", status_detail=" + status_detail + ", operation_type=" + operation_type + ", date_approved=" + date_approved + ", date_created=" + date_created + ", amount_refunded=" + amount_refunded + '}';
    }

   
    
    
    
}
