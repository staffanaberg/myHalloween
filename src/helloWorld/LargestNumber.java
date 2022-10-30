package helloWorld;

public class LargestNumber {

    public static void main(String[] args) {

        //Jämför två tal.
        //Spara två tal
        int first = 12;
        int second = 7;

        //Om det första är större än det andra
        if(first > second) {
            //skriv ut ”Första talet är störst”
            System.out.println("Första talet är störst");
        } else if (second > first){
            System.out.println("Andra talet är störst");
        } else {
            System.out.println("Talen är lika");
        }

        //om det är tvärt om
        //samt ”Andra talet är störst”
        //
        //Jämför två tal.
        //Om det första är jämt delbart med det andra skriv ut ”Jämt delbart”
        if(first%second==0) {
            System.out.println("Jämt delbart");
        } else {
            System.out.println("Inte jämt delbart");
        }


        //annars skriv ut ”Inte jämt delbart”




    }

}
