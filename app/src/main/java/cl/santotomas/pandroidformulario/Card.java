package cl.santotomas.pandroidformulario;


 class Tarjeta {
    private Integer id;
    private String nombre;
    private String apellido;
    private String numTarjeta;
    private String mes;
    private String año;
    private String codigo;
    private String calleNum;
    private String ciudad;
    private String estado;
    private String codPostal;
    public Integer getId() {
        return id;
    }
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getnTarjeta() {
        return numTarjeta;
    }

    public String getMes() {
        return mes;
    }

    public String getAnho() {
        return año;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getCalle() {
        return calleNum;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getEstado() {
        return estado;
    }

    public String getCodiP() {
        return codPostal;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setnTarjeta(String nTarjeta) {
        this.numTarjeta = nTarjeta;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public void setAnho(String anho) {
        this.año = anho;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setCalle(String calle) {
        this.calleNum = calle;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setCodiP(String codiP) {
        this.codPostal = codiP;
    }
    public boolean esVacio() {
        if (this.nombre.isEmpty() && this.apellido.isEmpty() && this.numTarjeta.isEmpty() && this.mes.isEmpty() && this.año.isEmpty() && this.codigo.isEmpty() && this.calleNum.isEmpty() && this.ciudad.isEmpty() && this.estado.isEmpty() && this.codPostal.isEmpty())
            return true;
        return false;
    }
    public boolean tarIgual(String repetir){
        if(this.numTarjeta.equals(repetir))
            return true;
        return false;
    }
}
