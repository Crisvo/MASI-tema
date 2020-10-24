package com.corden.masi_tema_seminar.ui.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class LegendreViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public LegendreViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Legendre fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}