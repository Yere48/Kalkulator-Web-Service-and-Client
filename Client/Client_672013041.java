/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package client_672013041;

/**
 *
 * @author USER
 */
public class Client_672013041 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hasil Penjumlahan : "+ tambah(5, 10));
        System.out.println("Hasil Penjumlahan : "+ kurang(10, 5));
        System.out.println("Hasil Penjumlahan : "+ kali(5, 10));
        System.out.println("Hasil Penjumlahan : "+ bagi(10, 3));
        System.out.println("Hasil Penjumlahan : "+ mod(11, 3));
    }

    private static Integer tambah(int a, int b) {
        ws.Service_Service service = new ws.Service_Service();
        ws.Service port = service.getServicePort();
        return port.tambah(a, b);
    }

    private static Integer kurang(int a, int b) {
        ws.Service_Service service = new ws.Service_Service();
        ws.Service port = service.getServicePort();
        return port.kurang(a, b);
    }

    private static Integer kali(int a, int b) {
        ws.Service_Service service = new ws.Service_Service();
        ws.Service port = service.getServicePort();
        return port.kali(a, b);
    }

    private static Double bagi(double a, double b) {
        ws.Service_Service service = new ws.Service_Service();
        ws.Service port = service.getServicePort();
        return port.bagi(a, b);
    }

    private static Integer mod(int a, int b) {
        ws.Service_Service service = new ws.Service_Service();
        ws.Service port = service.getServicePort();
        return port.mod(a, b);
    }
    
    
}
