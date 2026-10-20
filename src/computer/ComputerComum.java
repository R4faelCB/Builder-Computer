package computer;

public class ComputerComum {
    public Computer create(){

        return new Computer.Builder()
                .tipo("Comum")
                .modeloProcessador("Celeron Dual-Core")
                .geracaoProcessador(4500)
                .memoriaRAM(8)
                .quantMemoria("256GB")
                .tipoMemoria("Hard Disk")
                .sistemaOperacional("Linux")
                .build();
    }
}
