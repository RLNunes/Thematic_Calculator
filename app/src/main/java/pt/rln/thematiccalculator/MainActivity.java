package pt.rln.thematiccalculator;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editText1, editText2;
    private View container;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText2 = findViewById(R.id.edit_text2);
        editText1 = findViewById(R.id.edit_text1);
        container = findViewById(R.id.container);

    }

    private double getDouble(String s){
        return Double.parseDouble(s);
    }

    public void addition(View view) {
        String s1 = editText1.getText().toString();
        String s2 = editText2.getText().toString();

        double value = getDouble(s1) + getDouble(s2);
        editText1.setText(Double.toString(value));
    }

    public void subtraction(View view) {
        String s1 = editText1.getText().toString();
        String s2 = editText2.getText().toString();

        double value = getDouble(s1) - getDouble(s2);
        editText1.setText(Double.toString(value));
    }

    public void multiplication(View view) {
        String s1 = editText1.getText().toString();
        String s2 = editText2.getText().toString();

        double value = getDouble(s1) * getDouble(s2);
        editText1.setText(Double.toString(value));
    }

    public void division(View view) {
        String s1 = editText1.getText().toString();
        String s2 = editText2.getText().toString();

        double value = getDouble(s1) / getDouble(s2);
        editText1.setText(Double.toString(value));
    }

    private void changeTextView(int View, int color){
        TextView textView = findViewById(View);
        textView.setTextColor(getResources().getColor(color));
    }

    private void changeEditView(int View, int color){
        TextView editView = findViewById(View);
        editView.setBackgroundColor(getResources().getColor(color));
    }

    private void changeButtons(int color) {
        Button button1 = findViewById(R.id.button1);
        Button button2 = findViewById(R.id.button2);
        Button button3 = findViewById(R.id.button3);
        Button button4 = findViewById(R.id.button4);

        button1.setTextColor(getResources().getColor(color));
        button2.setTextColor(getResources().getColor(color));
        button3.setTextColor(getResources().getColor(color));
        button4.setTextColor(getResources().getColor(color));
    }

    public void setBenfica(View view) {
        container.setBackgroundResource(R.drawable.estadio_da_luz);

        TextView title = findViewById(R.id.title);
        title.setTextColor(getResources().getColor(R.color.Benfica));

        changeTextView(R.id.Operand_Result, R.color.Benfica);
        changeEditView(R.id.edit_text1, R.color.Benfica);
        changeTextView(R.id.Operand2, R.color.Benfica);
        changeEditView(R.id.edit_text2, R.color.Benfica);
        changeButtons(R.color.Benfica);
    }

    public void setPorto(View view) {
        container.setBackgroundResource(R.drawable.estadio_do_dragao);

        TextView title = findViewById(R.id.title);
        title.setTextColor(getResources().getColor(R.color.Porto));

        changeTextView(R.id.Operand_Result, R.color.Porto);
        changeEditView(R.id.edit_text1, R.color.Porto);
        changeTextView(R.id.Operand2, R.color.Porto);
        changeEditView(R.id.edit_text2, R.color.Porto);
        changeButtons(R.color.Porto);
        setTheme(R.style.AppTheme);
    }

    public void setSporting(View view) {
        container.setBackgroundResource(R.drawable.estadio_de_alvalade);

        TextView title = findViewById(R.id.title);
        title.setTextColor(getResources().getColor(R.color.Sporting));

        changeTextView(R.id.Operand_Result, R.color.Sporting);
        changeEditView(R.id.edit_text1, R.color.Sporting);
        changeTextView(R.id.Operand2, R.color.Sporting);
        changeEditView(R.id.edit_text2, R.color.Sporting);
        changeButtons(R.color.Sporting);
    }
}
