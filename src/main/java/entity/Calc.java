package entity;

import java.util.Objects;

public class Calc {
    private String act;
    private double num1;
    private double num2;

    public Calc(String act, double num1, double num2) {
        this.act = act;
        this.num1 = num1;
        this.num2 = num2;
    }

    public Calc() {
    }

    public String getAct() {
        return act;
    }

    public void setAct(String act) {
        this.act = act;
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Calc calc = (Calc) o;
        return num1 == calc.num1 && num2 == calc.num2;
    }

    @Override
    public int hashCode() {
        return Objects.hash(num1, num2);
    }

    public double operation () {
        switch (act){
            case "sum": return num1 + num2;
            case "mult": return num1 * num2;
            case "del": return num1 / num2;
            case "dev": return num1 - num2;
        }
        return 0;
    }
}
