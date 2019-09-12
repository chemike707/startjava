public class Variable {
    public static void main(String[] args) {
        char processoramd = 'A';        
        short model = 8350;        
        byte tdp = 125;
        long cores = 8;
        int frequency = 4357;
        float voltage = 0.92f;
        double processorweight = 0.605;
        boolean processor = model == 8350;
        
        System.out.println("Процессор - " + processoramd);
        System.out.println("Модель - " + model); 
        System.out.println("Тепловыделение - " + tdp);
        System.out.println("Ядра - " + cores);
        System.out.println("Частота - " + frequency);
        System.out.println("Вольтаж - " + voltage);
        System.out.println("Вес процессора - " + processorweight);
        System.out.println(processor);       
    }
}