/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet_final;

import java.util.ArrayList;

/**
 *
 * @author sarto
 */
public class Bulletin {
    private int id;
    private String appreciation;
    private ArrayList<Discipline> discipline_liste = new ArrayList<>();
    private Trimestre trimestre;
    private int numero;
    public Bulletin(int id, String appreciation,int numero)
    {
        this.id = id;
        this.appreciation = appreciation;
        this.numero=numero;
    }
    public double moyenne()
    {
        double coeff=0;
        double moy=0;
        for(int i=0;i<discipline_liste.size();i++)
        {
            moy+=(discipline_liste.get(i).moyenne())*discipline_liste.get(i).getcoef();
            coeff+=discipline_liste.get(i).getcoef();
        }
        return moy/coeff;
    }
    public String get_appreciation()
    {
        return this.appreciation;
    }
    public ArrayList<Discipline> get_discipline_liste()
    {
        return discipline_liste;
    }
    public int get_numero()
    {
        return numero;
    }
    public void add_discipline(Discipline d)
    {
        discipline_liste.add(d);
    }
    public int get_id()
    {
        return id;
    }
   
} 

