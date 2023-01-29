package com.example.athkar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.widget.TableLayout;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
    private TabLayout tableLayout;
    private ViewPager viewPager2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.tableLayout=findViewById(R.id.tabLayout);
        this.viewPager2=findViewById(R.id.viewPager);

        this.tableLayout.addTab(tableLayout.newTab().setText("أدكار الصباح"));
        this.tableLayout.addTab(tableLayout.newTab().setText("أدكار المساء"));
        this.tableLayout.addTab(tableLayout.newTab().setText("About"));

        viewPager2.setAdapter(new FragmentPagerAdapter(getSupportFragmentManager(), FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {
            @Override
            public int getCount() {
                return  tableLayout.getTabCount();

            }

            @NonNull
            @Override
            public Fragment getItem(int position) {
                switch (position){
                    case 0:
                        AthkaraSabahe sabahe= new AthkaraSabahe();
                        return  sabahe;
                    case 1:
                        AthkarAlmasa athkarAlmasa =new AthkarAlmasa();
                        return  athkarAlmasa;
                    case 2:
                        About about =new About();
                        return about;
                    default: return  null;
                }
            }
        });
        tableLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                System.out.println("Position ------------>" + tab.getPosition());
                viewPager2.setCurrentItem(tab.getPosition());
            }
            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }
            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }



}