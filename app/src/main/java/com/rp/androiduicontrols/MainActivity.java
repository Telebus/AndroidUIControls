package com.rp.androiduicontrols;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView list;
    String[] itemname = {
            "TextView",
            "EditText",
            "AutoCompleteTextView",
            "Button",
            "ImageButton",
            "ToggleButton",
            "CheckBox",
            "RadioButton",
            "RadioGroup",
            "ProgressBar",
            "Spinner",
            "DatePicker",
            "TimePicker",
            "SeekBar",
            "RatingBar",
            "TextClock",
            "Switch",
            "AlertDialog",
            "MenuOptions",
            "ContextMenu",
            "PopupMenu"

    };

    Class[] item_dir = {
            TextViewClass.class,
            EditTextClass.class,
            AutoComplete.class,
            ButtonClass.class,
            ImageButtonClass.class,
            ToggleButtonClass.class,
            CheckBoxClass.class,
            RadioButtonClass.class,
            RadioGroupClass.class,
            ProgressBarClass.class,
            SpinnerClass.class,
            DatePickerClass.class,
            TimePickerClass.class,
            SeekBarClass.class,
            RatingBarClass.class,
            TextClockClass.class,
            SwitchClass.class,
            AlertDialogClass.class,
            OptionsMenuClass.class,
            ContextMenuClass.class,
            PopupMenuClass.class
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CustomListAdapter adapter = new CustomListAdapter(this, itemname);
        list = findViewById(R.id.list);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String Selecteditem = itemname[+position];
                Toast.makeText(getApplicationContext(), Selecteditem, Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, item_dir[position]);
                startActivity(intent);

            }
        });

    }

}
