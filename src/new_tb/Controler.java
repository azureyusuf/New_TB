/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package new_tb;

/**
 *
 * @author Azure
 */
public abstract class Controler {

    void Header(String Masukan) {
        System.out.println("Halaman " + Masukan);
    }

    abstract void KondisiRuang();

    abstract void Sarana();

    abstract void Kebersihan();

    abstract void Kenyamanan();

    abstract void Keamanan();
}
