public class main {
    public static void main(String[] args) {
        if (args.length > 0) {
            // Получаем значение первого аргумента
            String input = args[0];

            // Сравниваем значение с "1234"
            if (input.equals("1234")) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        } else {
            // Если аргументы командной строки отсутствуют
            System.out.println("Parameter not found.");
        }
    }
}
