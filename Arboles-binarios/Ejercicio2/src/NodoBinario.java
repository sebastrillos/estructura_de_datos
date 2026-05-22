public class NodoBinario {
    private int idEstudiante;
    private NodoBinario derecho, izquierdo;

    public NodoBinario(int idEstudiante) {
        this.idEstudiante = idEstudiante;
        this.derecho = this.izquierdo = null;
    }

    public int getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(int idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public NodoBinario getDerecho() {
        return derecho;
    }

    public void setDerecho(NodoBinario derecho) {
        this.derecho = derecho;
    }

    public NodoBinario getIzquierdo() {
        return izquierdo;
    }

    public void setIzquierdo(NodoBinario izquierdo) {
        this.izquierdo = izquierdo;
    }
}
