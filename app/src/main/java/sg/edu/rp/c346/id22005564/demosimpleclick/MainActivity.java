package sg.edu.rp.c346.id22005564.demosimpleclick;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Button;
import android.widget.EditText;
import android.os.Bundle;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {


    TextView tvDisplay;
    Button btnDisplay;
    EditText etInput;
    ToggleButton tbtn;

    RadioGroup rgGender;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvDisplay = findViewById(R.id.textViewDisplay);
        btnDisplay =findViewById(R.id.button);
        etInput = findViewById(R.id.editTextInput);
        tbtn = findViewById(R.id.toggleButtonEnabled);
        rgGender = findViewById(R.id.radioGroupGender);



        btnDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Code for the action
                String stringResponse = etInput.getText().toString();
                tvDisplay.setText(stringResponse);

            }
        });
        tbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //get the state of the toggle button
                boolean isChecked = tbtn.isChecked();
                if (isChecked) {
                    etInput.setEnabled(true);
                }
                else {
                    etInput.setEnabled(false);
                }

            }
        });
        btnDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String stringResponse = etInput.getText().toString();
                int checkedRadioId = rgGender.getCheckedRadioButtonId();
                if(checkedRadioId == R.id.radioButtonGenderMale){
                    stringResponse = "She says " + stringResponse;
                }else{
                    stringResponse = "He says " + stringResponse;
                }
                tvDisplay.setText(stringResponse);
            }
        });


    }
        }



