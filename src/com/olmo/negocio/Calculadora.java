/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.olmo.negocio;

import com.olmo.GUI.CalculadoraGUI;

/**
 *
 * @author OLMO
 */
public class Calculadora {

    
    
	public String suma(Float num1, Float num2) {

		Float result = num1 + num2;
		return result.toString();

	}

	public String resta(Float num1, Float num2) {

		Float result = num1 - num2;

		return result.toString();

	}

	public String mult(Float num1, Float num2) {

		Float result = num1 * num2;

		return result.toString();

	}

	public String div(Float num1, Float num2) {

		Float result = num1 / num2;

		return result.toString();

	}

	public String divR(Float num1, Float num2) {

		Float result = num1 % num2;

		return result.toString();

	}
       
     

    public Calculadora() {
    }
        
        
}


