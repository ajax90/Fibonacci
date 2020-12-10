package com.example.fibonacci;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.Collections;
import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MyViewHolder> {

    private LayoutInflater inflater;
    List<Fibonacci> result = Collections.emptyList();

    public RecyclerAdapter (Context context, List<Fibonacci> result) {
        inflater = LayoutInflater.from(context);
        this.result = result;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
    {
        View view = inflater.inflate(R.layout.fibo_item, parent,false);
        MyViewHolder holder = new MyViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Fibonacci fbNum = result.get(position);
        holder.id.setText(Integer.toString(fbNum.id));
        holder.number.setText(fbNum.number);
    }

    @Override
    public int getItemCount() {
        return result.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {

        TextView id;
        TextView number;

        public MyViewHolder(View itemView) {
            super(itemView);
            id = (TextView) itemView.findViewById(R.id.textViewListID);
            number = (TextView) itemView.findViewById(R.id.textViewListNumber);
        }
    }

}
