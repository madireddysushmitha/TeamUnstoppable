package s528870.funzone;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class RemGuessMain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rem_guess_main);
    }

    public void goToNextActivity(View v){
        Intent in = new Intent(this, RemGuessNext.class);
        startActivity(in);
    }

    public void goTopreviousActivity(View v){
        Intent in = new Intent(this, ResultSequence.class);
        startActivity(in);
    }
}
