package com.example.instrument.adapter;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.instrument.R;
import com.example.instrument.model.Instrument;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

//pembuatan adapter untuk berkas layout xml
public class GridInstrumentAdapter extends RecyclerView.Adapter<GridInstrumentAdapter.GridViewHolder> {
    private ArrayList<Instrument> listInstrument;
    private OnItemClickCallback onItemClickCallback;
    public GridInstrumentAdapter(ArrayList<Instrument> listInstrument) {
        this.listInstrument = listInstrument;
    }

    @NonNull
    @Override
    public GridInstrumentAdapter.GridViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_grid_instrument, parent, false);
        return new GridViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final GridInstrumentAdapter.GridViewHolder holder, int position) {
        Glide.with(holder.itemView.getContext())
                .load(listInstrument.get(position).getPhoto())
                .apply(new RequestOptions().override(350, 550))
                .into(holder.imgPhoto);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onItemClickCallback.onItemClicked(listInstrument.get(holder.getAdapterPosition()));
            }
        });
    }
    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback;
    }
    public interface OnItemClickCallback {
        void onItemClicked(Instrument data);
    }

    @Override
    public int getItemCount() {
        return listInstrument.size();
    }

    public class GridViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        public GridViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
        }
    }

}
