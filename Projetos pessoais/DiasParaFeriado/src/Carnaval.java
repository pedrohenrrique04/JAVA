import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Carnaval {

    private LocalDate carnaval;
    private DataAtual dataAtual;
    private Long dias;

    public long quantosDiasFaltamCarnaval (){
        this.setDias(ChronoUnit.DAYS.between(this.getDataAtual().getDataNoFormatoChina(),this.getCarnaval()));
        return this.getDias();
    }

    public Carnaval(DataAtual dataAtual) {
        this.carnaval = LocalDate.of(2026, 2, 16);
        this.dataAtual = dataAtual;
    }

    public LocalDate getCarnaval() {
        return carnaval;
    }

    public void setCarnaval(LocalDate carnaval) {
        this.carnaval = carnaval;
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
