class Sensor {
    private int id;
    private String tipo;
    private float leituraAtual;

    public void capturarDados() {
        System.out.println("Dados capturados pelo sensor.");
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }

    public float getLeituraAtual() { return leituraAtual; }
    public void setLeituraAtual(float leituraAtual) { this.leituraAtual = leituraAtual; }
}
