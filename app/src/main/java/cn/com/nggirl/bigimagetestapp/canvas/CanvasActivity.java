package cn.com.nggirl.bigimagetestapp.canvas;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import cn.com.nggirl.bigimagetestapp.R;

public class CanvasActivity extends AppCompatActivity {

    public static void start(Context context) {
        context.startActivity(new Intent(context, CanvasActivity.class));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_canvas);

        initView();
    }

    private void initView() {

    }

}
