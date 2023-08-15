/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perimetre;

/**
 *
 * @author mg
 */
public class Punt {
    private double x,y;
    
    public Punt(double x, double y) {
        this.x=x;
        this.y=y;
    }
    
    public double getX(){
        return x;
    }
    
    public double getY(){
        return y;
    }
    
    public void moure(Punt p) {
        x-=p.getX();
        y-=p.getY();
    }
    
    public double distancia(Punt p) {
        double dx = x - p.getX();
        double dy = y - p.getY();
        
        return Math.sqrt(dx*dx+dy*dy);
    }
    
}

