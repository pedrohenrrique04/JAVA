import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class SeteDeSetembro {

    private LocalDate seteDeSetembro;
    private DataAtual dataAtual;
    private Long dias;

    public long quantosDiasFaltamSeteDeSetembro() {
        this.setDias(ChronoUnit.DAYS.between(this.getDataAtual().getDataNoFormatoChina(), this.getSeteDeSetembro()));
        return this.getDias();
    }

    public SeteDeSetembro(DataAtual dataAtual) {
        this.seteDeSetembro = LocalDate.of(2026, 9, 7);
        this.dataAtual = dataAtual;
    }

    public LocalDate getSeteDeSetembro() {
        return seteDeSetembro;
    }

    public void setSeteDeSetembro(LocalDate seteDeSetembro) {
        this.seteDeSetembro = seteDeSetembro;
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