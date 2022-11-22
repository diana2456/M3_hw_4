package space.lobanovi.m3_hw_4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView myrecycler_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Data_Model [] my_data = new Data_Model[]{
                new Data_Model("Потомки солнца   ","16 серий",R.drawable.a),
                new Data_Model("Звук волшебства  ","6 серий",R.drawable.b),
                new Data_Model("       Винченцо        ","20 серий",R.drawable.v),
                new Data_Model("Падаюшая звезда  ","16 серий",R.drawable.m),
                new Data_Model("          Болтун          ","16 серий",R.drawable.o),
                new Data_Model("         Пентхаус        ","1 сезон 21 серий",R.drawable.f),
                new Data_Model("Териус позади меня","16 серий",R.drawable.g),
                new Data_Model("       Я не робот       ","16 серий",R.drawable.h),
                new Data_Model("Алые серца Корё","20 серий",R.drawable.i),
                new Data_Model("Любовь на льду   ","40 серий",R.drawable.q),
                new Data_Model("  Невеста  демона   ","16 серий",R.drawable.k),
                new Data_Model("Повелитель солнца","17 серий",R.drawable.l)
        };

        myrecycler_view = findViewById(R.id.recycler_view);
        Data_Adapter myadapter = new Data_Adapter(my_data);
        myrecycler_view.setLayoutManager(new LinearLayoutManager(this ));
        myrecycler_view.setAdapter(myadapter);
    };
}