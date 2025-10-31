import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class NossaSenhoraAparecida {

    private LocalDate nossaSenhoraAparecida;
    private DataAtual dataAtual;
    private Long dias;

    public long quantosDiasFaltamNossaSenhoraAparecida() {
        this.setDias(ChronoUnit.DAYS.between(this.getDataAtual().getDataNoFormatoChina(), this.getNossaSenhoraAparecida()));
        return this.getDias();
    }

    public NossaSenhoraAparecida(DataAtual dataAtual) {
        this.nossaSenhoraAparecida = LocalDate.of(2026, 10, 12);
        this.dataAtual = dataAtual;
    }

    public LocalDate getNossaSenhoraAparecida() {
        return nossaSenhoraAparecida;
    }

    public void setNossaSenhoraAparecida(LocalDate nossaSenhoraAparecida) {
        this.nossaSenhoraAparecida = nossaSenhoraAparecida;
    }

    public DataAtual getDataAtual() {
        return dataAtual;
    }

    public void setDataAtual(DataAtual dataAtual) {
        this.dataAtual = dataAtual;
    }

    public Long getDias() {
        return dias;
    }

    public void setDias(Long dias) {
        this.dias = dias;
    }
}
