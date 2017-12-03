package com.xpf.multi_language.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.xpf.multi_language.R;
import com.xpf.multi_language.utils.LocaleUtil;
import com.xpf.multi_language.utils.SpUtil;

// 多语言选择页面
public class MultiLanguage extends Activity implements View.OnClickListener {

    private ImageView ivBack;
    private TextView tvSave;
    private RadioButton rbSimpleChinese;
    private RadioButton rbComplexChinese;
    private RadioButton rbEnglish;
    private RadioGroup rgLanguages;
    private int currentLanguage = -1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multi_language);

        ivBack = findViewById(R.id.ivBack);
        tvSave = findViewById(R.id.tvSave);
        rbEnglish = findViewById(R.id.rbEnglish);
        rbComplexChinese = findViewById(R.id.rbComplexChinese);
        rbSimpleChinese = findViewById(R.id.rbSimpleChinese);
        rgLanguages = findViewById(R.id.rgLanguages);

        ivBack.setOnClickListener(this);
        tvSave.setOnClickListener(this);

        initData();
        initListener();
    }

    private void initData() {
        int language = SpUtil.getInstance().getInt("currentLanguage", currentLanguage);
        switch (language) {
            case 0:
                rgLanguages.check(R.id.rbSimpleChinese);
                break;
            case 1:
                rgLanguages.check(R.id.rbComplexChinese);
                break;
            case 2:
                rgLanguages.check(R.id.rbEnglish);
                break;
        }
    }

    private void initListener() {
        rgLanguages.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.rbSimpleChinese:
                        currentLanguage = 0;
                        break;
                    case R.id.rbComplexChinese:
                        currentLanguage = 1;
                        break;
                    case R.id.rbEnglish:
                        currentLanguage = 2;
                        break;
                }
            }
        });
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.ivBack:
                finish();
                break;
            case R.id.tvSave:
                if (currentLanguage != -1) {
                    LocaleUtil.changeAppLanguage(MultiLanguage.this, currentLanguage);
                } else {
                    Toast.makeText(MultiLanguage.this, R.string.select_please, Toast.LENGTH_SHORT).show();
                }
                break;
        }
    }

}
