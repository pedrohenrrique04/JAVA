import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class AnoNovo {
    private DataAtual dataAtual;
    private LocalDate anoNovo;
    private long dias;

    public long quantosDiasFaltamAnoNovo (){
        this.setDias(ChronoUnit.DAYS.between(this.getDataAtual().getDataNoFormatoChina(),this.getAnoNovo()));
        return this.getDias();
    }

    public AnoNovo(DataAtual dataAtual) {
        this.dataAtual = dataAtual;
        this.anoNovo = LocalDate.of(2026,1,01);
    }

    public DataAtual getDataAtual() {
        return dataAtual;
    }

    public void setDataAtual(DataAtual dataAtual) {
        this.dataAtual = dataAtual;
    }

    public LocalDate getAnoNovo() {
        return anoNovo;
    }

    public void setAnoNovo(LocalDate anoNovo) {
        this.anoNovo = anoNovo;
    }

    public long getDias() {
        return dias;
    }

    public void setDias(long dias) {
        this.dias = dias;
    }
}