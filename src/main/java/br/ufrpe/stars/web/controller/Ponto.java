/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.ufrpe.stars.web.controller;

import org.json.JSONObject;

/**
 *
 * @author rodemarck
 */
public class Ponto{
        public int x;
        public int y;

        public Ponto(int x, int y) {
            this.x = x;
            this.y = y;
        }
        public JSONObject toJson(){
            JSONObject obj = new JSONObject();
            obj.put("x",x);
            obj.put("y",y);
            return obj;
        }
        public static Ponto fromJson(JSONObject json){
            return new Ponto(json.getInt("x"),json.getInt("y"));
        }

    @Override
    public String toString() {
        return "Ponto{" + "x=" + x + ", y=" + y + '}';
    }
        
    }
