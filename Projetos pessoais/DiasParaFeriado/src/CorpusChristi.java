import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class CorpusChristi {

    private LocalDate corpusChristi;
    private DataAtual dataAtual;
    private Long dias;

    public long quantosDiasFaltamCorpusChristi() {
        this.setDias(ChronoUnit.DAYS.between(this.getDataAtual().getDataNoFormatoChina(), this.getCorpusChristi()));
        return this.getDias();
    }

    public CorpusChristi(DataAtual dataAtual) {
        this.corpusChristi = LocalDate.of(2026, 6, 4);
        this.dataAtual = dataAtual;
    }

    public LocalDate getCorpusChristi() {
        return corpusChristi;
    }

    public void setCorpusChristi(LocalDate corpusChristi) {
        this.corpusChristi = corpusChristi;
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
