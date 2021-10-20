public class Game {


    public static void main(String[] args) {

        Game game = new Game();
        int myMoney = game.goToTheBankGetMoney(456, 456789);
        System.out.println(myMoney);
        Person person = new Person();
        person.setName("Nobody");
        person.setAge(0);


        goToHell(person);
    }

    ///access modifier static
    int goToTheBankGetMoney(int pin, int accountNumber) {
        if ((pin == PramodAccountInfo.pin) && (accountNumber == PramodAccountInfo.accountNumber)) {
            return 5000;
        }
        return 0;
    }

    public static void goToHell(Person person) {
        System.out.println("I am going to hell with " + person.getName());
    }
}


