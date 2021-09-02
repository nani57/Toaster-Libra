package com.example.toasterlibrabry;

import android.content.Context;
import android.widget.Toast;

public class ToasterMessage {
    public static void showToast(Context context, String toastMessage){
        Toast.makeText(context, toastMessage, Toast.LENGTH_SHORT).show();
    }
}
