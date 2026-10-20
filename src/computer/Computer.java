package computer;

public class Computer {
    private String tipo;
    private String modeloProcessador;
    private int geracaoProcessador;
    private boolean overclock;
    private int memoriaRAM;
    private String quantMemoria;
    private String tipoMemoria;
    private String modeloPlacaVideo;
    private int quantPlacaVideo;
    private String sistemaOperacional;

    public Computer (Builder b) {
        this.tipo = b.tipo;
        this.modeloProcessador = b.modeloProcessador;
        this.geracaoProcessador = b.geracaoProcessador;
        this.overclock = b.overclock;
        this.memoriaRAM = b.memoriaRAM;
        this.quantMemoria = b.quantMemoria;
        this.tipoMemoria = b.tipoMemoria;
        this.modeloPlacaVideo = b.modeloPlacaVideo;
        this.quantPlacaVideo = b.quantPlacaVideo;
        this.sistemaOperacional = b.sistemaOperacional;
    }

    public static class Builder{
        private String tipo;
        private String modeloProcessador;
        private int geracaoProcessador;
        private boolean overclock;
        private int memoriaRAM;
        private String quantMemoria;
        private String tipoMemoria;
        private String modeloPlacaVideo;
        private int quantPlacaVideo;
        private String sistemaOperacional;

        public Builder tipo(String tipo){
            this.tipo = tipo;
            return this;
        }

        public Builder modeloProcessador(String modeloProcessador){
            this.modeloProcessador = modeloProcessador;
            return this;
        }

        public Builder geracaoProcessador(int geracaoProcessador){
            this.geracaoProcessador = geracaoProcessador;
            return this;
        }

        public Builder overclock(boolean overclock){
            this.overclock = overclock;
            return this;
        }

        public Builder memoriaRAM(int memoriaRAM){
            this.memoriaRAM = memoriaRAM;
            return this;
        }

        public Builder quantMemoria(String quantMemoria){
            this.quantMemoria = quantMemoria;
            return this;
        }

        public Builder tipoMemoria(String tipoMemoria){
            this.tipoMemoria = tipoMemoria;
            return this;
        }

        public Builder modeloPlacaVideo(String modeloPlacaVideo){
            this.modeloPlacaVideo = modeloPlacaVideo;
            return this;
        }

        public Builder quantPlacaVideo(int quantPlacaVideo){
            this.quantPlacaVideo = quantPlacaVideo;
            return this;
        }

        public Builder sistemaOperacional(String sistemaOperacional){
            this.sistemaOperacional = sistemaOperacional;
            return this;
        }

        public Computer build(){
            return new Computer(this);
        }
    }

    @Override
    public String toString() {
        return "Montando PC " + tipo +
                "\nModelo do Processador = " + modeloProcessador +
                ", \nGeração do Processador = " + geracaoProcessador +
                ", \nOverclock = " + overclock +
                ", \nMemoria RAM (GB)= " + memoriaRAM +
                ", \nQuantidade de Memoria = " + quantMemoria +
                ", \nTipo de Memoria = " + tipoMemoria +
                ", \nModelo da Placa de Video = " + modeloPlacaVideo +
                ", \nQuantidade de Memoria da Placa = " + quantPlacaVideo +
                ", \nSistema Operacional = " + sistemaOperacional + "\n";
    }


}

