package com.student.diu.activity;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.student.diu.R;
import com.student.diu.adapter.NavMenuAdapter;
import com.student.diu.fragment.AboutFragment;
import com.student.diu.fragment.DepartmentFragment;
import com.student.diu.fragment.HomeFragment;
import com.student.diu.fragment.InstituteFragment;
import com.student.diu.fragment.NoticeFragment;

public class BaseActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener,
        View.OnClickListener {
    private Context mContext;
    private Activity mActivity;
    private Toolbar mToolbar;
    public DrawerLayout mDrawerLayout;
    private NavigationView mNavigationView;
    private LinearLayout mHomeMenu, mAboutMenu, mDepartmentMenu, mInstituteMenu, mNoticeMenu;
    private HomeFragment homeFragment;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initVariable();
    }


    private void initVariable() {
        mContext = getApplicationContext();
        mActivity = BaseActivity.this;
    }

    public void initToolbar() {
        mToolbar = findViewById(R.id.toolbar);
        setSupportActionBar(mToolbar);
    }


    public void initNavigationMenu() {
        mHomeMenu = findViewById(R.id.home_menu_id);
        mAboutMenu = findViewById(R.id.about_menu);
        mDepartmentMenu = findViewById(R.id.department_menu);
        mInstituteMenu = findViewById(R.id.institute_menu);
        mNoticeMenu = findViewById(R.id.notice_menu);
    }


    public void enableBackButton() {
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
    }

    public Toolbar getToolbar() {
        if (mToolbar == null) {
            mToolbar = findViewById(R.id.toolbar);
            setSupportActionBar(mToolbar);
        }
        return mToolbar;
    }

    public void setToolbarTitle(String toolBarTitle) {
        TextView toolTitle = findViewById(R.id.toolbar_title);
        toolTitle.setText(toolBarTitle);

    }

    public void initDrawer() {

        mDrawerLayout = findViewById(R.id.mDrawer);
        mNavigationView = findViewById(R.id.navigationView);
        mNavigationView.setNavigationItemSelectedListener(this);
        mNavigationView.setItemIconTintList(null);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, mDrawerLayout, mToolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_open);
        toggle.syncState();
        toggle.setToolbarNavigationClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mDrawerLayout.openDrawer(GravityCompat.START);
            }
        });
    }

    public void initDrawerListener() {
        mHomeMenu.setOnClickListener(this);
        mAboutMenu.setOnClickListener(this);
        mDepartmentMenu.setOnClickListener(this);
        mInstituteMenu.setOnClickListener(this);
        mNoticeMenu.setOnClickListener(this);
    }
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        // Handle navigation view item clicks here.
        if (mDrawerLayout != null && mDrawerLayout.isDrawerOpen(GravityCompat.START)) {
            mDrawerLayout.closeDrawer(GravityCompat.START);
        }
        return true;
    }


    public void initFragment(Fragment fragment, String fragmentName) {
        refreshFragment();
        getSupportFragmentManager().beginTransaction().add(R.id.fragment_container, fragment, fragmentName).commit();
    }

    private void refreshFragment() {
        Fragment home_fragment = getSupportFragmentManager().findFragmentByTag(getString(R.string.home_fragment));
        if (home_fragment != null) {
            getSupportFragmentManager().beginTransaction().remove(home_fragment).commit();
        }

        Fragment about_fragment = getSupportFragmentManager().findFragmentByTag(getString(R.string.about_fragment));
        if (about_fragment != null) {
            getSupportFragmentManager().beginTransaction().remove(about_fragment).commit();
        }

        Fragment dept_fragment = getSupportFragmentManager().findFragmentByTag(getString(R.string.dept_fragment));
        if (dept_fragment != null) {
            getSupportFragmentManager().beginTransaction().remove(dept_fragment).commit();
        }

        Fragment ins_fragment = getSupportFragmentManager().findFragmentByTag(getString(R.string.ins_fragment));
        if (ins_fragment != null) {
            getSupportFragmentManager().beginTransaction().remove(ins_fragment).commit();
        }

        Fragment notice_fragment = getSupportFragmentManager().findFragmentByTag(getString(R.string.notice_fragment));
        if (notice_fragment != null) {
            getSupportFragmentManager().beginTransaction().remove(notice_fragment).commit();
        }
        Fragment student_fragment = getSupportFragmentManager().findFragmentByTag(getString(R.string.student_fragment));
        if (student_fragment != null) {
            getSupportFragmentManager().beginTransaction().remove(student_fragment).commit();
        }
        Fragment teacher_fragment = getSupportFragmentManager().findFragmentByTag(getString(R.string.teacher_fragment));
        if (teacher_fragment != null) {
            getSupportFragmentManager().beginTransaction().remove(teacher_fragment).commit();
        }
        Fragment admi_fragment = getSupportFragmentManager().findFragmentByTag(getString(R.string.admi_fragment));
        if (admi_fragment != null) {
            getSupportFragmentManager().beginTransaction().remove(admi_fragment).commit();
        }
        Fragment adcl_fragment = getSupportFragmentManager().findFragmentByTag(getString(R.string.adcl_fragment));
        if (adcl_fragment != null) {
            getSupportFragmentManager().beginTransaction().remove(adcl_fragment).commit();
        }
        Fragment rAndr_fragment = getSupportFragmentManager().findFragmentByTag(getString(R.string.rAndr_fragment));
        if (rAndr_fragment != null) {
            getSupportFragmentManager().beginTransaction().remove(rAndr_fragment).commit();
        }
        Fragment exam_fragment = getSupportFragmentManager().findFragmentByTag(getString(R.string.exam_fragment));
        if (exam_fragment != null) {
            getSupportFragmentManager().beginTransaction().remove(exam_fragment).commit();
        }
        Fragment bus_fragment = getSupportFragmentManager().findFragmentByTag(getString(R.string.bus_fragment));
        if (bus_fragment != null) {
            getSupportFragmentManager().beginTransaction().remove(bus_fragment).commit();
        }
        Fragment library_fragment = getSupportFragmentManager().findFragmentByTag(getString(R.string.library_fragment));
        if (library_fragment != null) {
            getSupportFragmentManager().beginTransaction().remove(library_fragment).commit();
        }
        Fragment cnc_fragment = getSupportFragmentManager().findFragmentByTag(getString(R.string.cnc_fragment));
        if (cnc_fragment != null) {
            getSupportFragmentManager().beginTransaction().remove(cnc_fragment).commit();
        }
        Fragment al_fragment = getSupportFragmentManager().findFragmentByTag(getString(R.string.al_fragment));
        if (al_fragment != null) {
            getSupportFragmentManager().beginTransaction().remove(al_fragment).commit();
        }
        Fragment setting_fragment = getSupportFragmentManager().findFragmentByTag(getString(R.string.setting_fragment));
        if (setting_fragment != null) {
            getSupportFragmentManager().beginTransaction().remove(setting_fragment).commit();
        }
        Fragment contact_fragment = getSupportFragmentManager().findFragmentByTag(getString(R.string.contact_fragment));
        if (contact_fragment != null) {
            getSupportFragmentManager().beginTransaction().remove(contact_fragment).commit();
        }Fragment faq_fragment = getSupportFragmentManager().findFragmentByTag(getString(R.string.faq_fragment));
        if (faq_fragment != null) {
            getSupportFragmentManager().beginTransaction().remove(faq_fragment).commit();
        }
        Fragment log_fragment = getSupportFragmentManager().findFragmentByTag(getString(R.string.log_fragment));
        if (log_fragment != null) {
            getSupportFragmentManager().beginTransaction().remove(log_fragment).commit();
        }
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.home_menu_id:
                homeFragment = new HomeFragment();
                setToolbarTitle(getString(R.string.home_fragment));
                initFragment(homeFragment, getString(R.string.home_fragment));
                if (mDrawerLayout != null && mDrawerLayout.isDrawerOpen(GravityCompat.START)) {
                    mDrawerLayout.closeDrawer(GravityCompat.START);
                }


                break;
            case R.id.about_menu:
                initFragment(new AboutFragment(), getString(R.string.about_fragment));
                setToolbarTitle(getString(R.string.about_fragment));
                if (mDrawerLayout != null && mDrawerLayout.isDrawerOpen(GravityCompat.START)) {
                    mDrawerLayout.closeDrawer(GravityCompat.START);
                }
                break;
            case R.id.department_menu:
                initFragment(new DepartmentFragment(), getString(R.string.dept_fragment));
                setToolbarTitle(getString(R.string.dept_fragment));
                if (mDrawerLayout != null && mDrawerLayout.isDrawerOpen(GravityCompat.START)) {
                    mDrawerLayout.closeDrawer(GravityCompat.START);
                }
                break;
            case R.id.institute_menu:
                initFragment(new InstituteFragment(), getString(R.string.ins_fragment));
                setToolbarTitle(getString(R.string.ins_fragment));
                if (mDrawerLayout != null && mDrawerLayout.isDrawerOpen(GravityCompat.START)) {
                    mDrawerLayout.closeDrawer(GravityCompat.START);
                }
                break;
            case R.id.notice_menu:
                initFragment(new NoticeFragment(), getString(R.string.notice_fragment));
                setToolbarTitle(getString(R.string.notice_fragment));
                if (mDrawerLayout != null && mDrawerLayout.isDrawerOpen(GravityCompat.START)) {
                    mDrawerLayout.closeDrawer(GravityCompat.START);
                }
                break;

            default:
                break;
        }


    }
}
