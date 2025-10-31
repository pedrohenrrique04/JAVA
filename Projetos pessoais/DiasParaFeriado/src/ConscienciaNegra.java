import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ConscienciaNegra {

    private LocalDate conscienciaNegra;
    private DataAtual dataAtual;
    private Long dias;

    public long quantosDiasFaltamConscienciaNegra() {
        this.setDias(ChronoUnit.DAYS.between(this.getDataAtual().getDataNoFormatoChina(), this.getConscienciaNegra()));
        return this.getDias();
    }

    public ConscienciaNegra(DataAtual dataAtual) {
        this.conscienciaNegra = LocalDate.of(2026, 11, 20);
        this.dataAtual = dataAtual;
    }

    public LocalDate getConscienciaNegra() {
        return conscienciaNegra;
    }

    public void setConscienciaNegra(LocalDate conscienciaNegra) {
        this.conscienciaNegra = conscienciaNegra;
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
