/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet_final;

/**
 *
 * @author HP
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;

/**
 *
 * @author sarto
 */
public class Discipline {
    private String nom;
    private ArrayList<Eval> note_liste;
    private double coef;
    
    public Discipline()
    {
        this.nom = null;
        this.note_liste = null;
        this.coef = 0;
    }
    
    public Discipline(String nom, double coef)
    {
        this.nom = nom;
        this.note_liste = null;
        this.coef = coef;
    }
    public String get_nom()
    {
        return this.nom;
    }
    
}