package com.android.teaching.chatapp;


import android.media.session.MediaSession;

import java.util.ArrayList;

public class ModelMensaje {
    private String Token ;
    private String username;
    private String descripcion;

   public ModelMensaje(){

   }
    ArrayList<ModelMensaje> mensajes =new ArrayList<>();

    public ModelMensaje(String username, String descripcion) {
        this.username = username;
        this.descripcion = descripcion;

    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    //public ArrayList<ModelMensaje> getMensajes() {
       // for (ModelMensaje username:usernames){
         //   if (username.getUsername()){
           //     return username;
            //}
        //}
        //return mensajes;
    //}
}
