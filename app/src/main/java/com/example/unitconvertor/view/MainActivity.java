package com.example.unitconvertor.view;

import androidx.appcompat.app.AppCompatActivity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import com.example.unitconvertor.R;
import com.example.unitconvertor.service.LengthDemo;
import com.example.unitconvertor.service.TemperatureDemo;
import com.example.unitconvertor.view.AddQuantityFragment;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Spinner sp1, sp2, sp_selectOptions;
    private EditText edtxt1;
    private EditText resulTxt;
    private Button btn, fragmentBtn;

    ArrayList<String> optionList;
    ArrayList<String> list_length;
    ArrayList<String> list_temperature;
    ArrayList<String> list_weight;

    ArrayAdapter<String> arrayAdapter_options;
    ArrayAdapter<String> arrayAdapter_units;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtxt1 = findViewById(R.id.txtValue);
        sp_selectOptions = (Spinner) findViewById(R.id.selctOptionSpinner);
        sp1 = (Spinner) findViewById(R.id.spFrom);
        sp2 = (Spinner) findViewById(R.id.spTo);
        resulTxt = (EditText) findViewById(R.id.result);
        btn = (Button) findViewById(R.id.btn1);
        fragmentBtn = (Button) findViewById(R.id.btn2);
        fragmentBtn.setOnClickListener(this);

        optionList = new ArrayList<String>();
        optionList.add("Length");
        optionList.add("Temperature");
        optionList.add("Weight");
        arrayAdapter_options = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_spinner_item, optionList);
        sp_selectOptions.setAdapter(arrayAdapter_options);

        list_length = new ArrayList<String>();
        list_length.add("Inch");
        list_length.add("Centimeter");
        list_length.add("Foot");
        list_length.add("Meter");
        list_length.add("Kilometer");

        list_temperature = new ArrayList<String>();
        list_temperature.add("Celsius");
        list_temperature.add("Fahrenheit");
        list_temperature.add("Kelvin");

        list_weight = new ArrayList<String>();
        list_weight.add("Kilogram");
        list_weight.add("Gram");
        list_weight.add("Miligram");

        sp_selectOptions.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                if (position == 0) {
                    arrayAdapter_units = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_spinner_item, list_length);
                }
                if (position == 1) {
                    arrayAdapter_units = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_spinner_item, list_temperature);
                }
                if (position == 2) {
                    arrayAdapter_units = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_spinner_item, list_weight);
                }
                sp1.setAdapter(arrayAdapter_units);
                sp2.setAdapter(arrayAdapter_units);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }

        });

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = edtxt1.getText().toString().isEmpty() ? "0" : edtxt1.getText().toString();
              //  Log.d("Hello", "input: " + str);
                Double l = Double.parseDouble(str);
                double length = Double.valueOf(l);
                Double t = Double.parseDouble(str);
                double temp = Double.valueOf(t);
                Double w = Double.parseDouble(str);
                double weigth = Double.valueOf(w);
                LengthDemo len = new LengthDemo();
                TemperatureDemo tempDemo = new TemperatureDemo();
                TemperatureDemo weightDemo = new TemperatureDemo();
                if (sp_selectOptions.getSelectedItem().toString().equalsIgnoreCase("Length")) {

                    double res = len.convert(length, sp1.getSelectedItem().toString(), sp2.getSelectedItem().toString());
                    resulTxt.setText(String.valueOf(res));
                    resulTxt.setTextColor(Color.RED);
                } else if (sp_selectOptions.getSelectedItem().toString().equalsIgnoreCase("Temperature")) {

                    double res = tempDemo.convert(temp, sp1.getSelectedItem().toString(), sp2.getSelectedItem().toString());
                    resulTxt.setText(String.valueOf(res));
                    resulTxt.setTextColor(Color.RED);
                }else if (sp_selectOptions.getSelectedItem().toString().equalsIgnoreCase("Weight")) {

                    double res = weightDemo.convert(weigth, sp1.getSelectedItem().toString(), sp2.getSelectedItem().toString());
                    resulTxt.setText(String.valueOf(res));
                    resulTxt.setTextColor(Color.RED);
                }
                /*else if(sp1.getSelectedItem().toString().equalsIgnoreCase(sp2.getSelectedItem().toString())){
                    Toast.makeText(getApplicationContext(), "You can't convert same units", Toast.LENGTH_SHORT).show();
                }*/
            }
        });
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btn2) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new AddQuantityFragment()).addToBackStack(null).commit();
            // fragmentBtn.setVisibility(View.GONE);
        }
    }
}