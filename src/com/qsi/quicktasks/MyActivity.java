package com.qsi.quicktasks;

import roboguice.activity.RoboActivity;

import com.google.inject.Inject;
import com.googlecode.androidannotations.annotations.Click;
import com.googlecode.androidannotations.annotations.EActivity;
import com.googlecode.androidannotations.annotations.ViewById;
import com.qsi.quicktasks.services.SayHelloService;

import android.widget.EditText;
import android.widget.TextView;

@EActivity(R.layout.main)
public class MyActivity extends RoboActivity {

    @ViewById
    EditText myInput;
        
    @ViewById(R.id.myTextView)
    TextView textView;
    
    @Inject
    SayHelloService sayHelloService;
        
    @Click
    void myButton() {
         String name = myInput.getText().toString();
    	 textView.setText(sayHelloService.sayHello(name));
    }
}
