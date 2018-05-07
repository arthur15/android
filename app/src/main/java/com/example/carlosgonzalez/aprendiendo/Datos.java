package com.example.carlosgonzalez.aprendiendo;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;


public class Datos extends RecyclerView.Adapter<Datos.ViewHolderDatos> {

    public Datos(ArrayList<String> listDatos) {
        this.listDatos = listDatos;
    }

    ArrayList<String> listDatos;

    @Override
    public ViewHolderDatos onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.datos_bd,null,false);
        return new ViewHolderDatos(view);
    }

    @Override
    public void onBindViewHolder(ViewHolderDatos holder, int position) {
        holder.asignarDatos(listDatos.get(position));
    }

    @Override
    public int getItemCount() {
        return listDatos.size();
    }

    public class ViewHolderDatos extends RecyclerView.ViewHolder {

        TextView dato;

        public ViewHolderDatos(View itemView) {
            super(itemView);
            dato = itemView.findViewById(R.id.dato);
        }

        public void asignarDatos(String datos) {
            dato.setText(datos);
        }
    }
}
