package s528870.funzone;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Level2EnterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leve2_enter);
    }
    public void goToNextActivity(View v){
        Intent in = new Intent(this, TestAlphabet.class);
        startActivity(in);
    }

    public void goTopreviousActivity(View v){
        Intent in = new Intent(this, Level1Activity.class);
        startActivity(in);
    }
}
