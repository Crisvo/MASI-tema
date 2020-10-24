package com.corden.masi_tema_seminar.ui.jacobi;

import android.app.Application;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.corden.masi_tema_seminar.exception.JacobiException;
import com.corden.masi_tema_seminar.model.Jacobi;

public class JacobiViewModel extends AndroidViewModel {

    public MutableLiveData<String> a = new MutableLiveData<>();
    public MutableLiveData<String> n = new MutableLiveData<>();

    public MutableLiveData<String> result = new MutableLiveData<>();

    public JacobiViewModel(@NonNull Application application) {
        super(application);
    }

    public void onCalculate(){
        try {
            int n = Integer.parseInt(this.n.getValue());
            int a = Integer.parseInt(this.a.getValue());
            Jacobi jacobi = new Jacobi(a, n);
            result.setValue(Integer.toString(jacobi.calculate()));
        } catch (NumberFormatException e) {
            result.setValue("You must insert only numbers!");
        } catch (NullPointerException e){
            result.setValue("You must enter values!");
        } catch (JacobiException e) {
            result.setValue("Number does not meet jacobi criteria!");
        }
    }
}