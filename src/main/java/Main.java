import ru.netology.services.MoneyService;

public class Main {
    public static void main(String[] args) {

        MoneyService service = new MoneyService();
        System.out.println(service.calculate(100000, 60000, 150000));
    }
 }
