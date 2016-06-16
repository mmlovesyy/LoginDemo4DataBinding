package com.mmlovesyy.databinding;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.mmlovesyy.databinding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        UserViewModel user = new UserViewModel(getResources().getString(R.string.prompt));
        binding.setModel(user);

        Presenter presenter = new Presenter();
        binding.setPresenter(presenter);
    }
}
