package com.example.radiogroup;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private RadioGroup radioGroup;
    RadioButton radioButton;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    radioGroup = findViewById(R.id.radio);
    textView = findViewById(R.id.text_view_selected);
    radioGroup = (RadioGroup)findViewById(R.id.groupradio);
    radioGroup.clearCheck();

        radioGroup.setOnCheckedChangeListener(
                new RadioGroup
                        .OnCheckedChangeListener() {
                    @Override

                    // The flow will come here when
                    // any of the radio buttons in the radioGroup
                    // has been clicked

                    // Check which radio button has been clicked
                    public void onCheckedChanged(RadioGroup group,
                                                 int checkedId)
                    {

                        // Get the selected Radio Button
                        RadioButton
                                radioButton
                                = (RadioButton)group
                                .findViewById(checkedId);


                        Log.d("check id is/", String.valueOf(checkedId));

                        if (checkedId == 2131165279){

                            Toast.makeText(MainActivity.this,
                                    "You have selected Apple",
                                    Toast.LENGTH_SHORT)
                                    .show();
                        } else if (checkedId == 2131165280){

                        Toast.makeText(MainActivity.this,
                                "You have selected IOS",
                                Toast.LENGTH_SHORT)
                                .show();
                    }else{
                            Toast.makeText(MainActivity.this,
                                    "You have selected XCODE ",
                                    Toast.LENGTH_SHORT)
                                    .show();
                        }
                    }
                });
    }
}
