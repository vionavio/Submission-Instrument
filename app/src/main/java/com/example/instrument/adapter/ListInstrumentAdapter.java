package com.example.instrument.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.instrument.R;
import com.example.instrument.model.Instrument;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ListInstrumentAdapter extends RecyclerView.Adapter<ListInstrumentAdapter.ListViewHolder> {

    public interface OnItemClickCallback {
        void onItemClicked(Instrument data);
    }

    private OnItemClickCallback onItemClickCallback;
    private ArrayList<Instrument> listInstrument;

    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback;
    }

    public ListInstrumentAdapter(ArrayList<Instrument> list) {
        this.listInstrument = list;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row_instrument, parent, false);
        return new ListViewHolder(view);
    }



    public void onBindViewHolder(@NonNull final ListViewHolder holder, int position) {
        Instrument Instrument = listInstrument.get(position);
        Glide.with(holder.itemView.getContext())
                .load(Instrument.getPhoto())
                .apply(new RequestOptions().override(55, 55))
                .into(holder.imgPhoto);
        holder.tvName.setText(Instrument.getName());
        holder.tvDetail.setText(Instrument.getDetail());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onItemClickCallback.onItemClicked(listInstrument.get(holder.getAdapterPosition()));
            }
        });


    }

    @Override
    public int getItemCount() {
        return listInstrument.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {

        ImageView imgPhoto;
        TextView tvName, tvDetail;
        ListViewHolder(View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvDetail = itemView.findViewById(R.id.tv_item_detail);
        }
    }
}
