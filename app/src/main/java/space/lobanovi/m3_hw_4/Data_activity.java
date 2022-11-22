package space.lobanovi.m3_hw_4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Data_activity extends AppCompatActivity {

    TextView txt_title,txt_description;
    ImageView image_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);

        txt_title = findViewById(R.id.txt_title);
        txt_description = findViewById(R.id.txt_des);
        image_view = findViewById(R.id.id_image);

        txt_title.setText(getIntent().getExtras().getString("Title"));
        txt_description.setText(getIntent().getExtras().getString("Des"));

        int my_int_image = getIntent().getIntExtra("image",0);
        image_view.setImageResource(my_int_image);

    }
}