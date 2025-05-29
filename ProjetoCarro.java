package projetocarro;

public class ProjetoCarro {

    public static void main(String[] args) {
        
        Carro c1 = new Carro();
        c1.nome = "UNO";
        c1.marca = "FIAT";
        c1.ano = 2015;
        c1.vel = 120;
        
        c1.acelerar(20);
        System.out.println("Velocidade: "+c1.vel+" KM");
        c1.freiar(45);
        System.out.println("Velocidade Apos Freio: "+c1.vel+" km");
        
        c1.buzinar();

        Carro c2 = new Carro();

        c2.nome = "CB 500X";
        c2.marca = "Honda";
        c2.ano = 2024;
        c2.vel = 150;

        c2.acelerar(30);
        System.out.println("Velocidade: "+c2.vel+" km/h");
        c2.freiar(25);
        System.out.println("Velocidade após freio: "+c2.vel+" km/h");

        c1.buzinarmoto();


    }
    
       
    
}
