package humble.slave.dualactivityinputoutput;

import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Output extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.output);

        TextView output1 = findViewById(R.id.output1);
//        TextView output2 = findViewById(R.id.output2);
        Bundle extras = getIntent().getExtras();
        if(extras != null){
            String value = extras.getString("name");
            output1.setText(value);
            value = extras.getString("color");
            RelativeLayout outRelativeLayout = findViewById(R.id.outRelativeLayout);
            int code = 0;
            switch (value){
                case "red":
                    code = R.color.red;
                    break;
                case "green":
                    code = R.color.green;
                    break;
                case "blue":
                    code = R.color.blue;
                    break;
                case "yellow":
                    code = R.color.yellow;
                    break;
                case "orange":
                    code = R.color.orange;
                    break;
            }
            outRelativeLayout.setBackgroundColor(getResources().getColor(code));
//            output2.setText();
        }

    }
}
