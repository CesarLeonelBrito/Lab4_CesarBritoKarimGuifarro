package lab4_cesarbriokarimguifarro;

import java.util.Random;

public class Pateador extends Jugador {

    Random random = new Random();

    private int habilidadPateadora;
    private int fuerza;
    private int habilidadRagateadora;

    public Pateador() {
        super();
    }

    public Pateador(int habilidadPateadora, int fuerza, int habilidadRagateadora, String nombre, String apodo, int numeroCamiseta, String equipoFutFsvorito, String equipoBaskFsvorito, String jugadorFavorito, boolean mayor, int nacimiento, int estrellas) {
        super(nombre, apodo, numeroCamiseta, equipoFutFsvorito, equipoBaskFsvorito, jugadorFavorito, mayor, nacimiento, estrellas);
        this.setHabilidadPateadora(habilidadPateadora);
        this.setFuerza(fuerza);
        this.setHabilidadRagateadora(habilidadRagateadora);
    }

    public int getHabilidadPateadora() {
        return habilidadPateadora;
    }

    public void setHabilidadPateadora(int habilidadPateadora) {
        if (habilidadPateadora >= 1 & habilidadPateadora <= 100) {
            this.habilidadPateadora = habilidadPateadora;
        }
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        if (fuerza >= 1 & fuerza <= 100) {
            this.fuerza = fuerza;
        }
    }

    public int getHabilidadRagateadora() {
        return habilidadRagateadora;
    }

    public void setHabilidadRagateadora(int habilidadRagateadora) {
        if (habilidadRagateadora >= 1 & habilidadRagateadora <= 100) {
            this.habilidadRagateadora = habilidadRagateadora;
        }
    }

    @Override
    public String toString() {
        return super.toString() + "Pateador{" + "habilidadPateadora=" + habilidadPateadora + ", fuerza=" + fuerza + ", habilidadRagateadora=" + habilidadRagateadora + "\n";
    }

    public boolean tiro() {
        int num = 1 + random.nextInt(100);
        double probabilidad = (habilidadPateadora + fuerza + habilidadRagateadora) * 0.65 * super.getEstrellas() / 10;
        if (num <= probabilidad) {
            return true;
        } else {
            return false;
        }
    }

}
