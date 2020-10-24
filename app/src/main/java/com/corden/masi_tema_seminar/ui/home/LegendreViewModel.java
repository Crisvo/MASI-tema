package com.corden.masi_tema_seminar.ui.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.corden.masi_tema_seminar.exception.JacobiException;
import com.corden.masi_tema_seminar.exception.LegendreException;
import com.corden.masi_tema_seminar.model.Jacobi;
import com.corden.masi_tema_seminar.model.Legendre;

public class LegendreViewModel extends ViewModel {

    public MutableLiveData<String> a = new MutableLiveData<>();
    public MutableLiveData<String> p = new MutableLiveData<>();

    public MutableLiveData<String> result = new MutableLiveData<>();

    public void onCalculate(){
        try {
            int p = Integer.parseInt(this.p.getValue());
            int a = Integer.parseInt(this.a.getValue());
            Legendre legendre = new Legendre(a, p);
            result.setValue(Integer.toString(legendre.calculateLegendreSymbol()));
        } catch (NumberFormatException e) {
            result.setValue("You must insert only numbers!");
        } catch (NullPointerException e){
            result.setValue("You must enter values!");
        } catch (LegendreException e) {
            result.setValue("Number does not meet legendre criteria!");
        }
    }


}