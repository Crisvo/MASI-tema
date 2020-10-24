package com.corden.masi_tema_seminar.ui.legendre;

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

public class LegendreFragment extends Fragment {

    private LegendreViewModel legendreViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
            ViewGroup container, Bundle savedInstanceState) {
        legendreViewModel =
                ViewModelProviders.of(this).get(LegendreViewModel.class);
        View root = inflater.inflate(R.layout.fragment_legendre, container, false);
        final TextView textView = root.findViewById(R.id.text_home);
        legendreViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}