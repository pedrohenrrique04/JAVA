import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Finados {

    private LocalDate finados;
    private DataAtual dataAtual;
    private Long dias;

    public long quantosDiasFaltamFinados() {
        this.setDias(ChronoUnit.DAYS.between(this.getDataAtual().getDataNoFormatoChina(), this.getFinados()));
        return this.getDias();
    }

    public Finados(DataAtual dataAtual) {
        this.finados = LocalDate.of(2026, 11, 2);
        this.dataAtual = dataAtual;
    }

    public LocalDate getFinados() {
        return finados;
    }

    public void setFinados(LocalDate finados) {
        this.finados = finados;
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
