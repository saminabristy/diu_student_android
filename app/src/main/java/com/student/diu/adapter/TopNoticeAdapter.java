package com.student.diu.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.student.diu.R;
import com.student.diu.listener.OnItemClickListener;
import com.student.diu.model.TopNotice;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class TopNoticeAdapter extends RecyclerView.Adapter<TopNoticeAdapter.CustomViewHolder> {

private Context context;
private ArrayList<TopNotice> noticeList;
private OnItemClickListener mListener;

public TopNoticeAdapter(Context context, ArrayList<TopNotice> dataList) {
        this.context = context;
        this.noticeList = dataList;
        }

@Override
public TopNoticeAdapter.CustomViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.item_top_notice, null);
    TopNoticeAdapter.CustomViewHolder viewHolder = new TopNoticeAdapter.CustomViewHolder(view, context, noticeList);
        return viewHolder;
        }

@Override
public void onBindViewHolder(TopNoticeAdapter.CustomViewHolder holder, final int position) {

        holder.noticeTitle.setText(noticeList.get(position).getNoticeTittle());
        Glide.with(context)
        .load(noticeList.get(position).getNoticeImage())
        .into(holder.noticeIcon);

        }


@Override
public int getItemCount() {
        return noticeList.size();
        }

public void setItemClickListener(OnItemClickListener mListener) {
        this.mListener = mListener;
        }

class CustomViewHolder extends RecyclerView.ViewHolder {

    Context context;
    ArrayList<TopNotice> noticeList;
    private TextView noticeTitle;
    private CircleImageView noticeIcon;

    public CustomViewHolder(final View itemView, final Context context, ArrayList<TopNotice> dataList) {
        super(itemView);
        this.context = context;
        this.noticeList = dataList;
        noticeTitle = itemView.findViewById(R.id.text_title);
        noticeIcon = itemView.findViewById(R.id.image_notice_banner);

       /* itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListener.onItemListener(itemView,getLayoutPosition());
            }
        });*/

    }

}

}

