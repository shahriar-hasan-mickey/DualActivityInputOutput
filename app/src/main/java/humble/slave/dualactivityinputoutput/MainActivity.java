package humble.slave.dualactivityinputoutput;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Spinner colors;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        colors = findViewById(R.id.colors);

//        colors.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//                Toast.makeText(MainActivity.this, colors.getSelectedItem().toString(), Toast.LENGTH_SHORT).show();
//            }
//        });

        colors.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this, "Background color : "+colors.getSelectedItem().toString(), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }

    public void onBtnClick(View view){
        EditText input = findViewById(R.id.input);
        Intent intent = new Intent(MainActivity.this, Output.class);
        intent.putExtra("name", input.getText().toString());
        intent.putExtra("color", colors.getSelectedItem().toString());
        startActivity(intent);
    }
}