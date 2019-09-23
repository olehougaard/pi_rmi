package dk.via.server;

import dk.via.math.Pi;
import dk.via.math.PiResult;

import java.math.BigDecimal;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class PiServerImplementation extends UnicastRemoteObject implements PiServer {
    public PiServerImplementation() throws RemoteException {
        super();
    }

    public PiResult computePi(int digits) {
        long timeBefore = System.currentTimeMillis();
        BigDecimal pi = Pi.computePi(digits);
        long time = System.currentTimeMillis() - timeBefore;
        PiResult result = new PiResult(pi, time);
        return result;
    }
}
