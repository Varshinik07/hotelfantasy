package coffeshop;

public class FoodItems {
    int BlackCoffee;
    int BlackTea;
    int  Tea;
    int Cake;
    int Coffee;
    int Vada;

    public int getBlackCoffee() {
        return BlackCoffee;
    }

    public void setBlackCoffee(int blackCoffee) {
        BlackCoffee = blackCoffee;
    }

    public int getBlackTea() {
        return BlackTea;
    }

    public void setBlackTea(int blackTea) {
        BlackTea = blackTea;
    }

    public int getTea() {
        return Tea;
    }

    public void setTea(int tea) {
        Tea = tea;
    }

    public int getCake() {
        return Cake;
    }

    public void setCake(int cake) {
        Cake = cake;
    }

    public int getCoffee() {
        return Coffee;
    }

    public void setCoffee(int coffee) {
        Coffee = coffee;
    }

    public int getVada() {
        return Vada;
    }

    public void setVada(int vada) {
        Vada = vada;
    }

    public FoodItems(int blackCoffee, int blackTea, int tea, int cake, int coffee, int vada) {
        BlackCoffee = blackCoffee;
        BlackTea = blackTea;
        Tea = tea;
        Cake = cake;
        Coffee = coffee;
        Vada = vada;
    }


}
