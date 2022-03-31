package com.thm_group.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.thm_group.R;
import com.thm_group.databinding.ProductOrderRowBinding;
import com.thm_group.models.OrderModel;

import java.util.List;

public class ProductOrderAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private List<OrderModel.Detials> list;
    private Context context;
    private LayoutInflater inflater;

    //private Fragment_Main fragment_main;
    public ProductOrderAdapter(List<OrderModel.Detials> list, Context context) {
        this.list = list;
        this.context = context;
        inflater = LayoutInflater.from(context);
        //  this.fragment_main=fragment_main;


    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {


        ProductOrderRowBinding binding = DataBindingUtil.inflate(inflater, R.layout.product_order_row, parent, false);
        return new MyHolder(binding);


    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

        MyHolder myHolder = (MyHolder) holder;

myHolder.binding.setModel(list.get(position));

//Log.e("eeee",list.get(position).getOffer_value()+""+(list.get(position).getAmount()%list.get(position).getOffer_min()));
        // Log.e("ssss",((list.get(position).getHave_offer().equals("yes")?(list.get(position).getOffer_type().equals("per")?(list.get(position).getProduct_default_price().getPrice()-((list.get(position).getProduct_default_price().getPrice()*list.get(position).getOffer_value())/100)):list.get(position).getProduct_default_price().getPrice()-list.get(position).getOffer_value()):list.get(position).getProduct_default_price().getPrice())+""));


    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class MyHolder extends RecyclerView.ViewHolder {
        public ProductOrderRowBinding binding;

        public MyHolder(@NonNull ProductOrderRowBinding binding) {
            super(binding.getRoot());
            this.binding = binding;

        }
    }


}
