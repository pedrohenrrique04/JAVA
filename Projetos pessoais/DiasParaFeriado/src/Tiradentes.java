import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Tiradentes {

        private LocalDate tiradentes;
        private DataAtual dataAtual;
        private Long dias;

        public long quantosDiasFaltamTiradentes (){
            this.setDias(ChronoUnit.DAYS.between(this.getDataAtual().getDataNoFormatoChina(),this.getTiradentes()));
            return this.getDias();
        }

        public Tiradentes(DataAtual dataAtual) {
            this.tiradentes = LocalDate.of(2026, 4, 21);
            this.dataAtual = dataAtual;
        }

        public LocalDate getTiradentes() {
            return tiradentes;
        }

        public void setTiradentes(LocalDate tiradentes) {
            this.tiradentes = tiradentes;
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