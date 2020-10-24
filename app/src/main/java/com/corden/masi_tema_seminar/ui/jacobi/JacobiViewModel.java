package com.corden.masi_tema_seminar.ui.jacobi;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class JacobiViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public JacobiViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Jacobi fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}