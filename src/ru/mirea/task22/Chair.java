package ru.mirea.task22;

import java.util.Scanner;

public interface Chair {
    void Description();
}

class ChairClient{
    public void congratulation(){
        System.out.println("Поздравляю!");
    }
}

enum ChairType{
    VICTORIAN_CHAIR,
    MULTIFUNCTIONAL_CHAIR,
    MAGIC_CHAIR
}

class VictorianChair extends ChairClient implements Chair{
    @Override
    public void Description() {
        System.out.println("Вы сидите на викторианском стуле");
        VictorianChair victorianChair = new VictorianChair();
        victorianChair.congratulation();
    }
}
class MultifunctionalChair extends ChairClient implements Chair{
    @Override
    public void Description() {
        System.out.println("Вы сидите на многофункциональном стуле");
    }
}
class MagicChair extends ChairClient implements Chair{
    @Override
    public void Description() {
        System.out.println("Вы сидите на магическом стуле");
    }
}

class ChairFactory {
    public ChairClient chooseChair(ChairType type){
        ChairClient chairClient = null;
        switch (type){
            case VICTORIAN_CHAIR: {
                chairClient = new VictorianChair();
                break;
            }
            case MULTIFUNCTIONAL_CHAIR: {
                chairClient = new MultifunctionalChair();
                break;
            }
            case MAGIC_CHAIR: {
                chairClient = new MagicChair();
                break;
            }
        }
        return chairClient;
    }
}

class Client{
    public void Sit(ChairType type){
        ChairFactory chairFactory = new ChairFactory();
        chairFactory.chooseChair(type);
    }

    public static void main(String[] args) {
        System.out.println("Какой нужен стул?");
        Scanner scanner = new Scanner(System.in);
        String chair = scanner.next();
        switch (chair){
            case "Викторианский":{
                Client client = new Client();
                client.Sit(ChairType.VICTORIAN_CHAIR);
                break;
            }
            case "Многофункциональный":{
                Client client = new Client();
                client.Sit(ChairType.MULTIFUNCTIONAL_CHAIR);
                break;
            }
            case "Магический":{
                Client client = new Client();
                client.Sit(ChairType.MAGIC_CHAIR);
                break;
            }
        }
    }
}

