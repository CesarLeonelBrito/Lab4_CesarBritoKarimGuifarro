package lab4_cesarbriokarimguifarro;

import java.util.Random;

public class Tirador extends Jugador {

    Random random = new Random();

    private int tiroTres;
    private int tiroDos;
    private int manejoBalon;

    public Tirador() {
        super();
    }

    public Tirador(int tiroTres, int tiroDos, int manejoBalon, String nombre, String apodo, int numeroCamiseta, String equipoFutFsvorito, String equipoBaskFsvorito, String jugadorFavorito, boolean mayor, int nacimiento, int estrellas) {
        super(nombre, apodo, numeroCamiseta, equipoFutFsvorito, equipoBaskFsvorito, jugadorFavorito, mayor, nacimiento, estrellas);
        this.setTiroTres(tiroTres);
        this.setTiroDos(tiroDos);
        this.setManejoBalon(manejoBalon);
    }

    public int getTiroTres() {
        return tiroTres;
    }

    public void setTiroTres(int tiroTres) {
        if (tiroTres >= 1 & tiroTres <= 100) {
            this.tiroTres = tiroTres;
        }
    }

    public int getTiroDos() {
        return tiroDos;
    }

    public void setTiroDos(int tiroDos) {
        if (tiroDos >= 1 & tiroDos <= 100) {
            this.tiroDos = tiroDos;
        }
    }

    public int getManejoBalon() {
        return manejoBalon;
    }

    public void setManejoBalon(int manejoBalon) {
        if (manejoBalon >= 1 & manejoBalon <= 100) {
            this.manejoBalon = manejoBalon;
        }
    }

    @Override
    public String toString() {
        return super.toString() + "Tirador{" + "random=" + random + ", tiroTres=" + tiroTres + ", tiroDos=" + tiroDos + ", manejoBalon=" + manejoBalon + "\n";
    }

    public boolean tiroTres() {
        int num = 1 + random.nextInt(100);
        double probabilidad = (tiroTres + manejoBalon) * 0.90 * super.getEstrellas() / 10;
        if (num <= probabilidad) {
            return true;
        } else {
            return false;
        }
    }

    public boolean tiroDos() {
        int num = 1 + random.nextInt(100);
        double probabilidad = (tiroDos + manejoBalon) * 0.95 * super.getEstrellas() / 10;
        if (num <= probabilidad) {
            return true;
        } else {
            return false;
        }
    }

}
