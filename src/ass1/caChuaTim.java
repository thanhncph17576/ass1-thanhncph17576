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
public class caChuaTim extends Tomatos{
    private String khuyenMai;

    public caChuaTim(String khuyenMai) {
        this.khuyenMai = khuyenMai;
    }

    public caChuaTim(String khuyenMai, String idTomato, String nameTomato, String colorTomato, Integer giaTomato, Date ngayMuaDate) {
        super(idTomato, nameTomato, colorTomato, giaTomato, ngayMuaDate);
        this.khuyenMai = khuyenMai;
    }

    @Override
    public void display() {
        super.display(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setNgayMuaDate(Date ngayMuaDate) {
        super.setNgayMuaDate(ngayMuaDate); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Date getNgayMuaDate() {
        return super.getNgayMuaDate(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setGiaTomato(Integer giaTomato) {
        super.setGiaTomato(giaTomato); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Integer getGiaTomato() {
        return super.getGiaTomato(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setColorTomato(String colorTomato) {
        super.setColorTomato(colorTomato); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getColorTomato() {
        return super.getColorTomato(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setNameTomato(String nameTomato) {
        super.setNameTomato(nameTomato); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getNameTomato() {
        return super.getNameTomato(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setIdTomato(String idTomato) {
        super.setIdTomato(idTomato); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getIdTomato() {
        return super.getIdTomato(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
