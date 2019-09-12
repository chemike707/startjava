public class ConditionalStatement {
    public static void main(String[] args) {
        int yourAge = 21;        
        if(yourAge > 20) {
            System.out.println("Вы старше 20");
         }  
        
        boolean youMale = true;            
        if(youMale) {
             System.out.println("Вы мужчина");
        } 

        boolean youWoman = true;            
        if(youWoman) {
             System.out.println("Вы женщина");
        } 
        
        float yourHeight = 1.70F;
        if(yourHeight < 1.80) {
            System.out.println("Коротышка");
        } else{
            System.out.println("Высокий");
        }
        
        char nameWord = 'M';
        if(nameWord == 'M') {
            System.out.println("Ты наверное Михаил");
        } else if(nameWord == 'I') {
            System.out.println("Ты наверное Iван");
        } else{
            System.out.println("Мы не знаем кто ты");
        }
    }
}