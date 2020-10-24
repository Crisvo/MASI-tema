package com.corden.masi_tema_seminar.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import com.corden.masi_tema_seminar.R;
import com.corden.masi_tema_seminar.databinding.FragmentJacobiBinding;
import com.corden.masi_tema_seminar.databinding.FragmentLegendreBinding;
import com.corden.masi_tema_seminar.ui.jacobi.JacobiViewModel;

public class LegendreFragment extends Fragment {
    private FragmentLegendreBinding mBiding;
    private LegendreViewModel mViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
            ViewGroup container, Bundle savedInstanceState) {
        mViewModel = ViewModelProvider.AndroidViewModelFactory.getInstance(this.getActivity().getApplication()).create(LegendreViewModel.class);
        mBiding = DataBindingUtil.inflate(inflater, R.layout.fragment_legendre, container, false);
        mBiding.setViewModel(mViewModel);

        mViewModel.result.observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                mBiding.result.setText(s);
            }
        });

        return mBiding.getRoot();
    }
}