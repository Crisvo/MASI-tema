package com.corden.masi_tema_seminar.ui.jacobi;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import com.corden.masi_tema_seminar.R;

public class JacobiFragment extends Fragment {

    private JacobiViewModel jacobiViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
            ViewGroup container, Bundle savedInstanceState) {
        jacobiViewModel =
                ViewModelProviders.of(this).get(JacobiViewModel.class);
        View root = inflater.inflate(R.layout.fragment_jacobi, container, false);
        final TextView textView = root.findViewById(R.id.text_dashboard);
        jacobiViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}