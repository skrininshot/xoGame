package com.example.xogame;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button b1;
    private Button b2;
    private Button b3;
    private Button b4;
    private Button b5;
    private Button b6;
    private Button b7;
    private Button b8;
    private Button b9;
    private TextView xo_choice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = findViewById(R.id.button1);
        b2 = findViewById(R.id.button2);
        b3 = findViewById(R.id.button3);
        b4 = findViewById(R.id.button4);
        b5 = findViewById(R.id.button5);
        b6 = findViewById(R.id.button6);
        b7 = findViewById(R.id.button7);
        b8 = findViewById(R.id.button8);
        b9 = findViewById(R.id.button9);
        xo_choice = findViewById(R.id.xo);
    }

    private boolean win = false;
    private boolean xo = true;

    public void tap (View view){

        if (win) return;

        Button button = (Button)view;
        //if (button.getText() == "X" || button.getText()  == "O"){
        //    Toast.makeText(this, "Это поле уже занято.", Toast.LENGTH_SHORT).show();
        //    return;
        //}
        if (xo){
            button.setText("X");
            xo_choice.setText("O");
        }else{
            button.setText("O");
            xo_choice.setText("X");
        }
        xo = !xo;

        if ((b1.getText() == "X" && b2.getText() == "X" && b3.getText() == "X") || //по горизонтали
            (b4.getText() == "X" && b5.getText() == "X" && b6.getText() == "X") ||
            (b7.getText() == "X" && b8.getText() == "X" && b9.getText() == "X") ||

            (b1.getText() == "X" && b4.getText() == "X" && b7.getText() == "X") || //по вертикали
            (b2.getText() == "X" && b5.getText() == "X" && b8.getText() == "X") ||
            (b3.getText() == "X" && b6.getText() == "X" && b9.getText() == "X") ||

            (b1.getText() == "X" && b5.getText() == "X" && b9.getText() == "X") || //по диагонали
            (b3.getText() == "X" && b5.getText() == "X" && b7.getText() == "X")){
            xo_choice.setText("X победил!");
            win = true;
        }else if ((b1.getText() == "O" && b2.getText() == "O" && b3.getText() == "O") || //по горизонтали
                (b4.getText() == "O" && b5.getText() == "O" && b6.getText() == "O") ||
                (b7.getText() == "O" && b8.getText() == "O" && b9.getText() == "O") ||

                (b1.getText() == "O" && b4.getText() == "O" && b7.getText() == "O") || //по вертикали
                (b2.getText() == "O" && b5.getText() == "O" && b8.getText() == "O") ||
                (b3.getText() == "O" && b6.getText() == "O" && b9.getText() == "O") ||

                (b1.getText() == "O" && b5.getText() == "O" && b9.getText() == "O") || //по диагонали
                (b3.getText() == "O" && b5.getText() == "O" && b7.getText() == "O")){
            xo_choice.setText("O победил!");
            win = true;
        }else if (((b1.getText() == "X") || (b1.getText() == "O")) &&
                ((b2.getText() == "X") || (b2.getText() == "O")) &&
                ((b3.getText() == "X") || (b3.getText() == "O")) &&
                ((b4.getText() == "X") || (b4.getText() == "O")) &&
                ((b5.getText() == "X") || (b5.getText() == "O")) &&
                ((b6.getText() == "X") || (b6.getText() == "O")) &&
                ((b7.getText() == "X") || (b7.getText() == "O")) &&
                ((b8.getText() == "X") || (b8.getText() == "O")) &&
                ((b9.getText() == "X") || (b9.getText() == "O"))){
            xo_choice.setText("Ничья!");
            win = true;
        }
    }

    public void restart (View view){
        b1.setText("");
        b2.setText("");
        b3.setText("");
        b4.setText("");
        b5.setText("");
        b6.setText("");
        b7.setText("");
        b8.setText("");
        b9.setText("");
        xo_choice.setText("X");
        xo = true;
        win = false;
    }


}