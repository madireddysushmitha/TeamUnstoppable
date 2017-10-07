package s528870.funzone;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class FinishGame extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finish_game);
    }

    public void goToNextActivity(View v){
        Intent in = new Intent(this, MainActivity.class);
        startActivity(in);
    }

    public void goTopreviousActivity(View v){
        Intent in = new Intent(this, RememberGuess.class);
        startActivity(in);
    }
}
