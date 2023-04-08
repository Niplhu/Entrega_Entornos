/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex.entornos;

import Exceptions.MaException;

/**
 *
 * @author Alex
 */
public class Empleat {

    public static final double SALARI_BASE_VENEDOR = 1000;
    public static final double SALARI_BASE_ENCARREGAT = 1500;
    public static final double PRIMA_VENDES_1000 = 100;
    public static final double PRIMA_VENDES_2500 = 200;
    public static final double PREU_HORA_EXTRA = 18.57;
    public static final double RETENCIO_0_999 = 0;
    public static final double RETENCIO_1000_1500 = 0.16;
    public static final double RETENCIO_1501 = 0.2;

    public double calculaSalariBrut(String tipusEmpleat, double vendesMes, int horesExtra) throws MaException {
        double salariBase = 0;

        if (tipusEmpleat == null || (!tipusEmpleat.equals("venedor") && !tipusEmpleat.equals("encarregat"))) {
            throw new MaException("el tipus de venedor no és correcte");
        }

        if (tipusEmpleat.equals("venedor")) {
            salariBase = SALARI_BASE_VENEDOR;
        } else if (tipusEmpleat.equals("encarregat")) {
            salariBase = SALARI_BASE_ENCARREGAT;
        }

        if (vendesMes < 0 || horesExtra < 0) {
            throw new MaException("el valor no pot ser negatiu");
        }

        double prima = 0;

        if (vendesMes >= 2500) {
            prima = PRIMA_VENDES_2500;
        } else if (vendesMes >= 1000) {
            prima = PRIMA_VENDES_1000;
        }

        double salariBrut = salariBase + prima + (horesExtra * PREU_HORA_EXTRA);

        return salariBrut;
    }

    public double calculaSalariNet(double salariBrut) throws MaException {
        if (salariBrut < 0) {
            throw new MaException("el valor no pot ser negatiu");
        }

        double retencio = 0;

        if (salariBrut >= 1501) {
            retencio = RETENCIO_1501;
        } else if (salariBrut >= 1000) {
            retencio = RETENCIO_1000_1500;
        } else {
            retencio = RETENCIO_0_999;
        }

        double salariNet = salariBrut * (1 - retencio);

        return salariNet;
    }


}
