package com.mmlovesyy.databinding;

import android.databinding.BaseObservable;
import android.databinding.ObservableField;

/**
 * Created by cmm on 16/6/16.
 */
public class UserViewModel extends BaseObservable {

    public String prompt;
    public ObservableField<String> email = new ObservableField<>();
    public ObservableField<String> pwd = new ObservableField<>();

    public UserViewModel(String _prompt) {
        prompt = _prompt;
    }
}
