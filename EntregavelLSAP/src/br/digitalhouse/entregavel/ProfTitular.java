package br.digitalhouse.entregavel;

public class ProfTitular extends Professor {
    String especialidade;

    public ProfTitular(String nome, String sobrenome, Integer tempocasa, Integer codigoprofessor, String especialidade ){
        super.setNome(nome);
        super.setSobrenome(sobrenome);
        super.setTempocasa(tempocasa);
        super.setCodigoprofessor(codigoprofessor);
        this.especialidade = especialidade;
    }

    @Override
    public boolean equals(Object professor) {
        if (((ProfTitular)professor).getCodigoprofessor().equals(this.getCodigoprofessor())) {
            return true;
        } else {
            return false;
        }
    }


    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}
