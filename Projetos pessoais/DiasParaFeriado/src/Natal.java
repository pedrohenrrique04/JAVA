import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Natal {

    private LocalDate natal;
    private DataAtual dataAtual;
    private Long dias;

    public long quantosDiasFaltamNatal() {
        this.setDias(ChronoUnit.DAYS.between(this.getDataAtual().getDataNoFormatoChina(), this.getNatal()));
        return this.getDias();
    }

    public Natal(DataAtual dataAtual) {
        this.natal = LocalDate.of(2026, 12, 25);
        this.dataAtual = dataAtual;
    }

    public LocalDate getNatal() {
        return natal;
    }

    public void setNatal(LocalDate natal) {
        this.natal = natal;
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
