package space.lobanovi.m3_hw_4;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class Data_Adapter extends RecyclerView.Adapter<Data_Adapter.View_holder> {

   private Data_Model [] data_list;

    public Data_Adapter(Data_Model[] data_list) {
        this.data_list = data_list;
    }

    @NonNull
    @Override
    public View_holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());


        View lise_item = layoutInflater.inflate(R.layout.recycler_view_row,null);

        View_holder view_holder = new View_holder(lise_item);


        return view_holder;
    }

    @Override
    public void onBindViewHolder(@NonNull View_holder holder, int position) {
        Data_Model data_model = data_list[position];
        holder.my_img.setImageResource(data_model.getImage());
        holder.txt_title.setText(data_model.getTitle());
        holder.txt_description.setText(data_model.getDescription());

        holder.main_card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myintent = new Intent(view.getContext(),Data_activity.class);
                myintent.putExtra("Title",data_model.getTitle());
                myintent.putExtra("Des",data_model.getDescription());
                myintent.putExtra("image",data_model.getImage());
                view.getContext().startActivity(myintent);
            }
        });

    }


    @Override
    public int getItemCount() {
        return data_list.length;
    }

    public class View_holder extends RecyclerView.ViewHolder {
        ImageView my_img;
        TextView txt_title,txt_description;
        CardView main_card;

        public View_holder(@NonNull View itemView) {
            super(itemView);
            txt_title = itemView.findViewById(R.id.txt_title);
            txt_description = itemView.findViewById(R.id.txt_des);
            my_img = itemView.findViewById(R.id.id_image);
            main_card = itemView.findViewById(R.id.main_card);
        }
    }
}
