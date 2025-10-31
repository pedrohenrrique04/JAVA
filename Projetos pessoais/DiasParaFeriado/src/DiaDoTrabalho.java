import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DiaDoTrabalho {

    private LocalDate diaDoTrabalho;
    private DataAtual dataAtual;
    private Long dias;

    public long quantosDiasFaltamDiaDoTrabalho() {
        this.setDias(ChronoUnit.DAYS.between(this.getDataAtual().getDataNoFormatoChina(), this.getDiaDoTrabalho()));
        return this.getDias();
    }

    public DiaDoTrabalho(DataAtual dataAtual) {
        this.diaDoTrabalho = LocalDate.of(2026, 5, 1);
        this.dataAtual = dataAtual;
    }

    public LocalDate getDiaDoTrabalho() {
        return diaDoTrabalho;
    }

    public void setDiaDoTrabalho(LocalDate diaDoTrabalho) {
        this.diaDoTrabalho = diaDoTrabalho;
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

