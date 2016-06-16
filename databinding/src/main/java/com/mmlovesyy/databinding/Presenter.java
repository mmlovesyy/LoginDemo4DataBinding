package com.mmlovesyy.databinding;

import android.view.View;
import android.widget.Toast;

/**
 * Created by cmm on 16/6/16.
 */
public class Presenter {

    public void sendClick(View view, UserViewModel model) {
        Toast.makeText(view.getContext(), view.getResources().getString(R.string.toast), Toast.LENGTH_SHORT).show();
    }
}
