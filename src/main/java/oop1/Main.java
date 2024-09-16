package oop1;

public class Main {
    public static void main(String[] args) {
        //instantiere obiect tip pixuri
        Pixuri pixulVerdeGri = new Pixuri();
        //initializare atribute
        pixulVerdeGri.culoare = "verde";
        pixulVerdeGri.culoarePasta = "albastru";
        pixulVerdeGri.tip = "gel";
        pixulVerdeGri.grosime = 2;
        pixulVerdeGri.lungime = 15;

        System.out.println(pixulVerdeGri.scrie());
        pixulVerdeGri.scrie("Primul meu obiect in Java");

        MathNew math = new MathNew();
        System.out.println("Suma:" + math.suma(2, 3));
        System.out.println("Diferenta:" + math.diferenta(3, 2));
        System.out.println("-------------------------------------------------");
//       aplelare metoda statica dintr-o clasa
        Draw.drawFullShape(3, 2);
        System.out.println("-------------------------------------------------");
        Draw.drawShapeOutline(7, 8);
        Draw.drawSquare(5);
        System.out.println("-------------------------------------------------");
//        constructor custom
    }
}







