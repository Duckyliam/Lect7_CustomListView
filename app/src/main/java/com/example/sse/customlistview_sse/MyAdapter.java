package com.example.sse.customlistview_sse;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.icu.text.AlphabeticIndex;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.appcompat.app.AppCompatActivity;
public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    String[] data1, data2;
    int[] images;
    Button button;
    RatingBar ratingBar;
    Context context;
    public MyAdapter(Context ct, String[] s1, String[] s2, int[] image, Button btn, RatingBar rtb){
        data1 = s1;
        data2 = s2;
        images = image;
        ratingBar = rtb;
        button = btn;
        context = ct;
    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.my_row, parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.mt1.setText(data1[position]);
        holder.mt2.setText(data2[position]);
        holder.mi.setImageResource(images[position]);
        holder.rt1.setRating(3);
        holder.btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i2=new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtube.com"));
                context.startActivity(i2);
            }
        });
    }

    @Override
    public int getItemCount() {
        return images.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        TextView mt1,mt2;
        ImageView mi;
        Button btn;
        RatingBar rt1;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            mt1 = itemView.findViewById(R.id.tvEpisodeTitle2);
            mt2 = itemView.findViewById(R.id.tvEpisodeDescription2);
            mi = itemView.findViewById(R.id.imgEpisode2);
            btn = itemView.findViewById(R.id.btnRandom2);
            rt1 = itemView.findViewById(R.id.rbEpisode2);
        }
    }
}
