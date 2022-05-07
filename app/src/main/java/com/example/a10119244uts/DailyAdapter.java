package com.example.a10119244uts;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.a10119244uts.DailyModel;
import com.example.a10119244uts.R;

import java.util.ArrayList;

/*
    Tanggal pengerjaan: 30 April 2021
    NIM: 10119244
    Nama: Mya Hauliyah
    Kelas: IF-6
*/

public class DailyAdapter extends RecyclerView.Adapter<DailyAdapter.myviewholder> {

    ArrayList<DailyModel> dailyModel;

    public DailyAdapter(ArrayList<DailyModel> dailyModel) {
        this.dailyModel = dailyModel;
    }

    @NonNull
    @Override
    public myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row_daily, parent, false);
        return new myviewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull myviewholder holder, int position) {
        holder.ivDaily.setImageResource(dailyModel.get(position).getImage());
        holder.tvTitle.setText(dailyModel.get(position).getTitle());
        holder.tvDesc.setText(dailyModel.get(position).getDesc());
    }

    @Override
    public int getItemCount() {
        return dailyModel.size();
    }

    class myviewholder extends RecyclerView.ViewHolder {
        ImageView ivDaily;
        TextView tvTitle, tvDesc;

        public myviewholder(@NonNull View itemView) {
            super(itemView);
            ivDaily = itemView.findViewById(R.id.iv_daily);
            tvTitle = itemView.findViewById(R.id.tv_title);
            tvDesc = itemView.findViewById(R.id.tv_desc);
        }
    }
}
