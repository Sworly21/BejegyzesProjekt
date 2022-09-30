package hu.petrik.BejegyzesProjekt;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Bejegyzes {
    private String szerzo;
    private String tartalom;
    private int likeok;
    private LocalDateTime letrejott;
    private LocalDateTime szerkesztve;

    public Bejegyzes(String szerzo, String tartalom) {
        this.szerzo = szerzo;
        this.tartalom = tartalom;
        this.likeok = 0;
        this.letrejott = LocalDateTime.now();
        this.szerkesztve = LocalDateTime.now();


    }

    public String getSzero() {
        return szerzo;
    }

    public String getTartalom() {
        return tartalom;
    }

    public int getLikeok() {
        return likeok;
    }

    public LocalDateTime getLetrejott() {
        return letrejott;
    }

    public LocalDateTime getSzerkesztve() {
        return szerkesztve;
    }

    public void setLikeok(){

    }

    public void setSzerkesztve(LocalDateTime szerkesztve) {
        this.szerkesztve = szerkesztve;
    }

    public void likeol(){
        this.likeok ++;
    }






    @Override
    public String toString() {
        return String.format("%s: %s (%s)\n" +
            "%s\n" +
            "%s Szerkesztve: %s\n",
              this.szerzo,this.likeok,this.letrejott);

    }
}


