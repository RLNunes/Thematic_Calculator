package pt.rln.thematiccalculator;

import android.app.Activity;
import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editText1, editText2;
    private View container;
    private Calculator calculator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        editText2 = findViewById(R.id.edit_text2);
        editText1 = findViewById(R.id.edit_text1);
        container = findViewById(R.id.container);
        calculator = new Calculator();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }

    public void addition(View view) {
        editText1.setText(
                calculator.addition(editText1.getText().toString(), editText2.getText().toString())
        );
    }

    public void subtraction(View view) {
        editText1.setText(
                calculator.subtraction(editText1.getText().toString(), editText2.getText().toString())
        );
    }

    public void multiplication(View view) {
        editText1.setText(
                calculator.multiplication(editText1.getText().toString(), editText2.getText().toString())
        );
    }

    public void division(View view) {
        editText1.setText(
                calculator.division(editText1.getText().toString(), editText2.getText().toString())
        );
    }

    public void square_root(View view) {
        editText1.setText(
                calculator.square_root(editText1.getText().toString())
        );
    }

    public void exponential(View view){

        editText1.setText(
                calculator.exponential(editText1.getText().toString())
        );

    }

    public void setFire(View view) {

        if (this.getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT) {
            container.setBackgroundResource(R.drawable.charmander_wp_h);
        } else {
            container.setBackgroundResource(R.drawable.charmander_wp_l);
        }

        updateViews(R.color.Fire);
    }

    public void setWater(View view) {

        if (this.getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT) {
            container.setBackgroundResource(R.drawable.squirtle_wp_h);
        }else {
            container.setBackgroundResource(R.drawable.squirtle_wp_l);
        }


        updateViews(R.color.Water);
    }

    public void setGrass(View view) {
        container.setBackgroundResource(R.drawable.bulbasaur);

        updateViews(R.color.Grass);
    }

    private void changeTextView(int View, int color) {
        TextView textView = findViewById(View);
        textView.setTextColor(getResources().getColor(color));
    }

    private void changeEditView(int View, int color) {
        TextView editView = findViewById(View);
        editView.setBackgroundColor(getResources().getColor(color));
    }

    private void changeButtons(int color) {
        Button button1 = findViewById(R.id.button1);
        Button button2 = findViewById(R.id.button2);
        Button button3 = findViewById(R.id.button3);
        Button button4 = findViewById(R.id.button4);
        Button button5 = findViewById(R.id.button5);
        Button button6 = findViewById(R.id.button6);

        button1.setTextColor(getResources().getColor(color));
        button2.setTextColor(getResources().getColor(color));
        button3.setTextColor(getResources().getColor(color));
        button4.setTextColor(getResources().getColor(color));
        button5.setTextColor(getResources().getColor(color));
        button6.setTextColor(getResources().getColor(color));
    }

    private void updateViews(int color) {
        TextView title = findViewById(R.id.title);
        title.setTextColor(getResources().getColor(color));

        changeTextView(R.id.Operand_Result, color);
        changeEditView(R.id.edit_text1, color);
        changeTextView(R.id.Operand2, color);
        changeEditView(R.id.edit_text2, color);
        changeButtons(color);
    }
}
