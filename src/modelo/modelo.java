/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author l03m10
 */
public class modelo {
    
    private int Numerouno;
    private int NumeroDos;
    private int resultado;

    public int getNumerouno() {
        return Numerouno;
    }

    public void setNumerouno(int Numerouno) {
        this.Numerouno = Numerouno;
    }

    public int getNumeroDos() {
        return NumeroDos;
    }

    public void setNumeroDos(int NumeroDos) {
        this.NumeroDos = NumeroDos;
    }

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }
    public int multiplicar()
    {
        this.resultado=this.Numerouno*this.NumeroDos;
        return this.resultado;
        
    }
    
}
