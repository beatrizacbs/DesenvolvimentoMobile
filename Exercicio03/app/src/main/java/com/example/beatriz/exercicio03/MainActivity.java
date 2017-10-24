package com.example.beatriz.exercicio03;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements FragmentManagerInterface{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        changeFragment(new DataFragment());
    }

    @Override
    public void changeFragment(Fragment fragment) {

        getSupportFragmentManager().beginTransaction()
                .addToBackStack("fragment")
                .replace(R.id.main_container, fragment)
                .commit();

    }

    @Override
    public void changeFragmentWithInformation(Fragment fragment, String information) {

        Bundle bundle = new Bundle();
        bundle.putString("informacao", information);
        fragment.setArguments(bundle);
        getSupportFragmentManager().beginTransaction()
                .addToBackStack("fragment")
                .replace(R.id.main_container, fragment)
                .commit();

    }
}
