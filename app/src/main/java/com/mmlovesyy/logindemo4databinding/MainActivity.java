package com.mmlovesyy.logindemo4databinding;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView mTipsView;
    private EditText mEmailView;
    private EditText mPwdView;
    private Button mSendBtn;

    private boolean mIsEmailValid = false;
    private boolean mIsPwdValid = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // find views
        mTipsView = (TextView) findViewById(R.id.tips);
        mEmailView = (EditText) findViewById(R.id.email);
        mPwdView = (EditText) findViewById(R.id.password);
        mSendBtn = (Button) findViewById(R.id.email_sign_in_button);

        // set value
        String tips = getResources().getString(R.string.prompt);
        mTipsView.setText(tips);
        mTipsView.setVisibility(TextUtils.isEmpty(tips) ? View.GONE : View.VISIBLE);

        // set listeners
        TextWatcher watcherEmail = new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                mIsEmailValid = s.length() > 6;
                mSendBtn.setEnabled(mIsEmailValid && mIsPwdValid);
            }
        };

        TextWatcher watcherPwd = new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                mIsPwdValid = s.length() > 6;
                mSendBtn.setEnabled(mIsEmailValid && mIsPwdValid);
            }
        };

        mEmailView.addTextChangedListener(watcherEmail);
        mPwdView.addTextChangedListener(watcherPwd);

        mSendBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        int id = v.getId();

        if (R.id.email_sign_in_button == id) {
            Toast.makeText(MainActivity.this, v.getResources().getString(R.string.toast), Toast.LENGTH_SHORT).show();
        }
    }
}
