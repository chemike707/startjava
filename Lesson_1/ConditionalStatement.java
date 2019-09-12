public class ConditionalStatement {
    public static void main(String[] args) {
        int vozrast = 21;
        char pol = 'W';
        char nameword = 'M';    
        float rost = 1.70F;
        if(vozrast > 20) {
            System.out.println("Вы старше 20");
         }         
        if(pol == 'M') {
             System.out.println("Вы мужчина");
        }         
        if(pol == 'W') {
            System.out.println("Вы женщина");
        }
        if(rost < 1.80) {
            System.out.println("Коротышка");
        } else{
            System.out.println("Высокий");
        }
        if(nameword == 'M') {
            System.out.println("Ты наверное Михаил");
        } else if(nameword == 'I') {
            System.out.println("Ты наверное Iван");
        } else{
            System.out.println("Мы не знаем кто ты");
        }
    }
}