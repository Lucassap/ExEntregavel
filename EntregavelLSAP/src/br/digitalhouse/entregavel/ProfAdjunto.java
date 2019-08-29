package br.digitalhouse.entregavel;
//Projeto Entregável
//Feito por Lucas S.A. Pereira
//Mobile Android 03
public class ProfAdjunto extends Professor {

    Integer horasmonitoria;

    public ProfAdjunto(String nome, String sobrenome, Integer tempocasa, Integer codigoprofessor, Integer horasmonitoria) {
        super.setNome(nome);
        super.setSobrenome(sobrenome);
        super.setTempocasa(tempocasa);
        super.setCodigoprofessor(codigoprofessor);
        this.horasmonitoria = horasmonitoria;
    }






    @Override
    public boolean equals(Object professor) {
        if (((ProfAdjunto)professor).getCodigoprofessor().equals(this.getCodigoprofessor())) {
            return true;
        } else {
            return false;
        }
    }


    public Integer getHorasmonitoria() {
        return horasmonitoria;
    }

    public void setHorasmonitoria(Integer horasmonitoria) {
        this.horasmonitoria = horasmonitoria;
    }
}


