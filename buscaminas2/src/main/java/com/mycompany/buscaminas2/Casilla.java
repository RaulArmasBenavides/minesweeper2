/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.buscaminas2;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;

/**
 *
 * @author RAUL
 */
public class Casilla extends Button {
       boolean descubierta;
    Casilla(String t){
        super.setLabel(t);
        setBackground(new Color(200,200,200));
        setFont(new Font("Comic Sans Ms", Font.BOLD, 20));
        descubierta = false;
    }
}
