/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet_final;

/**
 *
 * @author sarto
 */
public class Trimestre {
    private int num;
    private Date debut;
    private Date fin;
    private int id;
    
    public Trimestre(int num,Date debut, Date fin, int id)
    {
        this.num=num;
        this.debut=debut;
        this.fin=fin;
        this.id=id;
    }
}
