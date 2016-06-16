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

        ViewModel model = new ViewModel(getResources().getString(R.string.prompt));
        binding.setModel(model);

        ActionHandler handler = new ActionHandler();
        binding.setHandler(handler);
    }
}
