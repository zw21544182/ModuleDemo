package zw.first.activity;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.support.annotation.NonNull;
import android.view.View;
import android.widget.Button;

import zw.first.R;
import zw.first.base.BaseActivity;
import zw.second.SeMainActivity;

public class MainActivity extends BaseActivity {
    private Button test;
    private Button test2;
    public static final int REQUEST_CODE = 88;

    @Override
    protected void event() {
        test.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toast("测试1");
            }
        });
        test2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SeMainActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public void initView() {
        test = (Button) findViewById(R.id.test);
        test2 = (Button) findViewById(R.id.test2);
    }

    @Override
    public int getLayoutId() {
        return R.layout.first_activity_main;
    }


    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        switch (requestCode) {
            case REQUEST_CODE:
                if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    //用户同意授权
                    toast(getString(R.string.permissonsucess));
                } else {
                    //用户拒绝授权
                    toast(getString(R.string.permissonfailure));

                }
                break;
        }
    }
}
