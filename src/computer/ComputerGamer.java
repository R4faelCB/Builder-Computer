package computer;

public class ComputerGamer {
    public Computer create(){
        
        return new Computer.Builder()
                .tipo("Gamer")
                .modeloProcessador("I9-14420H")
                .geracaoProcessador(14)
                .overclock(true)
                .memoriaRAM(16)
                .quantMemoria("2TB")
                .tipoMemoria("NVME m2")
                .modeloPlacaVideo("RTX 5060")
                .quantPlacaVideo(16)
                .sistemaOperacional("Windows 11")
                .build();
    }
}
