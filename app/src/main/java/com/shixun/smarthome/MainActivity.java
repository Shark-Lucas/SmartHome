package com.shixun.smarthome;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import java.util.Set;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @SuppressLint("HardwareIds")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BluetoothAdapter bluetoothAdapter = BluetoothAdapter.getDefaultAdapter();    //获取蓝牙适配器

        if (bluetoothAdapter == null){
            Toast.makeText(this, "本设备不支持蓝牙", Toast.LENGTH_SHORT).show();
            return;
        }
        //如果蓝牙未打开则打开蓝牙
        if (!bluetoothAdapter.isEnabled()){
            bluetoothAdapter.enable();
        }


    }
}