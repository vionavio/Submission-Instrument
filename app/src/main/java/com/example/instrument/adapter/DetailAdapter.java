package com.example.instrument.adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.instrument.R;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class DetailAdapter extends RecyclerView.Adapter<DetailAdapter.ListViewHolder> {
    @NonNull
    @Override
    public DetailAdapter.ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull DetailAdapter.ListViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {

        TextView tvDetail;
        ListViewHolder(View itemView) {
            super(itemView);
            tvDetail = itemView.findViewById(R.id.tv_item_detail);
        }
    }
}
