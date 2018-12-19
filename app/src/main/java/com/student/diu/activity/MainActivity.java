package com.student.diu.activity;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.view.GravityCompat;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import com.student.diu.R;
import com.student.diu.adapter.NavMenuAdapter;
import com.student.diu.fragment.AboutFragment;
import com.student.diu.fragment.AcademicFragment;
import com.student.diu.fragment.AdmissionFragment;
import com.student.diu.fragment.AlumniFragment;
import com.student.diu.fragment.BusFragment;
import com.student.diu.fragment.ContactFragment;
import com.student.diu.fragment.ConvocationFragment;
import com.student.diu.fragment.ExamGuideFragment;
import com.student.diu.fragment.FAQFragment;
import com.student.diu.fragment.HomeFragment;
import com.student.diu.fragment.LibraryFragment;
import com.student.diu.fragment.LogoutFragment;
import com.student.diu.fragment.RulesFragment;
import com.student.diu.fragment.SettingFragment;
import com.student.diu.fragment.StudentFragment;
import com.student.diu.fragment.TeacherFragment;
import com.student.diu.listener.OnItemClickListener;
import com.student.diu.model.Category;
import com.student.diu.utilities.ItemOffsetDecoration;

import java.util.ArrayList;

public class MainActivity extends BaseActivity implements OnItemClickListener {
    private Context mContext;
    private Activity mActivity;
    private NavMenuAdapter navMenuAdapter;
    private RecyclerView recycleNavMenu;
    private LinearLayoutManager lytManager;
    private ArrayList<Category> menuList;
    private HomeFragment homeFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initVariables();
        initView();
        initListener();
        initFunctionality();

    }
    public void initView(){
        setContentView(R.layout.activity_main);

        initToolbar();
        initDrawer();
        initNavigationMenu();
        initDrawerListener();


        homeFragment = new HomeFragment();
        setToolbarTitle("Home");
        initFragment(homeFragment, getString(R.string.home_fragment));

        recycleNavMenu = findViewById(R.id.recycler_view_nav_menu);
        recycleNavMenu.setHasFixedSize(true);
        lytManager = new LinearLayoutManager(mActivity);
        recycleNavMenu.setLayoutManager(lytManager);
        ItemOffsetDecoration itemDecoration = new ItemOffsetDecoration(mContext, R.dimen.padding_margin_5dp);
        recycleNavMenu.addItemDecoration(itemDecoration);
        navMenuAdapter = new NavMenuAdapter(mContext,menuList);
        recycleNavMenu.setAdapter(navMenuAdapter);
    }
    public void initVariables(){
        mContext = getApplicationContext();
        mActivity = MainActivity.this;
        menuList = new ArrayList<>();
    }
    public void initListener(){
        navMenuAdapter.setItemClickListener(this);

    }
    public void initFunctionality(){

        getMenuData();
    }

    public void getMenuData(){
        Category menu = new Category(0,"Student Area", R.drawable.ic_student);
        menuList.add(menu);
        menu = new Category(1,"Teachers Area", R.drawable.ic_teacher);
        menuList.add(menu);
        menu = new Category(2,"Admission", R.drawable.ic_admission);
        menuList.add(menu);
        menu = new Category(3,"Academic Calender", R.drawable.ic_calendar);
        menuList.add(menu);
        menu = new Category(4,"Rules & Regulation", R.drawable.ic_rules);
        menuList.add(menu);
        menu = new Category(5,"Exam Guide Line", R.drawable.ic_home_menu);
        menuList.add(menu);
        menu = new Category(6,"Bus", R.drawable.ic_bus);
        menuList.add(menu);
        menu = new Category(7,"Library", R.drawable.ic_libery);
        menuList.add(menu);
        menu = new Category(8,"Convocation", R.drawable.ic_convocation);
        menuList.add(menu);
        menu = new Category(9,"Alumni", R.drawable.ic_alumni);
        menuList.add(menu);
        menu = new Category(10,"Setting", R.drawable.ic_setting);
        menuList.add(menu);
        menu = new Category(11,"Contact", R.drawable.ic_contact);
        menuList.add(menu);
        menu = new Category(12,"FAQ", R.drawable.ic_faq);
        menuList.add(menu);
        menu = new Category(13,"Logout", R.drawable.ic_home_menu);
        menuList.add(menu);
    }

    @Override
    public void onItemListener(View view, int position) {
      if (menuList.get(position).getMenuID() == 0){
          initFragment(new StudentFragment(), getString(R.string.student_fragment));
          setToolbarTitle(getString(R.string.student_fragment));
          if (mDrawerLayout != null && mDrawerLayout.isDrawerOpen(GravityCompat.START)) {
              mDrawerLayout.closeDrawer(GravityCompat.START);
          }
      }else if (menuList.get(position).getMenuID() == 1){
          initFragment(new TeacherFragment(), getString(R.string.teacher_fragment));
          setToolbarTitle(getString(R.string.teacher_fragment));
          if (mDrawerLayout != null && mDrawerLayout.isDrawerOpen(GravityCompat.START)) {
              mDrawerLayout.closeDrawer(GravityCompat.START);
          }
      }else if (menuList.get(position).getMenuID() == 2){
          initFragment(new AdmissionFragment(), getString(R.string.admi_fragment));
          setToolbarTitle(getString(R.string.admi_fragment));
          if (mDrawerLayout != null && mDrawerLayout.isDrawerOpen(GravityCompat.START)) {
              mDrawerLayout.closeDrawer(GravityCompat.START);
          }
      }else if (menuList.get(position).getMenuID() == 3){
          initFragment(new AcademicFragment(), getString(R.string.adcl_fragment));
          setToolbarTitle(getString(R.string.adcl_fragment));
          if (mDrawerLayout != null && mDrawerLayout.isDrawerOpen(GravityCompat.START)) {
              mDrawerLayout.closeDrawer(GravityCompat.START);
          }
      }else if (menuList.get(position).getMenuID() == 4){
          initFragment(new RulesFragment(), getString(R.string.rAndr_fragment));
          setToolbarTitle(getString(R.string.rAndr_fragment));
          if (mDrawerLayout != null && mDrawerLayout.isDrawerOpen(GravityCompat.START)) {
              mDrawerLayout.closeDrawer(GravityCompat.START);
          }
      }else if (menuList.get(position).getMenuID() == 5){
          initFragment(new ExamGuideFragment(), getString(R.string.exam_fragment));
          setToolbarTitle(getString(R.string.exam_fragment));
          if (mDrawerLayout != null && mDrawerLayout.isDrawerOpen(GravityCompat.START)) {
              mDrawerLayout.closeDrawer(GravityCompat.START);
          }
      }else if (menuList.get(position).getMenuID() == 6){
          initFragment(new BusFragment(), getString(R.string.bus_fragment));
          setToolbarTitle(getString(R.string.bus_fragment));
          if (mDrawerLayout != null && mDrawerLayout.isDrawerOpen(GravityCompat.START)) {
              mDrawerLayout.closeDrawer(GravityCompat.START);
          }
      }else if (menuList.get(position).getMenuID() == 7){
          initFragment(new LibraryFragment(), getString(R.string.library_fragment));
          setToolbarTitle(getString(R.string.library_fragment));
          if (mDrawerLayout != null && mDrawerLayout.isDrawerOpen(GravityCompat.START)) {
              mDrawerLayout.closeDrawer(GravityCompat.START);
          }
      }else if (menuList.get(position).getMenuID() == 8){
          initFragment(new ConvocationFragment(), getString(R.string.cnc_fragment));
          setToolbarTitle(getString(R.string.cnc_fragment));
          if (mDrawerLayout != null && mDrawerLayout.isDrawerOpen(GravityCompat.START)) {
              mDrawerLayout.closeDrawer(GravityCompat.START);
          }
      }else if (menuList.get(position).getMenuID() == 9){
          initFragment(new AlumniFragment(), getString(R.string.al_fragment));
          setToolbarTitle(getString(R.string.al_fragment));
          if (mDrawerLayout != null && mDrawerLayout.isDrawerOpen(GravityCompat.START)) {
              mDrawerLayout.closeDrawer(GravityCompat.START);
          }
      }else if (menuList.get(position).getMenuID() == 10){
          initFragment(new SettingFragment(), getString(R.string.setting_fragment));
          setToolbarTitle(getString(R.string.setting_fragment));
          if (mDrawerLayout != null && mDrawerLayout.isDrawerOpen(GravityCompat.START)) {
              mDrawerLayout.closeDrawer(GravityCompat.START);
          }
      }else if (menuList.get(position).getMenuID() == 11){
          initFragment(new ContactFragment(), getString(R.string.contact_fragment));
          setToolbarTitle(getString(R.string.contact_fragment));
          if (mDrawerLayout != null && mDrawerLayout.isDrawerOpen(GravityCompat.START)) {
              mDrawerLayout.closeDrawer(GravityCompat.START);
          }
      }else if (menuList.get(position).getMenuID() == 12){
          initFragment(new FAQFragment(), getString(R.string.faq_fragment));
          setToolbarTitle(getString(R.string.faq_fragment));
          if (mDrawerLayout != null && mDrawerLayout.isDrawerOpen(GravityCompat.START)) {
              mDrawerLayout.closeDrawer(GravityCompat.START);
          }
      }else if (menuList.get(position).getMenuID() == 13){
          initFragment(new LogoutFragment(), getString(R.string.log_fragment));
          setToolbarTitle(getString(R.string.log_fragment));
          if (mDrawerLayout != null && mDrawerLayout.isDrawerOpen(GravityCompat.START)) {
              mDrawerLayout.closeDrawer(GravityCompat.START);
          }
      }
    }
}
