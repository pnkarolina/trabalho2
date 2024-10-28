package entity;

public class Calculadora {

    private int num1;
    private int num2;

    public Calculadora(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int some(int num1, int num2) {
        return num1 + num2;
    }

    public int subtraia(int num1, int num2) {
        return num1 - num2;
    }

    public int divida(int num1, int num2) {
        if(num1 != 0 && num2 != 0){
            return num1 / num2;
        }
            throw new ArithmeticException("Divisão não permite ser igual a zero!");
    }

    public int multiplique(int num1, int num2) {
        return num1 * num2;
    }
}
