package ro.ase.cts;

import ro.ase.cts.facade.DealerAuto;
import ro.ase.cts.proxy.Internet;
import ro.ase.cts.proxy.InternetProxy;

public class Main {

    public void conectareInternet(Internet c, String url){
        c.connectTo(url);
    }

    public static void main(String[] args) {

        //FACADE
        DealerAuto dealerAuto = new DealerAuto();

        System.out.println(dealerAuto.getDetailsMasinaClasica());
        System.out.println(dealerAuto.getDetailsMasinaElectrica());
        System.out.println();

        //PROXY
        Internet conexiune = new InternetProxy();
//        conexiune.connectTo("abc.com");
//        conexiune.connectTo("alturl.com");

        Main app = new Main();
        app.conectareInternet(conexiune,"abc.com");
    }
}
