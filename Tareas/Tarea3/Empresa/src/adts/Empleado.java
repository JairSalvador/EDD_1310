package adts;

public class Empleado {

    public static final double VALOR_HORAS_EXTRA = 276.5;
    public static final double PRESTACION_ANTIGUEDAD = 0.03;
    private int id;
    private String nombre;
    private String paterno;
    private String materno;
    private int horasExtra;
    private int sueldoBase;
    private int anioIngreso;

    public Empleado() {
    }

    public Empleado(int id, String nombre, String paterno, String materno, int horasExtra, int sueldoBase, int anioIngreso) {
        this.id = id;
        this.nombre = nombre;
        this.paterno = paterno;
        this.materno = materno;
        this.horasExtra = horasExtra;
        this.sueldoBase = sueldoBase;
        this.anioIngreso = anioIngreso;
    }

    Empleado(String[] datos) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public int getAnioIngreso() {
        return anioIngreso;
    }

    public void setAnioIngreso(int anioIngreso) {
        this.anioIngreso = anioIngreso;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPaterno() {
        return paterno;
    }

    public void setPaterno(String paterno) {
        this.paterno = paterno;
    }

    public String getMaterno() {
        return materno;
    }

    public void setMaterno(String materno) {
        this.materno = materno;
    }

    public double getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(int sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public double getHorasExtra() {
        return horasExtra;
    }

    public void setHorasExtra(int horasExtra) {
        this.horasExtra = horasExtra;
    }

    @Override
    public String toString() {
        return "Empleado{" + "id=" + id + ", nombre=" + nombre + ", paterno="
                + paterno + ", materno=" + materno + ", sueldoBase=" + sueldoBase
                + ", horasExtra=" + horasExtra + ", anioIngreso=" + anioIngreso + '}';
    }

    public double calcularSueldo1() {
    double prestacion = (2022 - this.anioIngreso) * Empleado.PRESTACION_ANTIGUEDAD;
    double he = (this.horasExtra * Empleado.VALOR_HORAS_EXTRA);
    double sueldoTotal = this.sueldoBase + prestacion + he;
    return sueldoTotal ;
}
}
