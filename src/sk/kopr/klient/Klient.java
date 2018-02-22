package sk.kopr.klient;

public class Klient {

	public static void main(String[] args) throws PredmetExistuje_Exception {
		    Predmet predmet = new Predmet();
		    PredmetPort port = predmet.getPredmetPort();

		    PridajPredmetRequest request = new PridajPredmetRequest();
		    request.setNazovPredmetu("Statistika");

		    PridajPredmetResponse response = port.pridajPredmet(request);
		    System.out.println(response.getPredmetUUID());
		    

	}

}
