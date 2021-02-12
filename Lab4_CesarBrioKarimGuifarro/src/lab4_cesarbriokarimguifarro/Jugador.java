package lab4_cesarbriokarimguifarro;

public abstract class Jugador {

    private String nombre;
    private String apodo;
    private int numeroCamiseta;
    private String equipoFutFsvorito;
    private String equipoBaskFsvorito;
    private String jugadorFavorito;
    private boolean mayor;
    private int nacimiento;
    private int estrellas;

    public Jugador() {
    }

    public Jugador(String nombre, String apodo, int numeroCamiseta, String equipoFutFsvorito, String equipoBaskFsvorito, String jugadorFavorito, boolean mayor, int nacimiento, int estrellas) {
        this.nombre = nombre;
        this.apodo = apodo;
        this.numeroCamiseta = numeroCamiseta;
        this.equipoFutFsvorito = equipoFutFsvorito;
        this.equipoBaskFsvorito = equipoBaskFsvorito;
        this.jugadorFavorito = jugadorFavorito;
        this.mayor = mayor;
        this.nacimiento = nacimiento;
        this.setEstrellas(estrellas);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodos) {
        this.apodo = apodo;
    }

    public int getNumeroCamiseta() {
        return numeroCamiseta;
    }

    public void setNumeroCamiseta(int numeroCamiseta) {
        this.numeroCamiseta = numeroCamiseta;
    }

    public String getEquipoFutFsvorito() {
        return equipoFutFsvorito;
    }

    public void setEquipoFutFsvorito(String equipoFutFsvorito) {
        this.equipoFutFsvorito = equipoFutFsvorito;
    }

    public String getEquipoBaskFsvorito() {
        return equipoBaskFsvorito;
    }

    public void setEquipoBaskFsvorito(String equipoBaskFsvorito) {
        this.equipoBaskFsvorito = equipoBaskFsvorito;
    }

    public String getJugadorFavorito() {
        return jugadorFavorito;
    }

    public void setJugadorFavorito(String jugadorFavorito) {
        this.jugadorFavorito = jugadorFavorito;
    }

    public boolean isMayor() {
        return mayor;
    }

    public void setMayor(boolean mayor) {
        this.mayor = mayor;
    }

    public int getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(int nacimiento) {
        this.nacimiento = nacimiento;
    }

    public int getEstrellas() {
        return estrellas;
    }

    public void setEstrellas(int estrellas) {
        if (estrellas >= 1 & estrellas <= 5) {
            this.estrellas = estrellas;
        }
    }

    @Override
    public String toString() {
        return "Jugador{" + "nombre=" + nombre + ", apodo=" + apodo + ", numeroCamiseta=" + numeroCamiseta + ", equipoFutFsvorito=" + equipoFutFsvorito + ", equipoBaskFsvorito=" + equipoBaskFsvorito + ", jugadorFavorito=" + jugadorFavorito + ", mayor=" + mayor + ", nacimiento=" + nacimiento + ", estrellas=" + estrellas;
    }

}
