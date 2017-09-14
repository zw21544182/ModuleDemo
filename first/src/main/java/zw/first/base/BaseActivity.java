package zw.first.base;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.Toast;

/**
 * Created by zhongwang on 2017/9/13.
 */

public abstract class BaseActivity extends Activity  {
    public void toast(String content) {
        Toast.makeText(this, content, Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());
        initView();
        event();
    }

    protected abstract void event();

    public abstract void initView();


    public abstract int getLayoutId() ;
}
