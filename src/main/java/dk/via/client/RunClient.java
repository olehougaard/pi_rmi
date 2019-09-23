package dk.via.client;

import dk.via.math.PiResult;
import dk.via.server.PiServer;

import java.math.BigDecimal;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RunClient {
    public static void main(String[] args) throws RemoteException, NotBoundException {
        Registry registry = LocateRegistry.getRegistry(1099);
        PiServer remote = (PiServer) registry.lookup("PiServer");
        PiResult result = remote.computePi(100);
        BigDecimal pi = result.getPi();
        long time = result.getTimeMs();
        System.out.println(pi);
        System.out.println(time);
    }
}
