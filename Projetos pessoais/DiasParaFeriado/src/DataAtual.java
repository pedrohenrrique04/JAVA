import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DataAtual {
    private LocalDate dataNoFormatoChina;
    private DateTimeFormatter formato;
    private String dataAtual;

    public DataAtual() {
        this.dataNoFormatoChina = LocalDate.now();
        this.formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        this.dataAtual =  dataNoFormatoChina.format(formato);
    }

    public LocalDate getDataNoFormatoChina() {
        return dataNoFormatoChina;
    }

    public void setDataNoFormatoChina(LocalDate dataNoFormatoChina) {
        this.dataNoFormatoChina = dataNoFormatoChina;
    }

    public DateTimeFormatter getFormato() {
        return formato;
    }

    public void setFormato(DateTimeFormatter formato) {
        this.formato = formato;
    }

    public String getDataAtual() {
        return dataAtual;
    }

    public void setDataAtual(String dataAtual) {
        this.dataAtual = dataAtual;
    }
}