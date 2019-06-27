package com.example.myapplication2;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addFragment();

    }
    private void addFragment(){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        BlankFragment01 blankFragment01 = new BlankFragment01();
        fragmentTransaction.add(R.id.container_framLayout, blankFragment01);
        fragmentTransaction.addToBackStack("fragmentBackStack1");
        fragmentTransaction.commit();

    }
}
