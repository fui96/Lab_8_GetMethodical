public class CtoFTableDisplay {

    public static void main(String[] args) {
        System.out.printf("%120s", "Celcius to Farenheit");
        System.out.println();
        for(double i = -100; i <= 100; i++){
            double Farenhiet = 0.0;
            Farenhiet = CtoF(i);

            System.out.printf("%27.2fC %10.2fF", i ,Farenhiet);
            if(i % 5 == 0 && i != -100){
            System.out.println();
}
        }
    }


    public static double CtoF(Double Celcius){
        Double RetFarenheit = 0.0;
        RetFarenheit = Celcius * 1.8 + 32;
        return RetFarenheit;
    }
}
