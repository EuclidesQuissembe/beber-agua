package ao.co.euclidesquissembe.beberagua;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TimePicker;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button btnNotify;
    private EditText editMinutes;
    private TimePicker timePicker;

    private int hour;
    private int minute;
    private int interval;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Getting layout components
        btnNotify = findViewById(R.id.btn_notify);
        editMinutes = findViewById(R.id.edit_txt_number_interval);
        timePicker = findViewById(R.id.timer_picker);

        // Changing timerPicker format
        timePicker.setIs24HourView(true);

        // Listeners
        btnNotify.setOnClickListener(v -> {
            String sInterval = editMinutes.getText().toString();

            hour = timePicker.getCurrentHour();
            minute = timePicker.getCurrentMinute();
            interval = Integer.parseInt(sInterval);
        });
    }
}