/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;
import classes.Cuenta;        
/**
 *
 * @author Pablo
 */
public class Movimiento 
{    
    Cuenta cdebe;
    Cuenta chaber;
    float debe;
    float haber;
    String fecha;
    String descp;

    public Movimiento(Cuenta cdebe, Cuenta chaber, float debe, float haber, String fecha) {
        this.cdebe = cdebe;
        this.chaber = chaber;
        this.debe = debe;
        this.haber = haber;
        this.fecha = fecha;
    }

    public Cuenta getCdebe() {
        return cdebe;
    }

    public void setCdebe(Cuenta cdebe) {
        this.cdebe = cdebe;
    }

    public Cuenta getChaber() {
        return chaber;
    }

    public void setChaber(Cuenta chaber) {
        this.chaber = chaber;
    }

    public float getDebe() {
        return debe;
    }

    public void setDebe(float debe) {
        this.debe = debe;
    }

    public float getHaber() {
        return haber;
    }

    public void setHaber(float haber) {
        this.haber = haber;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getDescp() {
        return descp;
    }

    public void setDescp(String descp) {
        this.descp = descp;
    }

    @Override
    public String toString() {
        return "movimiento{" + "cdebe=" + cdebe + ", chaber=" + chaber + ", debe=" + debe + ", haber=" + haber + ", fecha=" + fecha + ", descp=" + descp + '}';
    }
}
