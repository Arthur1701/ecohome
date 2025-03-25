class Sistema {
    private List<Aparelho> aparelhos;
    private List<Usuario> usuarios;

    public void iniciarMonitoramento() {
        System.out.println("Monitoramento iniciado.");
    }

    public void pararMonitoramento() {
        System.out.println("Monitoramento parado.");
    }

    public Relatorio gerarRelatorio() {
        return new Relatorio(); // Simulação da geração de relatório
    }

    public List<Aparelho> getAparelhos() {
        return aparelhos;
    }

    public void setAparelhos(List<Aparelho> aparelhos) {
        this.aparelhos = aparelhos;
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }
}
