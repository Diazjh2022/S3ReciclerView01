package com.example.s3reciclerview01;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapatadorDatos extends RecyclerView.Adapter<AdapatadorDatos.ViewHolderDatos> {
ArrayList<Personaje>ListDatos;
Context context;

    public AdapatadorDatos(ArrayList<Personaje> listDatos, Context context) {
        ListDatos = listDatos;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolderDatos onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.items_recycler, null, false);

        return new ViewHolderDatos(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderDatos holder, int position) {
        holder.texto.setText(ListDatos.get(position).getTexto());
        holder.des.setText(ListDatos.get(position).getDes());
        holder.imagen.setImageResource(ListDatos.get(position).getImagen());

    }

    @Override
    public int getItemCount() {
        return ListDatos.size();
    }

    public class ViewHolderDatos extends RecyclerView.ViewHolder{

        ImageView imagen;
        TextView texto;
        TextView des;

        public ViewHolderDatos(@NonNull View itemView) {
            super(itemView);

            imagen= itemView.findViewById(R.id.myImagen);
            texto = itemView.findViewById(R.id.myDato);
            des = itemView.findViewById(R.id.mydes);

        }
    }
}
