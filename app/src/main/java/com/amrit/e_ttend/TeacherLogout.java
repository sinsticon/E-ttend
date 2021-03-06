package com.amrit.e_ttend;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Amrit on 3/20/2017.
 */

public class TeacherLogout extends Fragment{


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        if(SharedPrefManager.getInstance(this.getActivity()).Teacherlogout())
        {
            getActivity().finish();
            startActivity(new Intent(this.getActivity(),TeacherLogin.class));
        }
        super.onCreate(savedInstanceState);
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }
}
