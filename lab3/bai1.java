package lab3;

import java.util.Scanner;

public class bai1 {
    class Point2d {
        private float x;
        private float y;

        public Point2d() {

        }

        public Point2d(float x, float y) {
            this.x = x;
            this.y = y;
        }

        public float getX() {
            return x;
        }

        public float getY() {
            return y;
        }

    }

    class Triangle {
        private float width;
        private float hegth;

        public Triangle() {

        }

        public Triangle(float width, float hegth) {
            this.hegth = hegth;
            this.width = width;
        }

        public float getWidth() {
            return width;
        }

        public float getHegth() {
            return hegth;
        }

        public void setWidth(float width) {
            this.width = width;
        }

        public void setHegth(float hegth) {
            this.hegth = hegth;
        }

        @Override
        public String toString() {
            return this.width + "," + this.hegth;
        }
    }

    class Fraction {
        private int numeration;
        private int denominator;

        public Fraction() {

        }

        public Fraction(int num, int den) {
            this.denominator = den;
            this.numeration = num;
        }

        public int getDenominator() {
            return denominator;
        }

        public int getNumeration() {
            return numeration;
        }

        public Fraction(float Fraction) {

        }

        public float Factionadd(float Fraction){
            return this.numeration+this.denominator;
        }

        public float Fractionsub(float Fraction){
            return this.numeration-this.denominator;

        }

        public float Fractionmul(float Fraction){
            return this.numeration*this.denominator;
            
        }

        public float Fractiondiv(float Fraction){
            return this.numeration*this.denominator;
            
        }

    }
}
