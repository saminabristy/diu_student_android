package com.student.diu.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.student.diu.R;
import com.student.diu.adapter.TopNoticeAdapter;
import com.student.diu.model.TopNotice;

import java.util.ArrayList;


public class HomeFragment extends Fragment implements View.OnClickListener {
    private Context mContext;
    private TopNoticeAdapter topNoticeAdapter;
    private RecyclerView rvTopNotice;
    private ArrayList<TopNotice> noticeList;
    private TextView tvViewAll;
    private CardView cvStudentArea, cvTeacherArea;
    private LinearLayoutManager lytManager;


    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = null;
        rootView = inflater.inflate(R.layout.fragment_home, container, false);
        intVariable();
        initView(rootView);
        initFunctionality();
        initListener();
        return rootView;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    public void intVariable() {
        mContext = getActivity();
        noticeList = new ArrayList<>();

    }

    private void initView(View rootView) {
        rvTopNotice = rootView.findViewById(R.id.rv_topNotice);
        tvViewAll = rootView.findViewById(R.id.view_all);
        cvStudentArea = rootView.findViewById(R.id.cv_student_area);
        cvTeacherArea = rootView.findViewById(R.id.cv_teacher_area);


        rvTopNotice.setHasFixedSize(true);
        lytManager = new LinearLayoutManager(mContext);
        rvTopNotice.setLayoutManager(lytManager);
        /*ItemOffsetDecoration itemDecoration = new ItemOffsetDecoration(mContext, R.dimen.padding_margin_2dp);
        rvTopNotice.addItemDecoration(itemDecoration);*/
        topNoticeAdapter = new TopNoticeAdapter(mContext, noticeList);
        rvTopNotice.setAdapter(topNoticeAdapter);
    }


    private void initListener() {
        tvViewAll.setOnClickListener(this);
        cvStudentArea.setOnClickListener(this);
        cvTeacherArea.setOnClickListener(this);


    }

    private void initFunctionality() {
        getTopNotice();


    }

    private void getTopNotice() {

        TopNotice notice = new TopNotice("Mid Exam Start on 5 january", 20 / 12 / 2018, R.drawable.ic_notice_circle);
        noticeList.add(notice);
        notice = new TopNotice("All student collect admit card", 22 / 12 / 2018, R.drawable.ic_notice_circle);
        noticeList.add(notice);
        notice = new TopNotice("Mid Exam Start on 5 january", 23 / 12 / 2018, R.drawable.ic_notice_circle);
        noticeList.add(notice);
        notice = new TopNotice("All student collect admit card", 25 / 12 / 2018, R.drawable.ic_notice_circle);
        noticeList.add(notice);
        notice = new TopNotice("Mid Exam Start on 5 january", 28 / 12 / 2018, R.drawable.ic_notice_circle);
        noticeList.add(notice);

    }

    @Override
    public void onResume() {
        super.onResume();

    }


    @Override
    public void onClick(View v) {
        int id = v.getId();
        switch (id) {
            case R.id.view_all:

                Toast.makeText(mContext, "Under Development", Toast.LENGTH_SHORT).show();
                break;

            case R.id.cv_student_area:
                Toast.makeText(mContext, "Under Development", Toast.LENGTH_SHORT).show();
                break;
            case R.id.cv_teacher_area:
                Toast.makeText(mContext, "Under Development", Toast.LENGTH_SHORT).show();
                break;

            default:
                break;
        }
    }
}
