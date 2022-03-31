package com.thm_group.models;

import java.io.Serializable;
import java.util.List;

public class OrderDataModel extends StatusResponse implements Serializable {


        private List<OrderModel> data;


    public List<OrderModel> getData() {
        return data;
    }
}

