public class Main {
    public static void main(String[] args) {

        //polimorfismo de sobreposicao acontece quando substituimos  um metodo de uma superclasse na sua subclasse, unsando a mesma assinatura.

        //Mamifero m = new Mamifero();
        //Reptil r = new Reptil();
        //Peixe p = new Peixe();
        //Ave a = new Ave();

        //m.setPeso(85.3f);
        //m.setIdade(2);
        //m.setMembros(4);
        //m.locomover();
        //m.alimentar();
        //m.emitirSom();

        //p.setPeso(0.35f);
        //p.setIdade(1);
        //p.setMembros(0);
        //p.locomover();
        //p.alimentar();
        //p.emitirSom();

       // a.setPeso(0.85f);
       // a.setIdade(2);
       // a.setMembros(2);
       // a.locomover();
       // a.alimentar();
       // a.emitirSom();

        Mamifero m = new Mamifero();
        Canguru c = new Canguru();
        Cachorro k = new Cachorro();

        m.setPeso(85.3f);
        m.setIdade(8);
        m.setMembros(4);
        m.locomover();
        m.alimentar();
        m.emitirSom();

        c.setPeso(5.3f);
        c.setIdade(2);
        c.setMembros(4);
        c.locomover();
        c.alimentar();
        c.emitirSom();

        k.setPeso(15.3f);
        k.setIdade(3);
        k.setMembros(4);
        k.locomover();
        k.alimentar();
        k.emitirSom();
    }
}