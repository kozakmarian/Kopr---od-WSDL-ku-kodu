package sk.kopr.server;

import javax.jws.WebService;

@WebService(endpointInterface="sk.kopr.server.PredmetPort",
targetNamespace="http://localhost:8888/AJS?wsdl",
serviceName="Predmet",
portName="PredmetPort",
wsdlLocation="./AJS.wsdl")
public class ImplementaciaPredmetPort{

	public PridajPredmetResponse pridajPredmet(PridajPredmetRequest parameters) throws PredmetExistuje_Exception {
		PridajPredmetResponse ppr = new PridajPredmetResponse();
		String uuid = ObjectFactoryDao.INSTANCE.getPredmetDao().pridajPredmet(parameters.getNazovPredmetu());
		ppr.setPredmetUUID(uuid);
		return ppr;
	}
	
}
