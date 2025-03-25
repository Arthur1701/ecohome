class Aparelho {
    private int id;
    private String nome;
    private float consumoEnergia;
    private List<Sensor> sensores;

    public void ligar() {
        System.out.println(nome + " ligado.");
    }

    public void desligar() {
        System.out.println(nome + " desligado.");
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public float getConsumoEnergia() { return consumoEnergia; }
    public void setConsumoEnergia(float consumoEnergia) { this.consumoEnergia = consumoEnergia; }

    public List<Sensor> getSensores() { return sensores; }
    public void setSensores(List<Sensor> sensores) { this.sensores = sensores; }
}
