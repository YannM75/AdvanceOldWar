package com.javascource.advanceoldwars;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.javascource.advanceoldwars.activities.GameTestActivity;

public class HomeActivity extends Activity {

    public Intent intentVar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        intentVar = new Intent(this, GameTestActivity.class);

        Button btnStartGame = (Button) findViewById(R.id.start_game);

        btnStartGame.setOnClickListener(new ButtonStartClickListener(btnStartGame));
    }

    class ButtonStartClickListener implements View.OnClickListener {
        Button btn;

        ButtonStartClickListener(Button button) {
            this.btn = button;
        }

        @Override
        public void onClick(View v) {
            startActivity(intentVar);
        }
    };
}
