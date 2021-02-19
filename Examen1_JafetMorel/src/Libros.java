public class Libros {
    private String autor, titulo, genero, editorial, idioma;
    private int año_escrito;
    private String ISBN;
    private int año_ingreso;
    private String prestado, nombre_pres;
    private int cuenta_pres;

    public Libros() {
    }

    public Libros(String autor, String titulo, String genero, String editorial, String idioma, int año_escrito, String ISBN, int año_ingreso, String prestado, String nombre_pres, int cuenta_pres) {
        this.autor = autor;
        this.titulo = titulo;
        this.genero = genero;
        this.editorial = editorial;
        this.idioma = idioma;
        this.año_escrito = año_escrito;
        this.ISBN = ISBN;
        this.año_ingreso = año_ingreso;
        this.prestado = prestado;
        this.nombre_pres = nombre_pres;
        this.cuenta_pres = cuenta_pres;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public int getAño_escrito() {
        return año_escrito;
    }

    public void setAño_escrito(int año_escrito) {
        this.año_escrito = año_escrito;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public int getAño_ingreso() {
        return año_ingreso;
    }

    public void setAño_ingreso(int año_ingreso) {
        this.año_ingreso = año_ingreso;
    }

    public String getPrestado() {
        return prestado;
    }

    public void setPrestado(String prestado) {
        this.prestado = prestado;
    }

    public String getNombre_pres() {
        return nombre_pres;
    }

    public void setNombre_pres(String nombre_pres) {
        this.nombre_pres = nombre_pres;
    }

    public int getCuenta_pres() {
        return cuenta_pres;
    }

    public void setCuenta_pres(int cuenta_pres) {
        this.cuenta_pres = cuenta_pres;
    }

    @Override
    public String toString() {
        return "Libros{" + "autor=" + autor + ", titulo=" + titulo + ", genero=" + genero + ", editorial=" + editorial + ", idioma=" + idioma + ", a\u00f1o_escrito=" + año_escrito + ", ISBN=" + ISBN + ", a\u00f1o_ingreso=" + año_ingreso + ", prestado=" + prestado + ", nombre_pres=" + nombre_pres + ", cuenta_pres=" + cuenta_pres + '}';
    }
    
    
}
