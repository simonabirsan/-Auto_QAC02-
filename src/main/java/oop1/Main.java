package oop1;

public class Main {
    public static void main(String[] args) {
        //instantiere obiect tip pixuri
        Pixuri pixulVerdeGri=new Pixuri();
        //initializare atribute
        pixulVerdeGri.culoare="verde";
        pixulVerdeGri.culoarePasta="albastru";
        pixulVerdeGri.tip="gel";
        pixulVerdeGri.grosime=2;
        pixulVerdeGri.lungime=15;

        System.out.println(pixulVerdeGri.scrie());
        pixulVerdeGri.scrie("Primul meu obiect in Java");

        MathNew math = new MathNew();
        System.out.println("Suma:" + math.suma( 2,3));
        System.out.println("Diferenta:" + math.diferenta(3,2));
    }
}







