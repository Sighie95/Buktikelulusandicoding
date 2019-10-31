package com.yogiirwan.rizkisaputra.myapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class WisataAdapter extends RecyclerView.Adapter<WisataAdapter.ListViewHolder> {
    private ArrayList<WisataObject> listWisata;
    private OnItemClickCallback onItemClickCallback;

    public WisataAdapter(ArrayList<WisataObject> list) {
        this.listWisata = list;
    }

    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.wisata_item_list, parent, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final WisataAdapter.ListViewHolder holder, int position) {
        WisataObject wo = listWisata.get(position);

        Glide.with(holder.itemView.getContext()).load(wo.getFoto()).apply(new RequestOptions().override(60, 60))
                .into(holder.imgWisata);
        holder.tvNamaTempat.setText(wo.getNamaTempat());
        holder.tvAlamat.setText(wo.getAlamat());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onItemClickCallback.onItemClicked(listWisata.get(holder.getAdapterPosition()));
            }
        });
    }

    @Override
    public int getItemCount() {
        return listWisata.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder{
        ImageView imgWisata;
        TextView tvNamaTempat, tvAlamat;

        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            imgWisata = itemView.findViewById(R.id.tv_wisata_photo);
            tvNamaTempat = itemView.findViewById(R.id.tv_nama_tempat);
            tvAlamat = itemView.findViewById(R.id.tv_kota);
        }
    }
    public interface OnItemClickCallback {
        void onItemClicked(WisataObject data);
    }
}
