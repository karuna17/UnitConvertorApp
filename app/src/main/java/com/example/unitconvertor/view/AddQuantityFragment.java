package com.example.unitconvertor.view;

import android.graphics.Color;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import com.example.unitconvertor.R;
import com.example.unitconvertor.service.LengthDemo;
import com.example.unitconvertor.service.TemperatureDemo;
import com.example.unitconvertor.service.WeightDemo;

import java.util.ArrayList;

public class AddQuantityFragment extends Fragment {
    Spinner spin1, spin2, spin3, sp_selectOptions;
    EditText editText1, editText2, resultText;
    Button addBtn;

    ArrayList<String> optionList;
    ArrayList<String> list_length;
    ArrayList<String> list_temperature;
    ArrayList<String> list_weight;

    ArrayAdapter<String> arrayAdapter_options;
    ArrayAdapter<String> arrayAdapter_units;

    public AddQuantityFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_add_quantity, container, false);
        sp_selectOptions = v.findViewById(R.id.selctSpinner);
        spin1 = v.findViewById(R.id.spinner1);
        spin2 = v.findViewById(R.id.spinner2);
        spin3 = v.findViewById(R.id.spinner3);
        editText1 = v.findViewById(R.id.edtxt1);
        editText2 = v.findViewById(R.id.edtxt2);
        resultText = v.findViewById(R.id.edtxt3);
        addBtn = v.findViewById(R.id.addButton);

        optionList = new ArrayList<String>();
        optionList.add("Length");
        optionList.add("Temperature");
        optionList.add("Weight");
        arrayAdapter_options = new ArrayAdapter<String>(getContext(), android.R.layout.simple_spinner_item, optionList);
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
                    arrayAdapter_units = new ArrayAdapter<String>(getContext(), android.R.layout.simple_spinner_item, list_length);
                }
                if (position == 1) {
                    arrayAdapter_units = new ArrayAdapter<String>(getContext(), android.R.layout.simple_spinner_item, list_temperature);
                }
                if (position == 2) {
                    arrayAdapter_units = new ArrayAdapter<String>(getContext(), android.R.layout.simple_spinner_item, list_weight);
                }
                spin1.setAdapter(arrayAdapter_units);
                spin2.setAdapter(arrayAdapter_units);
                spin3.setAdapter(arrayAdapter_units);
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str1 = editText1.getText().toString().isEmpty() ? "0" : editText1.getText().toString();
                String str2 = editText2.getText().toString().isEmpty() ? "0" : editText2.getText().toString();

                Double value1 = Double.parseDouble(str1);
                double val1 = Double.valueOf(value1);
                Double value2 = Double.parseDouble(str2);
                double val2 = Double.valueOf(value2);
                String sp1 = spin1.getSelectedItem().toString();
                String sp2 = spin2.getSelectedItem().toString();
                String sp3 = spin3.getSelectedItem().toString();

                if (sp_selectOptions.getSelectedItem().toString().equalsIgnoreCase("Length")) {
                    LengthDemo len = new LengthDemo();
                    double res = len.addQuantity(val1, val2 , sp1, sp2, sp3);
                    resultText.setText(String.valueOf(res));
                    resultText.setTextColor(Color.RED);
                } else if (sp_selectOptions.getSelectedItem().toString().equalsIgnoreCase("Temperature")) {
                    TemperatureDemo tempDemo = new TemperatureDemo();
                    double res = tempDemo.addQuantity(val1, val2 , sp1, sp2, sp3);
                    resultText.setText(String.valueOf(res));
                    resultText.setTextColor(Color.RED);
                }else if (sp_selectOptions.getSelectedItem().toString().equalsIgnoreCase("Weight")) {
                    WeightDemo weightDemo = new WeightDemo();
                    double res = weightDemo.addQuantity(val1, val2 , sp1, sp2, sp3);
                    resultText.setText(String.valueOf(res));
                    resultText.setTextColor(Color.RED);
                }
            }
        });
        return v;
    }
}
