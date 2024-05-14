package com.example.ieslavereda.activities.model;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myweatherbase.R;
import com.example.myweatherbase.activities.model.Root;
import com.example.myweatherbase.base.ImageDownloader;
import com.example.myweatherbase.base.Parameters;

import java.text.SimpleDateFormat;
import java.util.Date;


public class RecycleView extends RecyclerView.Adapter<RecycleView.ViewHolder> {

    private LayoutInflater layoutInflater;
    private View.OnClickListener onClickListener;
    private Root root;

    public RecycleView(Context context, Root root){
        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        this.root = root;
    }

    public void setOnClickListener(View.OnClickListener onClickListener){
        this.onClickListener = onClickListener;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = layoutInflater.inflate(R.layout.simple_element,parent,false);
        view.setOnClickListener(onClickListener);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return root.list.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        private ImageView imagen;
        private TextView nombre, valoracion, descripcion;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imagen = itemView.findViewById(R.id.imageWeather);
            nombre = itemView.findViewById(R.id.textDay);
            valoracion = itemView.findViewById(R.id.textDate);
            descripcion = itemView.findViewById(R.id.textDescripcion);
        }
    }



}
