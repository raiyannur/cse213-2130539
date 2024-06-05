package com.cse213l.practice.complexnoprojectsec6;

public class ComplexNo {
    int real,img;

    public ComplexNo() {
        real=img=0;
    }

    public ComplexNo(int real) {
        this.real = real;
        this.img = 0;
    }

    public ComplexNo(int real, int img) {
        this.real = real;
        this.img = img;
    }

    public int getReal() {
        return real;
    }

    public int getImg() {
        return img;
    }

    public void setReal(int real) {
        this.real = real;
    }

    public void setImg(int img) {
        this.img = img;
    }

    @Override
    public String toString() {
        String sign="";
        if(img>=0) sign = "+";
        return real + sign + img + "i";
    }

    void add(){

    }

    void subtract(){

    }
}


}
