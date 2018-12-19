package com.student.diu.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.student.diu.R;
import com.student.diu.listener.OnItemClickListener;
import com.student.diu.model.Category;

import java.util.ArrayList;

public class NavMenuAdapter extends RecyclerView.Adapter<NavMenuAdapter.CustomViewHolder> {

    private Context context;
    private ArrayList<Category> dataList;
    private OnItemClickListener mListener;

    public NavMenuAdapter(Context context, ArrayList<Category> dataList) {
        this.context = context;
        this.dataList = dataList;
    }

    @Override
    public NavMenuAdapter.CustomViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.item_nav_menu, null);
        NavMenuAdapter.CustomViewHolder viewHolder = new NavMenuAdapter.CustomViewHolder(view, context, dataList);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(NavMenuAdapter.CustomViewHolder holder, final int position) {

        holder.menuTitle.setText(dataList.get(position).getMenuTitle());
        Glide.with(context)
                .load(dataList.get(position).getMenuIcon())
                .into(holder.menuIcon);

    }


    @Override
    public int getItemCount() {
        return dataList.size();
    }

    public void setItemClickListener(OnItemClickListener mListener) {
        this.mListener = mListener;
    }

    class CustomViewHolder extends RecyclerView.ViewHolder {

        Context context;
        ArrayList<Category> dataList;
        private TextView menuTitle;
        private ImageView menuIcon;

        public CustomViewHolder(final View itemView, final Context context, ArrayList<Category> dataList) {
            super(itemView);
            this.context = context;
            this.dataList = dataList;
            menuTitle = itemView.findViewById(R.id.textView_nav_menu);
            menuIcon = itemView.findViewById(R.id.imageView_nav_menu);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mListener.onItemListener(itemView,getLayoutPosition());
                }
            });

        }

    }

}
