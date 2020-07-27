package com.soft.portfolioapp.viewActivity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationItemView;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.soft.portfolioapp.R;
import com.soft.portfolioapp.viewFragments.HomeFragment;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    private BottomNavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);

        fragments();

        navigationView = findViewById(R.id.bottomNavigationView);
        navigationView.setOnNavigationItemSelectedListener(this);
    }

    public void fragments() {
        // Pega o FragmentManager
        FragmentManager fm = getSupportFragmentManager();
        // Abre uma transação e adiciona
        FragmentTransaction ft = fm.beginTransaction();
        ft.add(R.id.container, new HomeFragment());
        ft.commit();

    }

    private void openFragment(Fragment fragment) {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.container, fragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.navigation_home:
                Fragment homeFragment = new HomeFragment();
                openFragment(homeFragment);
                break;

            case R.id.navigation_experience:

                break;

            case R.id.navigation_portfolio:

                break;

            case R.id.navigation_contact:

                break;
        }
        return true;
    }
}