package com.example.beatriz.exercicio03;


import android.support.v4.app.Fragment;

/**
 * Created by Aluno on 24/10/2017.
 */
public interface FragmentManagerInterface {

    public void changeFragment(Fragment fragment);

    public void changeFragmentWithInformation(Fragment fragment, String information);

}
