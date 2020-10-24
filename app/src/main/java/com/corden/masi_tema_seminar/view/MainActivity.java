package com.corden.masi_tema_seminar.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import com.corden.masi_tema_seminar.R;
import com.corden.masi_tema_seminar.databinding.ActivityMainBinding;
import com.corden.masi_tema_seminar.view_model.MainActivityViewModel;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding mBinding;
    private MainActivityViewModel mViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        mViewModel = new ViewModelProvider.AndroidViewModelFactory(this.getApplication()).create(MainActivityViewModel.class);
    }
}