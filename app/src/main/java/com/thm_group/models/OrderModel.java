package com.thm_group.models;

import java.io.Serializable;
import java.util.List;

public class OrderModel implements Serializable {
    private int id;
    private int branch_id;
    private String reference_no;
    private int user_id;
    private String cash_register_id;
    private int customer_id;
    private int warehouse_id;
    private int biller_id;
    private int item;
    private double total_qty;
    private double total_discount;
    private double total_tax;
    private double total_price;
    private double grand_total;
    private double order_tax_rate;
    private double order_tax;
    private double order_discount;
    private String coupon_id;
    private double coupon_discount;
    private String shipping_cost;
    private int sale_status;
    private int payment_status;
    private String document;
    private double paid_amount;
    private String sale_note;
    private String staff_note;
    private String is_read;
    private String delivery_companies_id;
    private String created_at;
    private String updated_at;
    private List<Detials> details;

    public int getId() {
        return id;
    }

    public int getBranch_id() {
        return branch_id;
    }

    public String getReference_no() {
        return reference_no;
    }

    public int getUser_id() {
        return user_id;
    }

    public String getCash_register_id() {
        return cash_register_id;
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public int getWarehouse_id() {
        return warehouse_id;
    }

    public int getBiller_id() {
        return biller_id;
    }

    public int getItem() {
        return item;
    }

    public double getTotal_qty() {
        return total_qty;
    }

    public double getTotal_discount() {
        return total_discount;
    }

    public double getTotal_tax() {
        return total_tax;
    }

    public double getTotal_price() {
        return total_price;
    }

    public double getGrand_total() {
        return grand_total;
    }

    public double getOrder_tax_rate() {
        return order_tax_rate;
    }

    public double getOrder_tax() {
        return order_tax;
    }

    public double getOrder_discount() {
        return order_discount;
    }

    public String getCoupon_id() {
        return coupon_id;
    }

    public double getCoupon_discount() {
        return coupon_discount;
    }

    public String getShipping_cost() {
        return shipping_cost;
    }

    public int getSale_status() {
        return sale_status;
    }

    public int getPayment_status() {
        return payment_status;
    }

    public String getDocument() {
        return document;
    }

    public double getPaid_amount() {
        return paid_amount;
    }

    public String getSale_note() {
        return sale_note;
    }

    public String getStaff_note() {
        return staff_note;
    }

    public String getIs_read() {
        return is_read;
    }

    public String getDelivery_companies_id() {
        return delivery_companies_id;
    }

    public String getCreated_at() {
        return created_at;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public List<Detials> getDetails() {
        return details;
    }

    public class Detials implements Serializable {
        private int id;
        private int sale_id;
        private int product_id;
        private String product_batch_id;
        private String variant_id;
        private double qty;
        private int sale_unit_id;
        private double net_unit_price;
        private double discount;
        private double tax_rate;
        private double tax;
        private double total;
        private String created_at;
        private String updated_at;
        private ProductModel kitchen_product;

        public int getId() {
            return id;
        }

        public int getSale_id() {
            return sale_id;
        }

        public int getProduct_id() {
            return product_id;
        }

        public String getProduct_batch_id() {
            return product_batch_id;
        }

        public String getVariant_id() {
            return variant_id;
        }

        public double getQty() {
            return qty;
        }

        public int getSale_unit_id() {
            return sale_unit_id;
        }

        public double getNet_unit_price() {
            return net_unit_price;
        }

        public double getDiscount() {
            return discount;
        }

        public double getTax_rate() {
            return tax_rate;
        }

        public double getTax() {
            return tax;
        }

        public double getTotal() {
            return total;
        }

        public String getCreated_at() {
            return created_at;
        }

        public String getUpdated_at() {
            return updated_at;
        }

        public ProductModel getProduct() {
            return kitchen_product;
        }
    }
}
