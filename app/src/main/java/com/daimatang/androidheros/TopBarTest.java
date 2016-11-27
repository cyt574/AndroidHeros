package com.daimatang.androidheros;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class TopBarTest extends AppCompatActivity {

    private TopBar mTopbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.topbar_test);
        // 获得我们创建的topbar
        mTopbar = (TopBar) findViewById(R.id.topBar);
        // 为topbar注册监听事件，传入定义的接口
        // 并以匿名类的方式实现接口内的方法
        mTopbar.setOnTopbarClickListener(
                new TopBar.topbarClickListener() {

                    @Override
                    public void rightClick() {
                        Toast.makeText(TopBarTest.this,
                                "right", Toast.LENGTH_SHORT)
                                .show();
                    }

                    @Override
                    public void leftClick() {
                        Toast.makeText(TopBarTest.this,
                                "left", Toast.LENGTH_SHORT)
                                .show();
                    }
                });
        // 控制topbar上组件的状态
        mTopbar.setButtonVisable(0, true);
        mTopbar.setButtonVisable(1, false);
    }
}