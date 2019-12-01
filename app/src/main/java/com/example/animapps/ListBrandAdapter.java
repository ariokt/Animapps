package com.example.animapps;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ListBrandAdapter extends RecyclerView.Adapter<ListBrandAdapter.ListViewHolder> {
    private ArrayList<Brand> listBrand;

    public ListBrandAdapter(ArrayList<Brand> list){
        this.listBrand = list;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_row_brand, viewGroup, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, int position) {
        Brand brand = listBrand.get(position);
        Glide.with(holder.itemView.getContext())
                .load(brand.getPhoto())
                .apply(new RequestOptions().override(55, 55))
                .into(holder.imgPhoto);
        holder.tvName.setText(brand.getName());
        holder.tvDetail.setText(brand.getDetail());

    }

    @Override
    public int getItemCount() {
        return listBrand.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder{
        ImageView imgPhoto;
        TextView tvName, tvDetail;
        private RelativeLayout itemlist;
        private Context context;
        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            context = itemView.getContext();
            imgPhoto = itemView.findViewById(R.id.img_brand_photo);
            tvName = itemView.findViewById(R.id.tv_brand_name);
            tvDetail = itemView.findViewById(R.id.tv_brand_details);
            itemlist = itemView.findViewById(R.id.itemlist);
            itemlist.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent();
                    switch (getAdapterPosition()){
                        case 0:
                            intent = new Intent(context, brand1.class);
                            break;
                        case 1:
                            intent = new Intent(context, brand2.class);
                            break;
                        case 2:
                            intent = new Intent(context, brand3.class);
                            break;
                        case 3:
                            intent = new Intent(context, brand4.class);
                            break;
                        case 4:
                            intent = new Intent(context, brand5.class);
                            break;
                        case 5:
                            intent = new Intent(context, brand6.class);
                            break;
                        case 6:
                            intent = new Intent(context, brand7.class);
                            break;
                        case 7:
                            intent = new Intent(context, brand8.class);
                            break;
                        case 8:
                            intent = new Intent(context, brand9.class);
                            break;
                        case 9:
                            intent = new Intent(context, brand10.class);
                            break;
                    }
                    context.startActivities(new Intent[]{intent});
                }
            });
        }



    }
}
