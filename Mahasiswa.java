/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.db;
/**
 *
 * @author PC 16
 */
public class Mahasiswa {
    private String NoBp;
    private String Nama;
    private String TmpLahir;
    private String TglLahir;
    private String Alamat;
    private String Phone;
    private String Asalsekolah;
    
    public Mahasiswa(){
        
    }
    public String getasalsekolah(){
        return Asalsekolah;
    }
    public void setasalsekolah (String asalsekolah){
        this.Asalsekolah = asalsekolah;
    }
    public String getphone(){
        return Phone;
    }
    public void setphone (String phone){
        this.Phone = phone;
    }
    public String getalamat(){
        return Alamat;
    }
    public void setalamat (String alamat){
        this.Alamat = alamat;
    }
    public String gettgllahir(){
        return TglLahir;
    }
    public void settgllahir (String tgllahir){
        this.TglLahir = tgllahir;
    }
    public String gettmplahir(){
        return TmpLahir;
    }
    public void settmplahir (String tmplahir){
        this.TmpLahir = tmplahir;
    }
    public String getnama(){
        return Nama;
    }
    public void setnama (String nama){
        this.Nama = nama;
    }
    public String getnobp(){
        return NoBp;
    }
    public void setnobp (String nobp){
        this.NoBp = nobp;
    }
}
