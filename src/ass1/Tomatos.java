/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ass1;

import java.util.Date;

/**
 *
 * @author Admin
 */
public class Tomatos {
    private String idTomato;
    private String nameTomato;
    private String colorTomato;
    private Integer giaTomato;
    private Date ngayMuaDate;
    
    public Tomatos(){       
    }

    public Tomatos(String idTomato, String nameTomato, String colorTomato, Integer giaTomato, Date ngayMuaDate) {
        this.idTomato = idTomato;
        this.nameTomato = nameTomato;
        this.colorTomato = colorTomato;
        this.giaTomato = giaTomato;
        this.ngayMuaDate = ngayMuaDate;
    }

    public String getIdTomato() {
        return idTomato;
    }

    public void setIdTomato(String idTomato) {
        this.idTomato = idTomato;
    }

    public String getNameTomato() {
        return nameTomato;
    }

    public void setNameTomato(String nameTomato) {
        this.nameTomato = nameTomato;
    }

    public String getColorTomato() {
        return colorTomato;
    }

    public void setColorTomato(String colorTomato) {
        this.colorTomato = colorTomato;
    }

    public Integer getGiaTomato() {
        return giaTomato;
    }

    public void setGiaTomato(Integer giaTomato) {
        this.giaTomato = giaTomato;
    }

    public Date getNgayMuaDate() {
        return ngayMuaDate;
    }

    public void setNgayMuaDate(Date ngayMuaDate) {
        this.ngayMuaDate = ngayMuaDate;
    }

    @Override
    public String toString() {
        return "Tomatos{" + "idTomato=" + idTomato + ", nameTomato=" + 
                nameTomato + ", colorTomato=" + colorTomato + ", giaTomato=" + 
                giaTomato + ", ngayMuaDate=" + ngayMuaDate + '}';
    }
    
        public void display(){
        System.out.println(" ");
    }
}
