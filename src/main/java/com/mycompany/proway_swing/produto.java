/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proway_swing;

/**
 *
 * @author 74703
 */
public class Produto {
    public String nome;
    public double precoUnitario;
    public int quantidade;
    public int codigo;
    
    //método para calcular e retornar o preço do Produto
    //método com retorno do tipo double
     public double calcularpreco(){
         var preco = quantidade * precoUnitario;
         return preco;
     }
   
}
