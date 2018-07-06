
import java.io.DataInput;
import java.io.IOException;
import java.nio.charset.Charset;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lucas Carvalho
 */
public class Bolsas {
    
    private String uf;
    private String codMun;
    private String nomeMun;
    private String codFun;
    private String codSub;
    private String codProg;
    private String codAcao;
    private String nisFav;
    private String nomeFav;
    private String fontFin;
    private String valor;
    private String mesComp;

    
    
    public void recuperaBolsa(String st) throws IOException {
      
        
        Charset enc = Charset.forName("ISO-8859-1");
        
        
        String campos[] = st.split("\t");
      

        

        this.uf = campos[0];
        this.codMun = campos[1];
        this.nomeMun = campos[2];
        this.codFun = campos[3];
        this.codSub = campos[4];
        this.codProg = campos[5];
        this.codAcao = campos[6];
        this.nisFav = campos[7];
        this.nomeFav = campos[8];
        this.valor = campos[10];
        this.mesComp = campos[11];
        
        
    }

    public String getNomeMun() {
        return nomeMun;
    }

    public void setNomeMun(String nomeMun) {
        this.nomeMun = nomeMun;
    }
    
    
    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getCodMun() {
        return codMun;
    }

    public void setCodMun(String codMun) {
        this.codMun = codMun;
    }

    public String getCodFun() {
        return codFun;
    }

    public void setCodFun(String codFun) {
        this.codFun = codFun;
    }

    public String getCodSub() {
        return codSub;
    }

    public void setCodSub(String codSub) {
        this.codSub = codSub;
    }

    public String getCodProg() {
        return codProg;
    }

    public void setCodProg(String codProg) {
        this.codProg = codProg;
    }

    public String getCodAcao() {
        return codAcao;
    }

    public void setCodAcao(String codAcao) {
        this.codAcao = codAcao;
    }

    public String getNisFav() {
        return nisFav;
    }

    public void setNisFav(String nisFav) {
        this.nisFav = nisFav;
    }

    public String getNomeFav() {
        return nomeFav;
    }

    public void setNomeFav(String nomeFav) {
        this.nomeFav = nomeFav;
    }

    public String getFontFin() {
        return fontFin;
    }

    public void setFontFin(String fontFin) {
        this.fontFin = fontFin;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getMesComp() {
        return mesComp;
    }

    public void setMesComp(String mesComp) {
        this.mesComp = mesComp;
    }
    
    
    
}
