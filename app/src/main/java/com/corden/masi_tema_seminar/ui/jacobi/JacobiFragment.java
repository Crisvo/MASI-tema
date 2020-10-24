package com.corden.masi_tema_seminar.ui.jacobi;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.corden.masi_tema_seminar.R;
import com.corden.masi_tema_seminar.databinding.FragmentJacobiBinding;

public class JacobiFragment extends Fragment {
    private FragmentJacobiBinding mBiding;
    private JacobiViewModel mViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        mViewModel = ViewModelProvider.AndroidViewModelFactory.getInstance(this.getActivity().getApplication()).create(JacobiViewModel.class);
        mBiding = DataBindingUtil.inflate(inflater, R.layout.fragment_jacobi, container, false);
        mBiding.setViewModel(mViewModel);

        mViewModel.result.observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                mBiding.result.setText(s);
            }
        });

        return mBiding.getRoot();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
}