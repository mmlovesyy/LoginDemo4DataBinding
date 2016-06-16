package com.mmlovesyy.databinding;

import android.databinding.ObservableField;

/**
 * Created by cmm on 16/6/16.
 */
public class ViewModel {

    public ObservableField<String> tips = new ObservableField<>();
    public ObservableField<String> email = new ObservableField<>();
    public ObservableField<String> pwd = new ObservableField<>();

    public ViewModel(String _tips) {
        tips.set(_tips);
    }
}
