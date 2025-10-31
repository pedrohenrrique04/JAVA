import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class SextaFeiraSanta {
    private LocalDate sextaFeiraSanta;
    private DataAtual dataAtual;
    private long dias;

    public Long quantosDiasFaltamSextaFeiraSanta(){
        this.setDias(ChronoUnit.DAYS.between(this.getDataAtual().getDataNoFormatoChina(), this.sextaFeiraSanta));
        return this.getDias();
    }

    public SextaFeiraSanta(DataAtual dataAtual) {
        this.sextaFeiraSanta = LocalDate.of(2026,4,3);
        this.dataAtual = dataAtual;
    }

    public LocalDate getSextaFeiraSanta() {
        return sextaFeiraSanta;
    }

    public void setSextaFeiraSanta(LocalDate sextaFeiraSanta) {
        this.sextaFeiraSanta = sextaFeiraSanta;
    }

    public DataAtual getDataAtual() {
        return dataAtual;
    }

    public void setDataAtual(DataAtual dataAtual) {
        this.dataAtual = dataAtual;
    }

    public long getDias() {
        return dias;
    }

    public void setDias(long dias) {
        this.dias = dias;
    }
}
