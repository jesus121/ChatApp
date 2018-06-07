package com.android.teaching.chatapp;



public class ModelMensaje {
    private String username;
    private String descripcion;
   public ModelMensaje(){

   }


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
}
